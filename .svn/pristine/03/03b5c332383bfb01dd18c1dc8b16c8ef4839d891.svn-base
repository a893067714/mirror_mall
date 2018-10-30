package com.iwonder.tea.ord.action;

import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

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

import com.iwonder.tea.ord.dao.imp.OrderDaoImp;
import com.iwonder.tea.ord.entity.Order;
import com.iwonder.tea.ord.service.IOrderService;
import com.iwonder.tea.ord.service.imp.OrderServiceImp;
import com.iwonder.tea.ord.view.OrderConditionView;
import com.iwonder.tea.ord.view.OrderQueryView;
import com.iwonder.tea.usr.dao.imp.AddressInfoDaoImp;
import com.iwonder.tea.usr.entity.AddressInfo;
import com.iwonder.tea.usr.entity.UserInfo;
import com.iwonder.tea.usr.service.IAddressInfoService;
import com.iwonder.tea.usr.service.IUserInfoService;
import com.iwonder.tea.usr.service.imp.AddressInfoServiceImp;
import com.iwonder.tea.usr.service.imp.UserInfoServiceImp;
import com.iwonder.tea.usr.view.UserInfoConditionView;
import com.iwonder.tea.usr.view.UserInfoQueryView;




/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/admin/order/AdminOrderServlet.do")
public class AdminOrderServlet  extends BaseServlet {
	
	private IOrderService orderService = (IOrderService)ProxyServiceFactory.getProxyService(OrderServiceImp.class) ; 
	private IUserInfoService iUserInfoService = (IUserInfoService) ProxyServiceFactory.getProxyService(UserInfoServiceImp.class);
	private IAddressInfoService iAddressInfoService = (IAddressInfoService) ProxyServiceFactory.getProxyService(AddressInfoServiceImp.class);
	private IDictionarySKUService iDictionarySKUService = (IDictionarySKUService) ProxyServiceFactory.getProxyService(DictionarySKUServiceImp.class);
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminOrderServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		super.doGet(request, response);
	}
	

	@SuppressWarnings("unused")
	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 根据业务逻辑，查询数据
		String orderCode = request.getParameter("orderCode");
		String userId = request.getParameter("userId");
		String addressId = request.getParameter("addressId");
		String createDate1 = request.getParameter("createDate");
		Date createDate= StringUtil.parseDate(createDate1);
		String totalPrice1 = request.getParameter("totalPrice");
		BigDecimal totalPrice= StringUtil.parseBigDecimal(totalPrice1);
		String payStat = request.getParameter("payStat");
		String payDate1 = request.getParameter("payDate");
		Date payDate = StringUtil.parseDate(payDate1);
		OrderConditionView orderConditionView = new OrderConditionView();
		orderConditionView.setOrderCode(orderCode);
		orderConditionView.setUserId(userId);
		orderConditionView.setAddressId(addressId);
		orderConditionView.setCreateDate(createDate);
		orderConditionView.setTotalPrice(totalPrice);
		orderConditionView.setPayStat(payStat);
		orderConditionView.setPayDate(payDate);
		System.out.println(userId);
		ArrayList<OrderQueryView> arr=orderService.list(orderConditionView);
		
		ArrayList<DictionarySKU> listDictionarySKU = iDictionarySKUService.findByDictCode(DictConstant.PAY_STATUS);
		
		request.setAttribute("listDictionarySKU", listDictionarySKU);
		// 传递对象数据
		request.setAttribute("arr1", arr);
		System.out.println(arr.toString());
		System.out.println("执行这里");
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/order/order_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String orderId= request.getParameter("orderId");	
		orderService.delete(orderId);
		// s3.页面跳转：重定向
		response.sendRedirect("AdminOrderServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		
		String orderId = request.getParameter("orderId");
		Order order = new Order() ;
		UserInfoConditionView user=	new UserInfoConditionView();
		// 根据studentId是否为空判断是新增还是修改的编辑
		ArrayList<UserInfoQueryView> listUserInfo = iUserInfoService.list(user) ;
		request.setAttribute("listUserInfo", listUserInfo);
		AddressInfo addressInfo = new AddressInfo();
		ArrayList<AddressInfo> listAddressInfo = iAddressInfoService.list() ;
		System.out.println("名字在这"+listUserInfo.get(1).getName());
		
		request.setAttribute("listAddressInfo", listAddressInfo);

	ArrayList<DictionarySKU> listDictionarySKU = iDictionarySKUService.findByDictCode(DictConstant.PAY_STATUS);
	
	request.setAttribute("listDictionarySKU", listDictionarySKU);
		if (StringUtil.isEmpty(orderId)) {// 新增
		
		} else {// 修改
			// S2.业务逻辑操作
			System.out.println(orderId);
			System.out.println("有到这里");
			
			order=orderService.load(orderId) ;


			
			request.setAttribute("payStat", order.getPayStat());
			System.out.println("payStat"+order.getPayStat());
		
			request.setAttribute("order", order);
			request.setAttribute("userId", order.getUserId());
			request.setAttribute("addressId", order.getAddressId());
		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/order/order_edit.jsp").forward(request, response);

		
		
	}

	@SuppressWarnings("unused")
	protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String orderId = request.getParameter("orderId");
		String orderCode = request.getParameter("orderCode");
		String userId = request.getParameter("userId");
		String addressId = request.getParameter("addressId");
		String createDate1 = request.getParameter("createDate");
		Date createDate= StringUtil.parseDate(createDate1);
		String totalPrice1 = request.getParameter("totalPrice");
		BigDecimal totalPrice= StringUtil.parseBigDecimal(totalPrice1);
		String payStat = request.getParameter("payStat");
		String payDate1 = request.getParameter("payDate");
		Date payDate = StringUtil.parseDate(payDate1);
		
		Order order = new Order();
		order.setOrderId(orderId);
		order.setOrderCode(orderCode);
		order.setUserId(userId);
		order.setAddressId(addressId);
		order.setCreateDate(createDate);
		order.setTotalPrice(totalPrice);
		order.setPayStat(payStat);
		order.setPayDate(payDate);
		System.out.println(orderId);
		System.out.println(orderCode);
		System.out.println(userId);
		System.out.println(addressId);
		System.out.println(createDate1);
		System.out.println(totalPrice1);
		System.out.println(payStat);
		System.out.println(payDate1);

		
		
		// 根据studentId是否为空判断是新增还是修改的编辑
		if (StringUtil.isEmpty(orderId)) {// 新增
			System.out.println("新增保存:" + orderId);
			orderService.insert(order);
			System.out.println("id为空啊");
		
		} else {// 修改
			// S2.业务处理：调数据库,略
			orderService.update(order);
		
		}

		// S3.页面跳转：重定向
		response.sendRedirect("AdminOrderServlet.do?method=list");
		
		
		
		
		

	}

	



}
