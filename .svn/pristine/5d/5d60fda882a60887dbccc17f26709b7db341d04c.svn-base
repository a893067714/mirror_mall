package com.iwonder.tea.bas.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.bas.entity.Brand;
import com.iwonder.tea.bas.service.IBrandService;
import com.iwonder.tea.bas.service.imp.BrandServiceImp;
import com.iwonder.tea.bas.view.BrandConditionView;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;

@WebServlet("/admin/bas/BrandServlet.do")
public class BrandServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	private IBrandService brandService = (IBrandService) ProxyServiceFactory.getProxyService(BrandServiceImp.class);

	public BrandServlet() {
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

		String brandName = request.getParameter("brandName");
		
		if (StringUtil.isNotEmpty(brandName)) {
			brandName = brandName.trim();
		}
		
		BrandConditionView bcv = new BrandConditionView();
		bcv.setBrandName(brandName);
		
		request.setAttribute("listBrand", brandService.list(bcv));
		
		request.setAttribute("brandName", brandName);

		request.getRequestDispatcher("/WEB-INF/jsp/admin/bas/brandList.jsp").forward(request, response);
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
		String brandId = request.getParameter("brandId");

		// s2.业务逻辑
		brandService.delete(brandId);

		// s3.页面跳转：重定向
		response.sendRedirect("/tea_dynamic/admin/bas/BrandServlet.do?method=list");
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
		String brandId = request.getParameter("brandId");
		String name = request.getParameter("name");
		String brandPic = request.getParameter("brandPic");

		Brand brand = new Brand();

		brand.setBrandId(brandId);
		brand.setName(name);
		brand.setBrandPic(brandPic);
		
		if (StringUtil.isEmpty(brandId)) {
			brandService.insert(brand);

		} else {
			brandService.update(brand);
		}
		response.sendRedirect("/tea_dynamic/admin/bas/BrandServlet.do?method=list");

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
		String brandId = request.getParameter("brandId");
		Brand brand = new Brand();

		if (StringUtil.isEmpty(brandId)) {

		} else {
			brand = brandService.load(brandId);
			request.setAttribute("brand", brand);
		}

		request.getRequestDispatcher("/WEB-INF/jsp/admin/bas/brandEdit.jsp").forward(request, response);
	}
}