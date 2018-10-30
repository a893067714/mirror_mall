package com.iwonder.tea.front;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.MailUtils;
import com.iwonder.tea.framework.util.UUIDUtils;
import com.iwonder.tea.sys.entity.Menu;
import com.iwonder.tea.sys.entity.Staff;
import com.iwonder.tea.sys.service.IMenuService;
import com.iwonder.tea.sys.service.IRoleMenuService;
import com.iwonder.tea.sys.service.IStaffRoleService;
import com.iwonder.tea.sys.service.IStaffService;
import com.iwonder.tea.sys.service.imp.MenuServiceImp;
import com.iwonder.tea.sys.service.imp.RoleMenuServiceImp;
import com.iwonder.tea.sys.service.imp.StaffRoleServiceImp;
import com.iwonder.tea.sys.service.imp.StaffServiceImp;
import com.iwonder.tea.sys.view.MenuConditionView;
import com.iwonder.tea.sys.view.RoleMenuConditionView;
import com.iwonder.tea.sys.view.RoleMenuQueryView;
import com.iwonder.tea.sys.view.StaffRoleConditionView;
import com.iwonder.tea.sys.view.StaffRoleQueryView;
import com.iwonder.tea.usr.entity.UserInfo;
import com.iwonder.tea.usr.service.IUserInfoService;
import com.iwonder.tea.usr.service.imp.UserInfoServiceImp;

@WebServlet("/UserLogRegServlet.do")
public class UserLogRegServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private IStaffRoleService iStaffRoleService = (IStaffRoleService) ProxyServiceFactory
			.getProxyService(StaffRoleServiceImp.class);
	private IUserInfoService iUserInfoService = (IUserInfoService) ProxyServiceFactory
			.getProxyService(UserInfoServiceImp.class);
	private IStaffService iStaffService = (IStaffService) ProxyServiceFactory.getProxyService(StaffServiceImp.class);
	private IMenuService iMenuService = (IMenuService) ProxyServiceFactory.getProxyService(MenuServiceImp.class);
	private IRoleMenuService iRoleMenuService = (IRoleMenuService) ProxyServiceFactory
			.getProxyService(RoleMenuServiceImp.class);

	public UserLogRegServlet() {
		super();
	}

	public void register(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userEmail = request.getParameter("userEmail");
		String name = request.getParameter("name");
		String userPwdLogin = request.getParameter("userPwdLogin");
		UserInfo userInfo = new UserInfo();
		userInfo.setEmail(userEmail);
		userInfo.setName(name);
		userInfo.setPwdLogin(userPwdLogin);
		userInfo.setUserId(UUIDUtils.getId());
		System.out.println(userInfo.toString());
		iUserInfoService.insert(userInfo);

		// 注册成功,向用户邮箱发送信息,跳转到提示页面
		// 发送带激活码的邮件,到注册的账户中
		MailUtils mailUtils = new MailUtils(userInfo.getEmail(), userInfo.getPwdLogin());
		mailUtils.run();
		request.setAttribute("msg", "用户注册成功!");
		// 注册失败,跳转到提示页面

		request.getRequestDispatcher("LoginServlet.do").forward(request, response);
	}

	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userEmail = request.getParameter("userEmail");
		String userPwdLogin = request.getParameter("userPwdLogin");
		UserInfo userInfo = new UserInfo();
		userInfo.setEmail(userEmail);
		userInfo.setPwdLogin(userPwdLogin);
		userInfo = iUserInfoService.login(userInfo);
		if (userInfo == null) {
			// 登录失败
			request.setAttribute("msg", "登录失败!");
			request.getRequestDispatcher("LoginServlet.do").forward(request, response);
		} else {
			// 登录成功
			// String name = userInfo.getName();
			// String name = userInfo.getEmail();
			request.getSession().setAttribute("userInfo", userInfo);
			response.sendRedirect("IndexServlet.do");
		}
	}

	public void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 清除session
		request.getSession().invalidate();
		// 重新定向到首页
		response.sendRedirect("IndexServlet.do");

	}

	public void adminLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String staffName = request.getParameter("staffName");
		String pwdLogin = request.getParameter("pwdLogin");
		Staff staff = new Staff();
		staff.setStaffName(staffName);
		staff.setPwdLogin(pwdLogin);
		staff = iStaffService.login(staff);
		if (staff == null) {
			// 登录失败
			request.setAttribute("msg", "登录失败!");
			request.getRequestDispatcher("AdminLoginServlet.do").forward(request, response);
		} else {
			// 登录成功
			request.getSession().setAttribute("staff", staff);
			StaffRoleConditionView srcv = new StaffRoleConditionView();
			srcv.setStaffId(staff.getStaffId());
			System.out.println(srcv.toString());
			ArrayList<StaffRoleQueryView> listStaffRole = iStaffRoleService.list(srcv);
			ArrayList<Menu> menulist = new ArrayList<Menu>();
			RoleMenuConditionView roleMenuConditionView = new RoleMenuConditionView();
			for (StaffRoleQueryView staffRoleQueryView : listStaffRole) {
				roleMenuConditionView.setRoleId(staffRoleQueryView.getRoleId());
				ArrayList<RoleMenuQueryView> listRoleMenuQueryView = iRoleMenuService.list(roleMenuConditionView);
				for (RoleMenuQueryView roleMenuQueryView : listRoleMenuQueryView) {
					Menu menuLoad = iMenuService.load(roleMenuQueryView.getMenuId());
					System.out.println(menuLoad.toString());
					menulist.add(menuLoad);
				}
			}
			System.out.println("menulist+" + menulist.toString());
			request.setAttribute("menulist", menulist);
			// request.getRequestDispatcher("nav.jsp").forward(request,
			// response);
			response.sendRedirect("nav.jsp");
		}
	}

	public void adminLogout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 清除session
		request.getSession().invalidate();
		// 重新定向到首页
		response.sendRedirect("nav.jsp");

	}
}