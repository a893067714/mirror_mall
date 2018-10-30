package com.iwonder.tea.bas.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.bas.entity.TypeBig;
import com.iwonder.tea.bas.service.ITypeBigService;
import com.iwonder.tea.bas.service.imp.TypeBigServiceImp;
import com.iwonder.tea.bas.view.TypeBigConditionView;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;

@WebServlet("/admin/bas/TypeBigServlet.do")
public class TypeBigServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	private ITypeBigService typeBigService = (ITypeBigService) ProxyServiceFactory
			.getProxyService(TypeBigServiceImp.class);

	public TypeBigServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doGet(request, response);
	}

	/**
	 * 基本操作：显示数据
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String typeBigName = request.getParameter("typeBigName");
		if (StringUtil.isNotEmpty(typeBigName)) {
			typeBigName = typeBigName.trim();
		}
		TypeBigConditionView tbcv = new TypeBigConditionView();
		tbcv.setTypeBigName(typeBigName);

		request.setAttribute("listTypeBig", typeBigService.list(tbcv));
		request.setAttribute("typeBigName", typeBigName);

		request.getRequestDispatcher("/WEB-INF/jsp/admin/bas/typeBigList.jsp").forward(request, response);
	}

	/**
	 * 基本操作：执行删除
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String typeBigId = request.getParameter("typeBigId");

		// s2.业务逻辑
		typeBigService.delete(typeBigId);

		// s3.页面跳转：重定向
		response.sendRedirect("/tea_dynamic/admin/bas/TypeBigServlet.do?method=list");
	}

	/**
	 * 基本操作：新增保存
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String typeBigId = request.getParameter("typeBigId");
		String typeBigName = request.getParameter("typeBigName");

		TypeBig typeBig = new TypeBig();

		typeBig.setTypeBigId(typeBigId);
		typeBig.setTypeBigName(typeBigName);

		if (StringUtil.isEmpty(typeBigId)) {
			typeBigService.insert(typeBig);

		} else {
			typeBigService.update(typeBig);
		}

		response.sendRedirect("/tea_dynamic/admin/bas/TypeBigServlet.do?method=list");

	}

	/**
	 * 基本操作：前往修改页面
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		String typeBigId = request.getParameter("typeBigId");
		TypeBig typeBig = new TypeBig();

		if (StringUtil.isEmpty(typeBigId)) {// 新增

		} else {// 修改
			typeBig = typeBigService.load(typeBigId);
			request.setAttribute("typeBig", typeBig);
		}

		request.getRequestDispatcher("/WEB-INF/jsp/admin/bas/typeBigEdit.jsp").forward(request, response);
	}
}