package com.iwonder.tea.bas.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.bas.entity.Color;
import com.iwonder.tea.bas.service.IColorService;
import com.iwonder.tea.bas.service.imp.ColorServiceImp;
import com.iwonder.tea.bas.view.ColorConditionView;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;

@WebServlet("/admin/bas/ColorServlet.do")
public class ColorServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	private IColorService colorService = (IColorService) ProxyServiceFactory.getProxyService(ColorServiceImp.class);

	public ColorServlet() {
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
		String colorValue = request.getParameter("colorValue");
		if (StringUtil.isNotEmpty(colorValue)) {
			colorValue = colorValue.trim();
		}
		ColorConditionView ccv = new ColorConditionView();
		ccv.setColorValue(colorValue);
		
		request.setAttribute("listColor", colorService.list(ccv));
		request.setAttribute("colorValue", colorValue);
		
		request.getRequestDispatcher("/WEB-INF/jsp/admin/bas/colorList.jsp").forward(request, response);
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
		String colorId = request.getParameter("colorId");

		// s2.业务逻辑
		colorService.delete(colorId);

		// s3.页面跳转：重定向
		response.sendRedirect("/tea_dynamic/admin/bas/ColorServlet.do?method=list");
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
		String colorId = request.getParameter("colorId");
		String colorValue = request.getParameter("colorValue");

		Color color = new Color();

		color.setColorId(colorId);
		color.setColorValue(colorValue);

		if (StringUtil.isEmpty(colorId)) {
			colorService.insert(color);

		} else {
			colorService.update(color);
		}
		
		response.sendRedirect("/tea_dynamic/admin/bas/ColorServlet.do?method=list");

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
		String colorId = request.getParameter("colorId");
		Color color = new Color();

		if (StringUtil.isEmpty(colorId)) {// 新增

		} else {// 修改
			color = colorService.load(colorId);
			request.setAttribute("color", color);
		}

		request.getRequestDispatcher("/WEB-INF/jsp/admin/bas/colorEdit.jsp").forward(request, response);
	}
}