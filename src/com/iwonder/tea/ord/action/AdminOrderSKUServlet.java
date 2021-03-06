package com.iwonder.tea.ord.action;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.constant.DictConstant;
import com.iwonder.tea.dictionary.entity.DictionarySKU;
import com.iwonder.tea.dictionary.service.IDictionarySKUService;
import com.iwonder.tea.dictionary.service.imp.DictionarySKUServiceImp;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.ord.entity.OrderSKU;
import com.iwonder.tea.ord.service.IOrderSKUService;
import com.iwonder.tea.ord.service.IOrderService;
import com.iwonder.tea.ord.service.imp.OrderSKUServiceImp;
import com.iwonder.tea.ord.service.imp.OrderServiceImp;
import com.iwonder.tea.ord.view.OrderConditionView;
import com.iwonder.tea.ord.view.OrderQueryView;
import com.iwonder.tea.ord.view.OrderSKUConditionView;
import com.iwonder.tea.ord.view.OrderSKUQueryView;
import com.iwonder.tea.prd.service.IProductSkuService;
import com.iwonder.tea.prd.service.imp.ProductSkuServiceImp;
import com.iwonder.tea.prd.view.ProductSkuConditionView;
import com.iwonder.tea.prd.view.ProductSkuQueryView;

/**
 * Servlet implementation class AdminOrderSKUServlet
 */
@WebServlet("/admin/order/AdminOrderSKUServlet.do")

public class AdminOrderSKUServlet extends BaseServlet {

	private IOrderSKUService orderSKUService = (IOrderSKUService) ProxyServiceFactory
			.getProxyService(OrderSKUServiceImp.class);;
	private IOrderService orderService = (IOrderService) ProxyServiceFactory.getProxyService(OrderServiceImp.class);
	private IProductSkuService productSkuService = (IProductSkuService) ProxyServiceFactory
			.getProxyService(ProductSkuServiceImp.class);
	private IDictionarySKUService iDictionarySKUService = (IDictionarySKUService) ProxyServiceFactory
			.getProxyService(DictionarySKUServiceImp.class);
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminOrderSKUServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doGet(request, response);
	}

	@SuppressWarnings("unused")
	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 根据业务逻辑，查询数据
		String orderDtlCode = request.getParameter("orderDtlCode");
		String orderId = request.getParameter("orderId");
		String productSkuId = request.getParameter("productSkuId");
		String price1 = request.getParameter("price");
		BigDecimal price = StringUtil.parseBigDecimal(price1);
		String amount1 = request.getParameter("amount");
		Integer amount = StringUtil.Integer(amount1);
		String sendStat = request.getParameter("sendStat");
		String sendDate1 = request.getParameter("sendDate");
		Date sendDate = StringUtil.parseDate(sendDate1);
		String logDoing = request.getParameter("logDoing");
		String logDone = request.getParameter("logDone");
		String signStat = request.getParameter("signStat");
		String signDate1 = request.getParameter("signDate");
		Date signDate = StringUtil.parseDate(signDate1);
		String evalStat = request.getParameter("evalStat");
		String evalDate1 = request.getParameter("evalDate");
		Date evalDate = StringUtil.parseDate(evalDate1);
		OrderSKUConditionView orderSKUConditionView = new OrderSKUConditionView();
		orderSKUConditionView.setOrderDtlCode(orderDtlCode);
		orderSKUConditionView.setOrderId(orderId);
		orderSKUConditionView.setProductSkuId(productSkuId);
		orderSKUConditionView.setPrice(price);
		orderSKUConditionView.setAmount(amount);
		orderSKUConditionView.setSendStat(sendStat);
		orderSKUConditionView.setSendDate(sendDate);
		orderSKUConditionView.setLogDoing(logDoing);
		orderSKUConditionView.setLogDone(logDone);
		orderSKUConditionView.setSendStat(sendStat);
		orderSKUConditionView.setSendDate(sendDate);
		orderSKUConditionView.setEvalStat(evalStat);
		orderSKUConditionView.setEvalDate(evalDate);
		
		
		  
		ArrayList<DictionarySKU> listSendStatSKU = iDictionarySKUService.findByDictCode(DictConstant.SEND_STATUS);
		ArrayList<DictionarySKU> listLogDoneSKU = iDictionarySKUService.findByDictCode(DictConstant.LOG_DONE);
		ArrayList<DictionarySKU> listSignStatSKU = iDictionarySKUService.findByDictCode(DictConstant.SIGN_STATUS);
		ArrayList<DictionarySKU> listEvalStatSKU = iDictionarySKUService.findByDictCode(DictConstant.EVAL_STATUS);
		request.setAttribute("listSendStatSKU", listSendStatSKU);
		request.setAttribute("listLogDoneSKU", listLogDoneSKU);
		request.setAttribute("listSignStatSKU", listSignStatSKU);
		request.setAttribute("listEvalStatSKU", listEvalStatSKU);

		ArrayList<OrderSKUQueryView> arr = orderSKUService.list(orderSKUConditionView);
		// 传递对象数据
		request.setAttribute("arr1", arr);
		System.out.println(arr.toString());
		System.out.println("执行这里");
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/order/orderSKU_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// s1.取参数
		String orderDtlId = request.getParameter("orderDtlId");
		orderSKUService.delete(orderDtlId);
		// s3.页面跳转：重定向
		response.sendRedirect("AdminOrderSKUServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数

		String orderDtlId = request.getParameter("orderDtlId");
		OrderSKU orderSKU = new OrderSKU();

		// 根据studentId是否为空判断是新增还是修改的编辑

		OrderConditionView user = new OrderConditionView();
		// 根据studentId是否为空判断是新增还是修改的编辑
		ArrayList<OrderQueryView> listOrder = orderService.list(user);
		ProductSkuConditionView product = new ProductSkuConditionView();
		ArrayList<ProductSkuQueryView> listProductSKU = productSkuService.list(product);
		request.setAttribute("listOrder", listOrder);
		request.setAttribute("listProductSKU", listProductSKU);
		ArrayList<DictionarySKU> listSendStatSKU = iDictionarySKUService.findByDictCode(DictConstant.SEND_STATUS);
		ArrayList<DictionarySKU> listLogDoneSKU = iDictionarySKUService.findByDictCode(DictConstant.LOG_DONE);
		ArrayList<DictionarySKU> listSignStatSKU = iDictionarySKUService.findByDictCode(DictConstant.SIGN_STATUS);
		ArrayList<DictionarySKU> listEvalStatSKU = iDictionarySKUService.findByDictCode(DictConstant.EVAL_STATUS);
		request.setAttribute("listSendStatSKU", listSendStatSKU);
		request.setAttribute("listLogDoneSKU", listLogDoneSKU);
		request.setAttribute("listSignStatSKU", listSignStatSKU);
		request.setAttribute("listEvalStatSKU", listEvalStatSKU);

		if (StringUtil.isEmpty(orderDtlId)) {// 新增
			System.out.println("id为空 edit");
		} else {// 修改
			// S2.业务逻辑操作
			System.out.println(orderDtlId);
			System.out.println("id不为空 EdiT");

			orderSKU = orderSKUService.load(orderDtlId);

			request.setAttribute("orderSKU", orderSKU);
			request.setAttribute("orderId", orderSKU.getOrderId());
			request.setAttribute("productSkuId", orderSKU.getProductSkuId());

			request.setAttribute("sendStat", orderSKU.getSendStat());
			request.setAttribute("logDone", orderSKU.getLogDone());
			request.setAttribute("signStat", orderSKU.getSignStat());
			request.setAttribute("evalStat", orderSKU.getEvalStat());
		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/order/orderSKU_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String orderDtlId = request.getParameter("orderDtlId");
		String orderDtlCode = request.getParameter("orderDtlCode");
		String orderId = request.getParameter("orderId");
		String productSkuId = request.getParameter("productSkuId");
		String price1 = request.getParameter("price");
		BigDecimal price = StringUtil.parseBigDecimal(price1);
		String amount1 = request.getParameter("amount");
		Integer amount = StringUtil.Integer(amount1);
		String sendStat = request.getParameter("sendStat");
		String sendDate1 = request.getParameter("sendDate");
		Date sendDate = StringUtil.parseDate(sendDate1);
		String logDoing = request.getParameter("logDoing");
		String logDone = request.getParameter("logDone");
		String signStat = request.getParameter("signStat");
		String signDate1 = request.getParameter("signDate");
		Date signDate = StringUtil.parseDate(signDate1);
		String evalStat = request.getParameter("evalStat");
		String evalDate1 = request.getParameter("evalDate");
		Date evalDate = StringUtil.parseDate(evalDate1);
		OrderSKU orderSKU = new OrderSKU();
		orderSKU.setOrderDtlId(orderDtlId);
		orderSKU.setOrderDtlCode(orderDtlCode);
		orderSKU.setOrderId(orderId);
		orderSKU.setProductSkuId(productSkuId);
		orderSKU.setPrice(price);
		orderSKU.setAmount(amount);
		orderSKU.setSendStat(sendStat);
		orderSKU.setSendDate(sendDate);
		orderSKU.setLogDoing(logDoing);
		orderSKU.setLogDone(logDone);
		orderSKU.setSignStat(signStat);
		orderSKU.setSignDate(signDate);
		orderSKU.setEvalStat(evalStat);
		orderSKU.setEvalDate(evalDate);
		System.out.println(orderSKU.toString());
		// 根据studentId是否为空判断是新增还是修改的编辑
		if (StringUtil.isEmpty(orderDtlId)) {// 新增
			System.out.println("新增保存:" + orderDtlId);
			orderSKUService.insert(orderSKU);
			System.out.println("id为空啊");
		} else {// 修改
			// S2.业务处理：调数据库,略
			orderSKUService.update(orderSKU);
		}
		// S3.页面跳转：重定向
		response.sendRedirect("AdminOrderSKUServlet.do?method=list");

	}

}
