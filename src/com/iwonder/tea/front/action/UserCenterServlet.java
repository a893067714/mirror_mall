package com.iwonder.tea.front.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.usr.entity.UserInfo;

@WebServlet("/UserCenterServlet.do")
public class UserCenterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserCenterServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
		System.out.println(userInfo.toString());
		request.setAttribute("listUserInfo", userInfo);

		request.getRequestDispatcher("/WEB-INF/jsp/front/usercenter.jsp").forward(request, response);
	}

}