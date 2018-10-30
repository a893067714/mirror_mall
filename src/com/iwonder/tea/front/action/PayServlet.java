package com.iwonder.tea.front.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.constant.DictConstant;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.ord.entity.Order;
import com.iwonder.tea.ord.service.IOrderService;
import com.iwonder.tea.ord.service.imp.OrderServiceImp;
import com.iwonder.tea.usr.entity.UserInfo;

@WebServlet("/PayServlet.do")
public class PayServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private IOrderService orderService = (IOrderService) ProxyServiceFactory.getProxyService(OrderServiceImp.class);

	public PayServlet() {
		super();
	}

	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
		System.out.println(userInfo.toString());
		request.setAttribute("listUserInfo", userInfo);
		String sumPrice = request.getParameter("sumPrice");
		String productSkuId = request.getParameter("productSkuId");
		request.setAttribute("sumPrice", sumPrice);
		request.setAttribute("productSkuId", productSkuId);
		request.getRequestDispatcher("/WEB-INF/jsp/front/pay.jsp").forward(request, response);
	}

	protected void immediatePay(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String orderId = request.getParameter("orderId");
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
		Order order = orderService.load(orderId);
		order.setPayStat(DictConstant.PAY_STATUS_ALREADY_PAY);
		orderService.update(order);
		// request.getRequestDispatcher("OrderServlet.do?method=list").forward(request,
		// response);
		response.sendRedirect("OrderServlet.do?method=list");
	}
}