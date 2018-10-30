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
import com.iwonder.tea.usr.entity.UserInfo;
import com.iwonder.tea.usr.service.IUserInfoService;
import com.iwonder.tea.usr.service.imp.UserInfoServiceImp;
import com.iwonder.tea.usr.view.UserInfoConditionView;
import com.iwonder.tea.usr.view.UserInfoQueryView;

/**
 * Servlet implementation class UserInfoServlet
 */
@WebServlet("/admin/usr/UserInfoServlet.do")
public class UserInfoServlet extends BaseServlet {

	private IUserInfoService iUserInfoService = (IUserInfoService) ProxyServiceFactory
			.getProxyService(UserInfoServiceImp.class);

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserInfoServlet() {
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
		String userCode = request.getParameter("userCode");
		String name = request.getParameter("name");
		String nickName = request.getParameter("nickName");
		String gender = request.getParameter("gender");
		String idCard = request.getParameter("idCard");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String balance = request.getParameter("balance");
		String timePrevious = request.getParameter("timePrevious");
		String timeLater = request.getParameter("timeLater");

		if (StringUtil.isNotEmpty(name)) {
			name = name.trim();
		}

		// ArrayList<UserInfo> listUserInfo = iUserInfoService.list();
		UserInfoConditionView userInfoConditionView = new UserInfoConditionView();
		userInfoConditionView.setName(userCode);
		userInfoConditionView.setName(name);
		userInfoConditionView.setNickName(nickName);
		userInfoConditionView.setGender(gender);
		userInfoConditionView.setIdCard(idCard);
		userInfoConditionView.setMobile(mobile);
		userInfoConditionView.setEmail(email);

		// 时间范围
		userInfoConditionView.setTimePrevious(StringUtil.parseDate(timePrevious));
		userInfoConditionView.setTimeLater(StringUtil.parseDate(timeLater));

		userInfoConditionView.setBalance(StringUtil.parseBigDecimal(balance));

		// list查询
		ArrayList<UserInfoQueryView> listUserInfo = iUserInfoService.list(userInfoConditionView);

		// 传递对象数据
		request.setAttribute("listUserInfo", listUserInfo);

		// 回显
		request.setAttribute("userInfoConditionView", userInfoConditionView);
		request.setAttribute("timePrevious", timePrevious);
		request.setAttribute("timeLater", timeLater);
		// request.setAttribute("idCard", idCard );
		// request.setAttribute("mobile", mobile );
		// request.setAttribute("email", email );
		// request.setAttribute("balance", balance );

		// 下拉框回显
		request.setAttribute("gender", userInfoConditionView.getGender());

		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/usr/userInfo_list.jsp").forward(request, response);
//
		
	}

	@SuppressWarnings("unused")
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String userId = request.getParameter("userId");

		// s2.业务逻辑

		iUserInfoService.delete(userId);

		// s3.页面跳转：重定向
		response.sendRedirect("UserInfoServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		String userId = request.getParameter("userId");

		if (StringUtil.isEmpty(userId)) {// 新增

		} else {// load
				// S2.业务逻辑操作

			UserInfo userInfo = iUserInfoService.load(userId);

			// 下拉框获取定值
			request.setAttribute("gender", userInfo.getGender());

			request.setAttribute("userInfo", userInfo);
		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/usr/userInfo_edit.jsp").forward(request, response);
		
	}

	@SuppressWarnings("unused")
	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String userId = request.getParameter("userId");
		String userCode = request.getParameter("userCode");
		System.out.println(userCode);
		String userName = request.getParameter("userName");
		String userNickName = request.getParameter("userNickName");
		String userGender = request.getParameter("userGender");
		String userBirthday = request.getParameter("userBirthday");
		String userIdCard = request.getParameter("userIdCard");
		String userMobile = request.getParameter("userMobile");
		String userEmail = request.getParameter("userEmail");
		String userPwdLogin = request.getParameter("userPwdLogin");
		String userBalance = request.getParameter("userBalance");

		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(userId);
		userInfo.setUserCode(userCode);
		userInfo.setName(userName);
		userInfo.setNickName(userNickName);
		userInfo.setGender(userGender);

		// 通过date将字符串转换成时间格式
		userInfo.setBirthday(StringUtil.parseDate(userBirthday));

		userInfo.setIdCard(userIdCard);
		userInfo.setMobile(userMobile);
		userInfo.setEmail(userEmail);
		userInfo.setPwdLogin(userPwdLogin);

		// 通过BigDecimal将字符串转换成big格式
		userInfo.setBalance(StringUtil.parseBigDecimal(userBalance));

		// 业务逻辑

		if (StringUtil.isEmpty(userId)) {// 新增
			iUserInfoService.insert(userInfo);
		} else {// 修改
			iUserInfoService.update(userInfo);
		}

		// S3.页面跳转：重定向
		response.sendRedirect("UserInfoServlet.do?method=list");

	}

	// 方便用户使用
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

}
