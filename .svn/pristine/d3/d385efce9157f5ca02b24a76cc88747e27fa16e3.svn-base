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
import com.iwonder.tea.sys.entity.StaffRole;
import com.iwonder.tea.sys.service.IRoleService;
import com.iwonder.tea.sys.service.IStaffRoleService;
import com.iwonder.tea.sys.service.IStaffService;
import com.iwonder.tea.sys.service.imp.RoleServiceImp;
import com.iwonder.tea.sys.service.imp.StaffRoleServiceImp;
import com.iwonder.tea.sys.service.imp.StaffServiceImp;
import com.iwonder.tea.sys.view.RoleConditionView;
import com.iwonder.tea.sys.view.RoleQueryView;
import com.iwonder.tea.sys.view.StaffConditionView;
import com.iwonder.tea.sys.view.StaffQueryView;
import com.iwonder.tea.sys.view.StaffRoleConditionView;
import com.iwonder.tea.sys.view.StaffRoleQueryView;

/**
 * Servlet implementation class StaffRoleIdServlet
 */
@WebServlet("/admin/sys/StaffRoleServlet.do")
public class StaffRoleServlet extends BaseServlet {

	private IStaffRoleService iStaffRoleService = (IStaffRoleService) ProxyServiceFactory
			.getProxyService(StaffRoleServiceImp.class);
	private IStaffService iStaffService = (IStaffService) ProxyServiceFactory.getProxyService(StaffServiceImp.class);
	private IRoleService iRoleService = (IRoleService) ProxyServiceFactory.getProxyService(RoleServiceImp.class);

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StaffRoleServlet() {
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
		String staffId = request.getParameter("staffId");
		String roleId = request.getParameter("roleId");

		if (StringUtil.isNotEmpty(staffId)) {
			staffId = staffId.trim();
		}

		// ArrayList<StaffRole> listStaffRole = iStaffRoleService.list();
		StaffRoleConditionView staffRoleConditionView = new StaffRoleConditionView();
		staffRoleConditionView.setStaffId(staffId);
		staffRoleConditionView.setRoleId(roleId);

		ArrayList<StaffRoleQueryView> listStaffRole = iStaffRoleService.list(staffRoleConditionView);

		// 传递对象数据
		request.setAttribute("listStaffRole", listStaffRole);

		// 回显
		request.setAttribute("staffRoleConditionView", staffRoleConditionView);

		// 多条件组合查询
		ArrayList<StaffQueryView> listStaff = iStaffService.list(new StaffConditionView());
		request.setAttribute("listStaff", listStaff);
		ArrayList<RoleQueryView> listRole = iRoleService.list(new RoleConditionView());
		request.setAttribute("listRole", listRole);

		request.setAttribute("staffId", staffRoleConditionView.getStaffId());
		request.setAttribute("roleId", staffRoleConditionView.getRoleId());

		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/staffRole_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String staffRoleId = request.getParameter("staffRoleId");

		// s2.业务逻辑

		iStaffRoleService.delete(staffRoleId);

		// s3.页面跳转：重定向
		response.sendRedirect("StaffRoleServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		String staffRoleId = request.getParameter("staffRoleId");

		ArrayList<StaffQueryView> listStaff = iStaffService.list(new StaffConditionView());
		request.setAttribute("listStaff", listStaff);
		ArrayList<RoleQueryView> listRole = iRoleService.list(new RoleConditionView());
		request.setAttribute("listRole", listRole);

		if (StringUtil.isEmpty(staffRoleId)) {// 新增

		} else {// load
				// S2.业务逻辑操作

			StaffRole staffRole = iStaffRoleService.load(staffRoleId);
			request.setAttribute("staffRole", staffRole);

			request.setAttribute("staffId", staffRole.getStaffId());
			request.setAttribute("roleId", staffRole.getRoleId());

		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/staffRole_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String staffRoleId = request.getParameter("staffRoleId");
		String staffId = request.getParameter("staffId");
		String roleId = request.getParameter("roleId");

		StaffRole staffRole = new StaffRole();
		staffRole.setStaffRoleId(staffRoleId);
		staffRole.setStaffId(staffId);
		staffRole.setRoleId(roleId);

		// 业务逻辑
		if (StringUtil.isEmpty(staffRoleId)) {// 新增
			iStaffRoleService.insert(staffRole);
		} else {// 修改
			iStaffRoleService.update(staffRole);
		}

		// S3.页面跳转：重定向
		response.sendRedirect("StaffRoleServlet.do?method=list");

	}

	// 方便用户使用
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

}
