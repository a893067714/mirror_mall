package com.iwonder.tea.usr.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.usr.entity.AddressInfo;
import com.iwonder.tea.usr.service.IAddressInfoService;
import com.iwonder.tea.usr.service.IUserInfoService;
import com.iwonder.tea.usr.service.imp.AddressInfoServiceImp;
import com.iwonder.tea.usr.service.imp.UserInfoServiceImp;
import com.iwonder.tea.usr.view.AddressInfoConditionView;
import com.iwonder.tea.usr.view.AddressInfoQueryView;
import com.iwonder.tea.usr.view.UserInfoConditionView;
import com.iwonder.tea.usr.view.UserInfoQueryView;

/**
 * Servlet implementation class AddressInfoServlet
 */
@WebServlet("/admin/usr/AddressInfoServlet.do")
public class AddressInfoServlet extends BaseServlet {
	
	private IAddressInfoService iAddressInfoService = (IAddressInfoService) ProxyServiceFactory.getProxyService(AddressInfoServiceImp.class);
	private IUserInfoService iUserInfoService = (IUserInfoService) ProxyServiceFactory.getProxyService(UserInfoServiceImp.class);
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddressInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@SuppressWarnings("unused")
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 根据业务逻辑，查询数据
		
		String userId = request.getParameter("userId") ;
		String addressCont = request.getParameter("addressCont") ;
		String addressDefault = request.getParameter("addressDefault") ;
		String receiverName = request.getParameter("receiverName") ;
		String receiverPhone = request.getParameter("receiverPhone") ;
		
		if(StringUtil.isNotEmpty(userId)){
			userId = userId.trim() ;
		}
		
//		ArrayList<AddressInfo> listAddressInfo = iAddressInfoService.list();
		AddressInfoConditionView addressInfoConditionView = new AddressInfoConditionView();
		addressInfoConditionView.setUserId(userId);
		addressInfoConditionView.setAddressCont(addressCont);
		addressInfoConditionView.setAddressDefault(addressDefault);
		addressInfoConditionView.setReceiverName(receiverName);
		addressInfoConditionView.setReceiverPhone(receiverPhone);
		
		ArrayList<AddressInfoQueryView> listAddressInfo = iAddressInfoService.list(addressInfoConditionView);

		// 传递对象数据
		request.setAttribute("listAddressInfo", listAddressInfo);
		
		request.setAttribute("addressInfoConditionView", addressInfoConditionView );
//		request.setAttribute("addressCont", addressCont );
//		request.setAttribute("addressDefault", addressDefault );
//		request.setAttribute("receiverName", receiverName );
//		request.setAttribute("receiverPhone", receiverPhone );
//		
		ArrayList<UserInfoQueryView> listUserInfo = iUserInfoService.list(new UserInfoConditionView()) ;
		request.setAttribute("listUserInfo", listUserInfo);

		//下拉框获取指定值
		request.setAttribute("userId",addressInfoConditionView.getUserId());
		
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/usr/addressInfo_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String addressId = request.getParameter("addressId");

		// s2.业务逻辑

		iAddressInfoService.delete(addressId);

		// s3.页面跳转：重定向
		response.sendRedirect("AddressInfoServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		String addressId = request.getParameter("addressId");

		ArrayList<UserInfoQueryView> listUserInfo = iUserInfoService.list(new UserInfoConditionView()) ;
		request.setAttribute("listUserInfo", listUserInfo);
		
		if (StringUtil.isEmpty(addressId)) {// 新增

		} else {// load
				// S2.业务逻辑操作

			AddressInfo addressInfo = iAddressInfoService.load(addressId);
			request.setAttribute("userId",addressInfo.getUserId());
			request.setAttribute("addressInfo", addressInfo);
		}
		
		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/usr/addressInfo_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String addressId = request.getParameter("addressId");
		String userId = request.getParameter("userId");
		String addressCont = request.getParameter("addressCont");
		String addressDefault = request.getParameter("addressDefault");
		String receiverName = request.getParameter("receiverName");
		String receiverPhone = request.getParameter("receiverPhone");

		AddressInfo addressInfo = new AddressInfo();
		addressInfo.setAddressId(addressId);
		addressInfo.setUserId(userId);
		addressInfo.setAddressCont(addressCont);
		addressInfo.setAddressDefault(addressDefault);
		addressInfo.setReceiverName(receiverName);
		addressInfo.setReceiverPhone(receiverPhone);
		
		// 业务逻辑
		if (StringUtil.isEmpty(addressId)) {// 新增
			iAddressInfoService.insert(addressInfo);
		} else {// 修改
			iAddressInfoService.update(addressInfo);
		}

		// S3.页面跳转：重定向
		response.sendRedirect("AddressInfoServlet.do?method=list");

	}
	
	//方便用户使用
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}


}
