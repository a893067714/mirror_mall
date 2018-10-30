package com.iwonder.tea.front.action;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.usr.entity.UserInfo;
import com.iwonder.tea.usr.service.IUserInfoService;
import com.iwonder.tea.usr.service.imp.UserInfoServiceImp;

@WebServlet("/InformationServlet.do")
public class InformationServlet extends BaseServlet implements Serializable {
	private static final long serialVersionUID = 1L;

	private IUserInfoService iUserInfoService = (IUserInfoService) ProxyServiceFactory
			.getProxyService(UserInfoServiceImp.class);

	public InformationServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doGet(request, response);
	}

	public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
		System.out.println(userInfo.toString());
		request.setAttribute("listUserInfo", userInfo);
		request.setAttribute("listUserDate", StringUtil.dateFormat(userInfo.getBirthday()));
		System.out.println("查询操作");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.getRequestDispatcher("/WEB-INF/jsp/front/information.jsp").forward(request, response);
	}

	public void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nickName = request.getParameter("nickName");
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String gender = request.getParameter("gender");
		String userCode = request.getParameter("userCode");
		String idCard = request.getParameter("idCard");
		String mobile = request.getParameter("mobile");
		String balance = request.getParameter("balance");

		UserInfo u = (UserInfo) request.getSession().getAttribute("userInfo");
		u.setGender(gender);
		u.setNickName(nickName);
		Date date = StringUtil.parseDate(birthday);
		u.setBirthday(date);
		u.setName(name);
		u.setUserCode(userCode);
		u.setIdCard(idCard);
		u.setMobile(mobile);

		iUserInfoService.update(u);
		response.sendRedirect("InformationServlet.do?method=list");
	}

}