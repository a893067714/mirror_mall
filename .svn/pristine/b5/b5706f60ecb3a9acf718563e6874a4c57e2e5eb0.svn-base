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
import com.iwonder.tea.sys.entity.Module;
import com.iwonder.tea.sys.service.IModuleService;
import com.iwonder.tea.sys.service.imp.ModuleServiceImp;
import com.iwonder.tea.sys.view.ModuleConditionView;
import com.iwonder.tea.sys.view.ModuleQueryView;

/**
 * Servlet implementation class ModuleServlet
 */
@WebServlet("/admin/sys/ModuleServlet.do")
public class ModuleServlet extends BaseServlet {

	private IModuleService iModuleService = (IModuleService) ProxyServiceFactory.getProxyService(ModuleServiceImp.class);

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModuleServlet() {
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
		String moduleName = request.getParameter("moduleName") ;

//		ArrayList<Module> listModule = iModuleService.list();
		ModuleConditionView moduleConditionView = new ModuleConditionView();
		moduleConditionView.setModuleName(moduleName);
		
		ArrayList<ModuleQueryView> listModule = iModuleService.list(moduleConditionView);
		// 传递对象数据
		request.setAttribute("listModule", listModule);
		
		request.setAttribute("moduleConditionView", moduleConditionView );

		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/module_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String moduleId = request.getParameter("moduleId");

		// s2.业务逻辑

		iModuleService.delete(moduleId);

		// s3.页面跳转：重定向
		response.sendRedirect("ModuleServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		String moduleId = request.getParameter("moduleId");

		if (StringUtil.isEmpty(moduleId)) {// 新增

		} else {// load
				// S2.业务逻辑操作

			Module module = iModuleService.load(moduleId);

			request.setAttribute("module", module);
		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/module_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String moduleId = request.getParameter("moduleId");
		String moduleName = request.getParameter("moduleName");

		
		Module module = new Module();
		module.setModuleId(moduleId);
		module.setModuleName(moduleName);
		
		// 业务逻辑
		if (StringUtil.isEmpty(moduleId)) {// 新增
			iModuleService.insert(module);
		} else {// 修改
			iModuleService.update(module);
		}

		// S3.页面跳转：重定向
		response.sendRedirect("ModuleServlet.do?method=list");

	}
	
	//方便用户使用
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

}
