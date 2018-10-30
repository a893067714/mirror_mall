package com.iwonder.tea.front.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.usr.entity.UserInfo;
import com.iwonder.tea.usr.service.IAddressInfoService;
import com.iwonder.tea.usr.service.imp.AddressInfoServiceImp;
import com.iwonder.tea.usr.view.AddressInfoConditionView;
import com.iwonder.tea.usr.view.AddressInfoQueryView;

@WebServlet("/BalanceServlet.do")
public class BalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IAddressInfoService iAddressInfoService = (IAddressInfoService) ProxyServiceFactory
			.getProxyService(AddressInfoServiceImp.class);

	public BalanceServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("================?????????????????");
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");

		/*
		 * 暂时使用第一个地址
		 */
		AddressInfoConditionView aicv = new AddressInfoConditionView();
		aicv.setUserId(userInfo.getUserId());
		ArrayList<AddressInfoQueryView> list = iAddressInfoService.list(aicv);
		System.out.println("=================================" + list);
		request.setAttribute("a", list.get(0));
		request.setAttribute("userInfo", userInfo);
		request.getRequestDispatcher("/WEB-INF/jsp/front/balance.jsp").forward(request, response);
	}

}