package com.iwonder.tea.prd.action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.bas.service.IBrandService;
import com.iwonder.tea.bas.service.ITypeDetailService;
import com.iwonder.tea.bas.service.imp.BrandServiceImp;
import com.iwonder.tea.bas.service.imp.TypeDetailServiceImp;
import com.iwonder.tea.constant.DictConstant;
import com.iwonder.tea.dictionary.service.IDictionarySKUService;
import com.iwonder.tea.dictionary.service.imp.DictionarySKUServiceImp;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.framework.view.PageView;
import com.iwonder.tea.prd.entity.Product;
import com.iwonder.tea.prd.service.IProductService;
import com.iwonder.tea.prd.service.IProductSkuService;
import com.iwonder.tea.prd.service.imp.ProductServiceImp;
import com.iwonder.tea.prd.service.imp.ProductSkuServiceImp;
import com.iwonder.tea.prd.view.ProductConditionView;
import com.iwonder.tea.prd.view.ProductSkuConditionView;

@WebServlet("/admin/product/ProductServlet.do")
public class ProductServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	private IProductService productService = (IProductService) ProxyServiceFactory
			.getProxyService(ProductServiceImp.class);

	private IBrandService brandService = (IBrandService) ProxyServiceFactory.getProxyService(BrandServiceImp.class);

	private ITypeDetailService typeDetailService = (ITypeDetailService) ProxyServiceFactory
			.getProxyService(TypeDetailServiceImp.class);

	private IDictionarySKUService dictionarySKUService = (IDictionarySKUService) ProxyServiceFactory
			.getProxyService(DictionarySKUServiceImp.class);

	private IProductSkuService productSkuService = (IProductSkuService) ProxyServiceFactory
			.getProxyService(ProductSkuServiceImp.class);

	public ProductServlet() {
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
		String productName = request.getParameter("productName");
		String brandId = request.getParameter("brandId");
		String typeDtlId = request.getParameter("typeDtlId");
		String shelfStat = request.getParameter("shelfStat");
		String timePrevious = request.getParameter("timePrevious");
		String timeLater = request.getParameter("timeLater");

		if (StringUtil.isNotEmpty(productName)) {
			productName = productName.trim();
		}
		// pageSize , pageIndex
		String strPageSize = request.getParameter("pageSize");
		int pageSize = 3;
		if (!StringUtil.isEmpty(strPageSize)) {
			pageSize = Integer.parseInt(strPageSize);
		}

		String strPageIndex = request.getParameter("pageIndex");
		int pageIndex = 0;
		if (!StringUtil.isEmpty(strPageIndex)) {
			pageIndex = Integer.parseInt(strPageIndex);
		}

		ProductConditionView pcv = new ProductConditionView();
		pcv.setProductName(productName);
		pcv.setBrandId(brandId);
		pcv.setTypeDtlId(typeDtlId);
		pcv.setShelfStat(shelfStat);
		pcv.setTimePrevious(StringUtil.parseDate(timePrevious));
		pcv.setTimeLater(StringUtil.parseDate(timeLater));
		
		PageView pageView = productService.page(pcv, pageIndex, pageSize);
		request.setAttribute("listProduct", productService.list(pcv));
		request.setAttribute("listBrand", brandService.list());
		request.setAttribute("listTypeDetail", typeDetailService.list());
		request.setAttribute("listDictionarySku", dictionarySKUService.findByDictCode(DictConstant.SHELF_STATUS));

		request.setAttribute("pcv", pcv);
		request.setAttribute("timePrevious", timePrevious);
		request.setAttribute("timeLater", timeLater);
		request.setAttribute("pageView", pageView);
		request.getRequestDispatcher("/WEB-INF/jsp/admin/product/productList.jsp").forward(request, response);
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
		String productId = request.getParameter("productId");

		// s2.业务逻辑
		productService.delete(productId);

		// s3.页面跳转：重定向
		response.sendRedirect("/tea_dynamic/admin/product/ProductServlet.do?method=list");
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

		String productId = request.getParameter("productId");
		String typeDtlId = request.getParameter("typeDtlId");
		String brandId = request.getParameter("brandId");
		String name = request.getParameter("name");
		String timeToMarket = request.getParameter("timeToMarket");
		String introduce = request.getParameter("introduce");
		String shelfStat = request.getParameter("shelfStat");
		String evalGoodQty = request.getParameter("evalGoodQty");
		String evalGeneralQty = request.getParameter("evalGeneralQty");
		String evalBadQty = request.getParameter("evalBadQty");
		String saleQty = request.getParameter("saleQty");
		String picture = request.getParameter("picture");
		String skuCode = request.getParameter("skuCode");

		Product product = new Product();

		product.setProductId(productId);
		product.setTypeDtlId(typeDtlId);
		product.setBrandId(brandId);
		product.setName(name);
		Date date = StringUtil.parseDate(timeToMarket);
		product.setTimeToMarket(date);
		product.setIntroduce(introduce);
		product.setShelfStat(shelfStat);
		product.setEvalGoodQty(StringUtil.parseInteger(evalGoodQty));
		product.setEvalGeneralQty(StringUtil.parseInteger(evalGeneralQty));
		product.setEvalBadQty(StringUtil.parseInteger(evalBadQty));
		product.setSaleQty(StringUtil.parseInteger(saleQty));
		product.setPicture(picture);
		product.setMajorSkuCode(skuCode);

		if (StringUtil.isEmpty(productId)) {
			productService.insert(product);

		} else {
			productService.update(product);
		}
		response.sendRedirect("/tea_dynamic/admin/product/ProductServlet.do?method=list");

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
		String productId = request.getParameter("productId");
		Product product = new Product();

		if (StringUtil.isEmpty(productId)) {// 新增

		} else {// 修改
			product = productService.load(productId);

			ProductSkuConditionView psv = new ProductSkuConditionView();
			psv.setProductId(productId);

			request.setAttribute("productSku", productSkuService.list(psv));
			request.setAttribute("product", product);
		}

		request.setAttribute("listBrand", brandService.list());
		request.setAttribute("listTypeDetail", typeDetailService.list());
		request.setAttribute("listDictionarySku", dictionarySKUService.findByDictCode(DictConstant.SHELF_STATUS));

		request.getRequestDispatcher("/WEB-INF/jsp/admin/product/productEdit.jsp").forward(request, response);
	}
}