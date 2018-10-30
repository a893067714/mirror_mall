package com.iwonder.tea.cart.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.cart.entity.Cart;
import com.iwonder.tea.cart.service.ICartService;
import com.iwonder.tea.cart.service.imp.CartServiceImp;
import com.iwonder.tea.cart.view.CartConditionView;
import com.iwonder.tea.cart.view.CartQueryView;
import com.iwonder.tea.constant.DictConstant;
import com.iwonder.tea.dictionary.entity.DictionarySKU;
import com.iwonder.tea.dictionary.service.IDictionarySKUService;
import com.iwonder.tea.dictionary.service.imp.DictionarySKUServiceImp;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.prd.service.IProductSkuService;
import com.iwonder.tea.prd.service.imp.ProductSkuServiceImp;
import com.iwonder.tea.prd.view.ProductSkuConditionView;
import com.iwonder.tea.prd.view.ProductSkuQueryView;
import com.iwonder.tea.usr.service.IUserInfoService;
import com.iwonder.tea.usr.service.imp.UserInfoServiceImp;
import com.iwonder.tea.usr.view.UserInfoConditionView;
import com.iwonder.tea.usr.view.UserInfoQueryView;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/admin/cart/CartxServlet.do")
public class CartxServlet extends BaseServlet {

	private ICartService cartService = (ICartService) ProxyServiceFactory.getProxyService(CartServiceImp.class);
	private IUserInfoService iUserInfoService = (IUserInfoService) ProxyServiceFactory
			.getProxyService(UserInfoServiceImp.class);
	private IProductSkuService productSkuService = (IProductSkuService) ProxyServiceFactory
			.getProxyService(ProductSkuServiceImp.class);
	private IDictionarySKUService iDictionarySKUService = (IDictionarySKUService) ProxyServiceFactory.getProxyService(DictionarySKUServiceImp.class);

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CartxServlet() {
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

		String productSkuId = request.getParameter("productSkuId");
		String userId = request.getParameter("userId");
		String quantity1 = request.getParameter("quantity");
		Integer quantity = StringUtil.Integer(quantity1);
		String statCheck = request.getParameter("statCheck");
		String statDelete = request.getParameter("statDelete");
		CartConditionView cartConditionView = new CartConditionView();
		cartConditionView.setProductSkuId(productSkuId);
		cartConditionView.setUserId(userId);
		cartConditionView.setQuantity(quantity);
		cartConditionView.setStatCheck(statCheck);
		cartConditionView.setStatDelete(statDelete);

		ArrayList<CartQueryView> arr = cartService.list(cartConditionView);
		ArrayList<DictionarySKU> listDictionarySKU = iDictionarySKUService.findByDictCode(DictConstant.CHECK_STATUS);
		ArrayList<DictionarySKU> listDictionarySKU2 = iDictionarySKUService.findByDictCode(DictConstant.DELETE_STATUS);
		
		request.setAttribute("listDictionarySKU", listDictionarySKU);
		request.setAttribute("listDictionarySKU2", listDictionarySKU2);
		// 传递对象数据
		request.setAttribute("arr1", arr);
		System.out.println(arr.toString());
		System.out.println("执行这里");
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/cart/cart_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// s1.取参数
		String cartId = request.getParameter("cartId");
		cartService.delete(cartId);
		// s3.页面跳转：重定向
		response.sendRedirect("CartxServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数

		String cartId = request.getParameter("cartId");
		Cart cart = new Cart();

		// 根据studentId是否为空判断是新增还是修改的编辑

		ProductSkuConditionView productSku = new ProductSkuConditionView();
		ArrayList<ProductSkuQueryView> listProductSKU = productSkuService.list(productSku);
		
		ArrayList<DictionarySKU> listDictionarySKU = iDictionarySKUService.findByDictCode(DictConstant.CHECK_STATUS);
		ArrayList<DictionarySKU> listDictionarySKU2 = iDictionarySKUService.findByDictCode(DictConstant.DELETE_STATUS);
		
		request.setAttribute("listDictionarySKU", listDictionarySKU);
		request.setAttribute("listDictionarySKU2", listDictionarySKU2);
		request.setAttribute("listProductSKU", listProductSKU);
		UserInfoConditionView user = new UserInfoConditionView();
		// 根据studentId是否为空判断是新增还是修改的编辑
		ArrayList<UserInfoQueryView> listUserInfo = iUserInfoService.list(user);
		request.setAttribute("listUserInfo", listUserInfo);
		if (StringUtil.isEmpty(cartId)) {// 新增

		} else {// 修改
			// S2.业务逻辑操作
			System.out.println(cartId);
			System.out.println("有到这里");

			cart = cartService.load(cartId);

			request.setAttribute("statCheck", cart.getStatCheck());
			request.setAttribute("statDelete", cart.getStatDelete());
			
			request.setAttribute("cart", cart);
			request.setAttribute("productSkuId",cart.getProductSkuId());
			request.setAttribute("userId",cart.getUserId());	
			System.out.println("cartCode"+cart.getCartCode());
		
		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/cart/cart_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cartId = request.getParameter("cartId");
		String cartCode = request.getParameter("cartCode");
		String productSkuId = request.getParameter("productSkuId");
		String userId = request.getParameter("userId");
		String quantity1 = request.getParameter("quantity");
		Integer quantity = StringUtil.Integer(quantity1);
		String statCheck = request.getParameter("statCheck");
		String statDelete = request.getParameter("statDelete");
		Cart cart = new Cart();
		cart.setCartId(cartId);
		cart.setCartCode(cartCode);
		cart.setProductSkuId(productSkuId);
		cart.setUserId(userId);
		cart.setQuantity(quantity);
		cart.setStatCheck(statCheck);
		cart.setStatDelete(statDelete);
		System.out.println(cartId);
		System.out.println(productSkuId);
		System.out.println(userId);
		System.out.println(quantity);
		System.out.println(statCheck);
		System.out.println(statDelete);

		// 根据studentId是否为空判断是新增还是修改的编辑
		if (StringUtil.isEmpty(cartId)) {// 新增
			System.out.println("新增保存:" + cartId);
			cartService.insert(cart);
			System.out.println("id为空啊");

		} else {// 修改
			// S2.业务处理：调数据库,略
			cartService.update(cart);

		}

		// S3.页面跳转：重定向
		response.sendRedirect("CartxServlet.do?method=list");

	}

}
