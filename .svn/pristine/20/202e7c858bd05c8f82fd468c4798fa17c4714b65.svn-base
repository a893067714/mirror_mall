package com.iwonder.tea.sys.action;

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
import com.iwonder.tea.sys.entity.Role;
import com.iwonder.tea.sys.service.IRoleService;
import com.iwonder.tea.sys.service.imp.RoleServiceImp;
import com.iwonder.tea.sys.view.RoleConditionView;
import com.iwonder.tea.sys.view.RoleQueryView;

/**
 * Servlet implementation class RoleServlet
 */
@WebServlet("/admin/sys/RoleServlet.do")
public class RoleServlet extends BaseServlet{

	private IRoleService iRoleService = (IRoleService) ProxyServiceFactory.getProxyService(RoleServiceImp.class);

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RoleServlet() {
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
		String roleName = request.getParameter("roleName") ;

//		ArrayList<Role> listRole = iRoleService.list();
		RoleConditionView roleConditionView = new RoleConditionView();
		roleConditionView.setRoleName(roleName);
		
		
		ArrayList<RoleQueryView> listRole = iRoleService.list(roleConditionView);

		// 传递对象数据
		request.setAttribute("listRole", listRole);
		
		//回显
		request.setAttribute("roleConditionView", roleConditionView);

		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/role_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String roleId = request.getParameter("roleId");

		// s2.业务逻辑

		iRoleService.delete(roleId);

		// s3.页面跳转：重定向
		response.sendRedirect("RoleServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		String roleId = request.getParameter("roleId");

		if (StringUtil.isEmpty(roleId)) {// 新增

		} else {// load
				// S2.业务逻辑操作

			Role role = iRoleService.load(roleId);

			request.setAttribute("role", role);
		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/role_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String roleId = request.getParameter("roleId");
		String roleName = request.getParameter("roleName");

		
		Role role = new Role();
		role.setRoleId(roleId);
		role.setRoleName(roleName);
		
		// 业务逻辑
		if (StringUtil.isEmpty(roleId)) {// 新增
			iRoleService.insert(role);
		} else {// 修改
			iRoleService.update(role);
		}

		// S3.页面跳转：重定向
		response.sendRedirect("RoleServlet.do?method=list");

	}
	
	//方便用户使用
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

}
