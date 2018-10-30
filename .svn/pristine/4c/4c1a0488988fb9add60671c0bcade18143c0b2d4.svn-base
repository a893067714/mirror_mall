package com.iwonder.tea.bas.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.bas.entity.Size;
import com.iwonder.tea.bas.service.ISizeService;
import com.iwonder.tea.bas.service.imp.SizeServiceImp;
import com.iwonder.tea.bas.view.SizeConditionView;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;

@WebServlet("/admin/bas/SizeServlet.do")
public class SizeServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	private ISizeService sizeService = (ISizeService) ProxyServiceFactory.getProxyService(SizeServiceImp.class);

	public SizeServlet() {
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
		String sizeValue = request.getParameter("sizeValue");
		if (StringUtil.isNotEmpty(sizeValue)) {
			sizeValue = sizeValue.trim();
		}
		SizeConditionView scv = new SizeConditionView();
		scv.setSizeValue(sizeValue);

		request.setAttribute("listSize", sizeService.list(scv));
		request.setAttribute("sizeValue", sizeValue);
		
		request.getRequestDispatcher("/WEB-INF/jsp/admin/bas/sizeList.jsp").forward(request, response);
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
		String sizeId = request.getParameter("sizeId");

		// s2.业务逻辑
		sizeService.delete(sizeId);

		// s3.页面跳转：重定向
		response.sendRedirect("/tea_dynamic/admin/bas/SizeServlet.do?method=list");
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
		String sizeId = request.getParameter("sizeId");
		String sizeValue = request.getParameter("sizeValue");

		Size size = new Size();

		size.setSizeId(sizeId);
		size.setSizeValue(sizeValue);

		if (StringUtil.isEmpty(sizeId)) {
			sizeService.insert(size);

		} else {
			sizeService.update(size);
		}
		response.sendRedirect("/tea_dynamic/admin/bas/SizeServlet.do?method=list");

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
		String sizeId = request.getParameter("sizeId");
		Size size = new Size();

		if (StringUtil.isEmpty(sizeId)) {// 新增

		} else {// 修改
			size = sizeService.load(sizeId);
			request.setAttribute("size", size);
		}

		request.getRequestDispatcher("/WEB-INF/jsp/admin/bas/sizeEdit.jsp").forward(request, response);
	}
}