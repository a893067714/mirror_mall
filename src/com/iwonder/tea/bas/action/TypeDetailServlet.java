package com.iwonder.tea.bas.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.bas.entity.TypeDetail;
import com.iwonder.tea.bas.service.ITypeBigService;
import com.iwonder.tea.bas.service.ITypeDetailService;
import com.iwonder.tea.bas.service.imp.TypeBigServiceImp;
import com.iwonder.tea.bas.service.imp.TypeDetailServiceImp;
import com.iwonder.tea.bas.view.TypeBigConditionView;
import com.iwonder.tea.bas.view.TypeDetailConditionView;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;

@WebServlet("/admin/bas/TypeDetailServlet.do")
public class TypeDetailServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	private ITypeDetailService typeDetailService = (ITypeDetailService) ProxyServiceFactory
			.getProxyService(TypeDetailServiceImp.class);
	
	private ITypeBigService typeBigService = (ITypeBigService) ProxyServiceFactory
			.getProxyService(TypeBigServiceImp.class);

	public TypeDetailServlet() {
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
	
		String typeDtlName = request.getParameter("typeDtlName");
		String typeBigId = request.getParameter("typeBigId");

		if (StringUtil.isNotEmpty(typeDtlName)) {
			typeDtlName = typeDtlName.trim();
		}

		TypeDetailConditionView tdcv = new TypeDetailConditionView();
		tdcv.setTypeBigId(typeBigId);
		tdcv.setTypeDtlName(typeDtlName);
		
		request.setAttribute("listTypeDetail", typeDetailService.list(tdcv));
		request.setAttribute("listTypeBig", typeBigService.list());
		
		request.setAttribute("typeDtlName", typeDtlName);
		request.setAttribute("typeBigId", typeBigId);
		
		request.getRequestDispatcher("/WEB-INF/jsp/admin/bas/typeDetailList.jsp").forward(request, response);
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
		String typeDetailId = request.getParameter("typeDtlId");

		// s2.业务逻辑
		typeDetailService.delete(typeDetailId);

		// s3.页面跳转：重定向
		response.sendRedirect("/tea_dynamic/admin/bas/TypeDetailServlet.do?method=list");
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
		String typeDtlId = request.getParameter("typeDtlId");
		String typeBigId = request.getParameter("typeBigId");
		String typeDtlName = request.getParameter("typeDtlName");

		TypeDetail typeDetail = new TypeDetail();
		typeDetail.setTypeBigId(typeBigId);
		typeDetail.setTypeDtlId(typeDtlId);
		typeDetail.setTypeDtlName(typeDtlName);
		
		if (StringUtil.isEmpty(typeDtlId)) {
			typeDetailService.insert(typeDetail);

		} else {
			typeDetailService.update(typeDetail);
		}
		response.sendRedirect("/tea_dynamic/admin/bas/TypeDetailServlet.do?method=list");

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
		String typeDtlId = request.getParameter("typeDtlId");
		TypeDetail typeDetail = new TypeDetail();

		request.setAttribute("listTypeBig", typeBigService.list());
		
		if (StringUtil.isEmpty(typeDtlId)) {// 新增

		} else {// 修改
			typeDetail = typeDetailService.load(typeDtlId);
			
			request.setAttribute("typeBigId", typeDetail.getTypeBigId());
			request.setAttribute("typeDetail", typeDetail);
		}

		request.getRequestDispatcher("/WEB-INF/jsp/admin/bas/typeDetailEdit.jsp").forward(request, response);
	}
}