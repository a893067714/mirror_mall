package com.iwonder.tea.front.action;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.cart.service.ICartService;
import com.iwonder.tea.cart.service.imp.CartServiceImp;
import com.iwonder.tea.cart.view.CartQueryView;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.framework.util.UUIDUtils;
import com.iwonder.tea.ord.entity.Order;
import com.iwonder.tea.ord.entity.OrderSKU;
import com.iwonder.tea.ord.service.IOrderSKUService;
import com.iwonder.tea.ord.service.IOrderService;
import com.iwonder.tea.ord.service.imp.OrderSKUServiceImp;
import com.iwonder.tea.ord.service.imp.OrderServiceImp;
import com.iwonder.tea.ord.view.OrderView;
import com.iwonder.tea.usr.entity.UserInfo;
import com.mysql.jdbc.StringUtils;

@WebServlet("/OrderServlet.do")
public class OrderServlet extends BaseServlet implements Serializable {
	private static final long serialVersionUID = 1L;
	private ICartService cartService = (ICartService) ProxyServiceFactory.getProxyService(CartServiceImp.class);

	private IOrderSKUService orderSKUService = (IOrderSKUService) ProxyServiceFactory
			.getProxyService(OrderSKUServiceImp.class);
	private IOrderService orderService = (IOrderService) ProxyServiceFactory.getProxyService(OrderServiceImp.class);

	@SuppressWarnings("unused")
	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
		userInfo.getUserId();
		System.out.println(userInfo.getUserId());
		ArrayList<OrderView> orderViews = orderService.listView(userInfo.getUserId());
		request.setAttribute("orderViews", orderViews);
		System.out.println("执行这里");
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/front/order.jsp").forward(request, response);
	}

	protected void delOrderSKU(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// s1.取参数
		String orderDtlId = request.getParameter("orderDtlId");
		System.out.println(orderDtlId);
		orderSKUService.delete(orderDtlId);
		response.sendRedirect("OrderServlet.do?method=list");
		// request.getRequestDispatcher("/WEB-INF/jsp/front/order.jsp").forward(request,
		// response);
	}

	protected void delOrder(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// s1.取参数
		String orderId = request.getParameter("orderId");
		System.out.println(orderId);
		try {
			orderSKUService.deleteByOrderId(orderId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			orderService.delete(orderId);
		}

		response.sendRedirect("OrderServlet.do?method=list");
		// request.getRequestDispatcher("/WEB-INF/jsp/front/order.jsp").forward(request,
		// response);
	}

	protected void addOrderAndOrderSKU(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// s1.取参数
		String[] productSkuIdArr = request.getParameterValues("productSkuId");
		String[] cartIdArr = request.getParameterValues("cartId");
		String totalPriceGetbypage = request.getParameter("totalPrice");

		// 创建大订单
		String addressId = request.getParameter("addressId");
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
		String orderCode = System.currentTimeMillis() + UUIDUtils.getUUID8();
		Order order = new Order();
		order.setOrderCode(orderCode);
		order.setUserId(userInfo.getUserId());
		order.setAddressId(addressId);
		order.setCreateDate(new Date());
		order.setTotalPrice(StringUtil.parseBigDecimal(totalPriceGetbypage));
		order.setPayStat("no_pay");
		order.setPayDate(new Date());
		Order orderReturn = orderService.insert(order);
		// 创建大订单的小订单
		BigDecimal totalPrice = new BigDecimal(0);
		for (String cartId : cartIdArr) {
			CartQueryView cartQueryView = cartService.loadCart(cartId);
			// 计算总价,用于后面校验
			BigDecimal temp = new BigDecimal(cartQueryView.getQuantity());
			totalPrice = totalPrice.add(temp.multiply(cartQueryView.getPriceCurrent()));
			// 计算总价end
			// 创建小订单,并且赋值
			OrderSKU orderSKU = new OrderSKU();
			String orderDtlCode = System.currentTimeMillis() + UUIDUtils.getUUID8();
			orderSKU.setOrderId(orderReturn.getOrderId());
			orderSKU.setOrderDtlCode(orderDtlCode);
			orderSKU.setProductSkuId(cartQueryView.getProductSkuId());
			orderSKU.setPrice(cartQueryView.getPriceCurrent());
			orderSKU.setAmount(cartQueryView.getQuantity());
			orderSKU.setSendStat("no_send");
			orderSKU.setSendDate(new Date());
			orderSKU.setSignStat("no_sign");
			orderSKU.setSignDate(new Date());
			orderSKU.setLogDoing("顺丰");
			orderSKU.setLogDone("no_done");
			orderSKU.setEvalStat("no_eval");
			orderSKU.setEvalDate(new Date());
			orderSKUService.insert(orderSKU);
		}
		request.setAttribute("userInfo", userInfo);
		request.setAttribute("order", order);
		request.getRequestDispatcher("PayServlet.do?method=list").forward(request, response);
		// response.sendRedirect("OrderServlet.do?method=list");
		// request.getRequestDispatcher("/WEB-INF/jsp/front/order.jsp").forward(request,
		// response);
	}
}