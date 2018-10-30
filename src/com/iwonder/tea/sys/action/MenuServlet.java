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
import com.iwonder.tea.sys.entity.Menu;
import com.iwonder.tea.sys.service.IMenuService;
import com.iwonder.tea.sys.service.IModuleService;
import com.iwonder.tea.sys.service.imp.MenuServiceImp;
import com.iwonder.tea.sys.service.imp.ModuleServiceImp;
import com.iwonder.tea.sys.view.MenuConditionView;
import com.iwonder.tea.sys.view.ModuleConditionView;
import com.iwonder.tea.sys.view.ModuleQueryView;

/**
 * Servlet implementation class MenuServlet
 */
@WebServlet("/admin/sys/MenuServlet.do")
public class MenuServlet extends BaseServlet {

	private IMenuService iMenuService = (IMenuService) ProxyServiceFactory.getProxyService(MenuServiceImp.class);
	private IModuleService iModuleService = (IModuleService) ProxyServiceFactory
			.getProxyService(ModuleServiceImp.class);

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MenuServlet() {
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
		String moduleId = request.getParameter("moduleId");
		String menuName = request.getParameter("menuName");

		if (StringUtil.isNotEmpty(moduleId)) {
			moduleId = moduleId.trim();
		}

		// ArrayList<Menu> listMenu = iMenuService.list();
		MenuConditionView menuConditionView = new MenuConditionView();
		menuConditionView.setModuleId(moduleId);
		menuConditionView.setMenuName(menuName);

		// 传递对象数据
		request.setAttribute("listMenu", iMenuService.list(menuConditionView));

		// 回显
		request.setAttribute("menuConditionView", menuConditionView);

		// 多条件组合查询
		ArrayList<ModuleQueryView> listModule = iModuleService.list(new ModuleConditionView());
		request.setAttribute("listModule", listModule);

		request.setAttribute("moduleId", menuConditionView.getModuleId());

		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/menu_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String menuId = request.getParameter("menuId");

		// s2.业务逻辑

		iMenuService.delete(menuId);

		// s3.页面跳转：重定向
		response.sendRedirect("MenuServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		String menuId = request.getParameter("menuId");

		// 多条件组合查询
		ArrayList<ModuleQueryView> listModule = iModuleService.list(new ModuleConditionView());
		request.setAttribute("listModule", listModule);

		if (StringUtil.isEmpty(menuId)) {// 新增

		} else {// load
				// S2.业务逻辑操作

			Menu menu = iMenuService.load(menuId);

			request.setAttribute("moduleId", menu.getModuleId());

			request.setAttribute("menu", menu);
		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/menu_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String menuId = request.getParameter("menuId");
		String moduleId = request.getParameter("moduleId");
		String menuName = request.getParameter("menuName");
		String menuUrl = request.getParameter("menuUrl");

		Menu menu = new Menu();
		menu.setMenuId(menuId);
		menu.setModuleId(moduleId);
		menu.setMenuName(menuName);
		menu.setMenuUrl(menuUrl);

		// 业务逻辑
		if (StringUtil.isEmpty(menuId)) {// 新增
			iMenuService.insert(menu);
		} else {// 修改
			iMenuService.update(menu);
		}

		// S3.页面跳转：重定向
		response.sendRedirect("MenuServlet.do?method=list");

	}

	// 方便用户使用
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

}
