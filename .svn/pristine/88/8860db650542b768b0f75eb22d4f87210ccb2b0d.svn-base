package com.iwonder.tea.prd.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.bas.service.IColorService;
import com.iwonder.tea.bas.service.ISizeService;
import com.iwonder.tea.bas.service.imp.ColorServiceImp;
import com.iwonder.tea.bas.service.imp.SizeServiceImp;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.prd.entity.ProductSku;
import com.iwonder.tea.prd.service.IProductService;
import com.iwonder.tea.prd.service.IProductSkuService;
import com.iwonder.tea.prd.service.imp.ProductServiceImp;
import com.iwonder.tea.prd.service.imp.ProductSkuServiceImp;
import com.iwonder.tea.prd.view.ProductSkuConditionView;

@WebServlet("/admin/product/ProductSkuServlet.do")
public class ProductSkuServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	private IProductSkuService productSkuService = (IProductSkuService) ProxyServiceFactory
			.getProxyService(ProductSkuServiceImp.class);

	private IColorService colorService = (IColorService) ProxyServiceFactory.getProxyService(ColorServiceImp.class);

	private ISizeService sizeService = (ISizeService) ProxyServiceFactory.getProxyService(SizeServiceImp.class);

	private IProductService productService = (IProductService) ProxyServiceFactory
			.getProxyService(ProductServiceImp.class);

	public ProductSkuServlet() {
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

		String productId = request.getParameter("productId");
		String colorId = request.getParameter("colorId");
		String sizeId = request.getParameter("sizeId");
		ProductSkuConditionView skucv = new ProductSkuConditionView();
		skucv.setProductId(productId);
		skucv.setColorId(colorId);
		skucv.setSizeId(sizeId);

		request.setAttribute("listSku", productSkuService.list(skucv));
		request.setAttribute("listProduct", productService.list());
		request.setAttribute("listColor", colorService.list());
		request.setAttribute("listSize", sizeService.list());

		request.setAttribute("skucv", skucv);

		request.getRequestDispatcher("/WEB-INF/jsp/admin/product/skuList.jsp").forward(request, response);
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
		String productSkuId = request.getParameter("productSkuId");

		// s2.业务逻辑
		productSkuService.delete(productSkuId);

		// s3.页面跳转：重定向
		response.sendRedirect("/tea_dynamic/admin/product/ProductSkuServlet.do?method=list");
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
		String productSkuId = request.getParameter("productSkuId");
		String skuCode = request.getParameter("skuCode");
		String productId = request.getParameter("productId");
		String colorId = request.getParameter("colorId");
		String sizeId = request.getParameter("sizeId");
		String priceOrigin = request.getParameter("priceOrigin");
		String priceCurrent = request.getParameter("priceCurrent");
		String stock = request.getParameter("stock");
		String picBig = request.getParameter("picBig");
		String picMid = request.getParameter("picMid");
		String picSmall = request.getParameter("picSmall");
		String origin = request.getParameter("origin");

		ProductSku productSku = new ProductSku();

		productSku.setProductSkuId(productSkuId);
		productSku.setSkuCode(skuCode);
		productSku.setProductId(productId);
		productSku.setColorId(colorId);
		productSku.setSizeId(sizeId);
		productSku.setPriceOrigin(StringUtil.parseBigDecimal(priceOrigin));
		productSku.setPriceCurrent(StringUtil.parseBigDecimal(priceCurrent));
		productSku.setStock(Integer.getInteger(stock));
		productSku.setPicBig(picBig);
		productSku.setPicMid(picMid);
		productSku.setPicSmall(picSmall);
		productSku.setOrigin(origin);

		if (StringUtil.isEmpty(productSkuId)) {
			productSkuService.insert(productSku);

		} else {
			productSkuService.update(productSku);
		}
		response.sendRedirect("/tea_dynamic/admin/product/ProductSkuServlet.do?method=list");

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
		String productSkuId = request.getParameter("productSkuId");
		ProductSku productSku = new ProductSku();

		if (StringUtil.isEmpty(productSkuId)) {// 新增

		} else {// 修改
			productSku = productSkuService.load(productSkuId);
			request.setAttribute("productSku", productSku);
		}
		request.setAttribute("listColor", colorService.list());
		request.setAttribute("listSize", sizeService.list());
		request.setAttribute("listProduct", productService.list());
		

		request.getRequestDispatcher("/WEB-INF/jsp/admin/product/skuEdit.jsp").forward(request, response);
	}
}