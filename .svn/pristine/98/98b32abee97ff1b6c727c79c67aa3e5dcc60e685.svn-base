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
import com.iwonder.tea.sys.entity.RoleMenu;
import com.iwonder.tea.sys.service.IMenuService;
import com.iwonder.tea.sys.service.IRoleMenuService;
import com.iwonder.tea.sys.service.IRoleService;
import com.iwonder.tea.sys.service.imp.MenuServiceImp;
import com.iwonder.tea.sys.service.imp.RoleMenuServiceImp;
import com.iwonder.tea.sys.service.imp.RoleServiceImp;
import com.iwonder.tea.sys.view.MenuConditionView;
import com.iwonder.tea.sys.view.MenuQueryView;
import com.iwonder.tea.sys.view.RoleConditionView;
import com.iwonder.tea.sys.view.RoleMenuConditionView;
import com.iwonder.tea.sys.view.RoleMenuQueryView;
import com.iwonder.tea.sys.view.RoleQueryView;

/**
 * Servlet implementation class RoleMenuServlet
 */
@WebServlet("/admin/sys/RoleMenuServlet.do")
public class RoleMenuServlet extends BaseServlet {

	private IRoleMenuService iRoleMenuService = (IRoleMenuService) ProxyServiceFactory.getProxyService(RoleMenuServiceImp.class);
	private IMenuService iMenuService = (IMenuService) ProxyServiceFactory.getProxyService(MenuServiceImp.class);
	private IRoleService iRoleService = (IRoleService) ProxyServiceFactory.getProxyService(RoleServiceImp.class);
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RoleMenuServlet() {
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
		String roleId = request.getParameter("roleId") ;
		String menuId = request.getParameter("menuId") ;
		
		if(StringUtil.isNotEmpty(roleId)){
			roleId = roleId.trim() ;
		}
//		ArrayList<RoleMenu> listRoleMenu = iRoleMenuService.list();
		RoleMenuConditionView roleMenuConditionView = new RoleMenuConditionView();
		roleMenuConditionView.setRoleId(roleId);
		roleMenuConditionView.setMenuId(menuId);
		
		ArrayList<RoleMenuQueryView> listRoleMenu = iRoleMenuService.list(roleMenuConditionView);

		// 传递对象数据
		request.setAttribute("listRoleMenu", listRoleMenu);
		
		//回显
		request.setAttribute("roleMenuConditionView", roleMenuConditionView );
		
		//多条件组合查询
		ArrayList<RoleQueryView> listRole = iRoleService.list(new RoleConditionView()) ;
		request.setAttribute("listRole", listRole);
		ArrayList<MenuQueryView> listMenu = iMenuService.list(new MenuConditionView()) ;
		request.setAttribute("listMenu", listMenu);
		
		request.setAttribute("roleId",roleMenuConditionView.getRoleId());
		request.setAttribute("menuId",roleMenuConditionView.getMenuId());

		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/roleMenu_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String roleMenuId = request.getParameter("roleMenuId");

		// s2.业务逻辑

		iRoleMenuService.delete(roleMenuId);

		// s3.页面跳转：重定向
		response.sendRedirect("RoleMenuServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		String roleMenuId = request.getParameter("roleMenuId");

		//多条件组合查询
		ArrayList<RoleQueryView> listRole = iRoleService.list(new RoleConditionView()) ;
		request.setAttribute("listRole", listRole);
		ArrayList<MenuQueryView> listMenu = iMenuService.list(new MenuConditionView()) ;
		request.setAttribute("listMenu", listMenu);
		
		
		
		if (StringUtil.isEmpty(roleMenuId)) {// 新增

		} else {// load
				// S2.业务逻辑操作

			RoleMenu roleMenu = iRoleMenuService.load(roleMenuId);
			
			request.setAttribute("roleId",roleMenu.getRoleId());
			request.setAttribute("menuId",roleMenu.getMenuId());
			
			request.setAttribute("roleMenu", roleMenu);
		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/roleMenu_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String roleMenuId = request.getParameter("roleMenuId");
		String roleId = request.getParameter("roleId");
		String menuId = request.getParameter("menuId");

		
		RoleMenu roleMenu = new RoleMenu();
		roleMenu.setRoleMenuId(roleMenuId);
		roleMenu.setRoleId(roleId);
		roleMenu.setMenuId(menuId);
		// 业务逻辑
		if (StringUtil.isEmpty(roleMenuId)) {// 新增
			iRoleMenuService.insert(roleMenu);
		} else {// 修改
			iRoleMenuService.update(roleMenu);
		}

		// S3.页面跳转：重定向
		response.sendRedirect("RoleMenuServlet.do?method=list");

	}
	
	//方便用户使用
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

}
