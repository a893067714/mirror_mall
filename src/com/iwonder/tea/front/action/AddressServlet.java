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

@WebServlet("/AddressServlet.do")
public class AddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IAddressInfoService iAddressInfoService = (IAddressInfoService) ProxyServiceFactory
			.getProxyService(AddressInfoServiceImp.class);

	public AddressServlet() {
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
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
		AddressInfoConditionView aicv = new AddressInfoConditionView();
		aicv.setUserId(userInfo.getUserId());
		ArrayList<AddressInfoQueryView> list = iAddressInfoService.list(aicv);
		System.out.println(list);
		System.out.println("=====================");

		request.setAttribute("list", list);
		request.setAttribute("name", userInfo.getName());
		request.getRequestDispatcher("/WEB-INF/jsp/front/address.jsp").forward(request, response);
	}

}