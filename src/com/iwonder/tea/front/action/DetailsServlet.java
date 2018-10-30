package com.iwonder.tea.front.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.bas.entity.Brand;
import com.iwonder.tea.bas.entity.Color;
import com.iwonder.tea.bas.entity.Size;
import com.iwonder.tea.bas.service.IBrandService;
import com.iwonder.tea.bas.service.IColorService;
import com.iwonder.tea.bas.service.ISizeService;
import com.iwonder.tea.bas.service.imp.BrandServiceImp;
import com.iwonder.tea.bas.service.imp.ColorServiceImp;
import com.iwonder.tea.bas.service.imp.SizeServiceImp;
import com.iwonder.tea.dictionary.service.IDictionarySKUService;
import com.iwonder.tea.dictionary.service.imp.DictionarySKUServiceImp;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.prd.entity.Product;
import com.iwonder.tea.prd.entity.ProductSku;
import com.iwonder.tea.prd.service.IProductService;
import com.iwonder.tea.prd.service.IProductSkuService;
import com.iwonder.tea.prd.service.imp.ProductServiceImp;
import com.iwonder.tea.prd.service.imp.ProductSkuServiceImp;
import com.iwonder.tea.usr.service.IEvaluateService;
import com.iwonder.tea.usr.service.imp.EvaluateServiceImp;
import com.iwonder.tea.usr.view.EvaluatConditionView;
import com.iwonder.tea.usr.view.EvaluateQueryAllView;

@WebServlet("/DetailsServlet.do")
public class DetailsServlet extends BaseServlet {
	private IEvaluateService iEvaluateService = (IEvaluateService) ProxyServiceFactory
			.getProxyService(EvaluateServiceImp.class);
	private IProductService iProductService = (IProductService) ProxyServiceFactory
			.getProxyService(ProductServiceImp.class);
	private IProductSkuService iProductSkuService = (IProductSkuService) ProxyServiceFactory
			.getProxyService(ProductSkuServiceImp.class);
	private ISizeService iSizeService = (ISizeService) ProxyServiceFactory.getProxyService(SizeServiceImp.class);
	private IColorService iColorService = (IColorService) ProxyServiceFactory.getProxyService(ColorServiceImp.class);
	private IBrandService iBrandService = (IBrandService) ProxyServiceFactory.getProxyService(BrandServiceImp.class);
	private IDictionarySKUService IDictionarySKUService = (IDictionarySKUService) ProxyServiceFactory
			.getProxyService(DictionarySKUServiceImp.class);

	private static final long serialVersionUID = 1L;

	public DetailsServlet() {
		super();
	}

	@SuppressWarnings("unused")
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// String skuId="22ffd13cb9a441a5a534d32833d8bbb3";
		String skuId = request.getParameter("skuId");

		ProductSku productSku = iProductSkuService.load(skuId);
		Product product = iProductService.load(productSku.getProductId());
		Size size = iSizeService.load(productSku.getSizeId());
		Color color = iColorService.load(productSku.getColorId());
		Brand brand = iBrandService.load(product.getBrandId());

		EvaluatConditionView evaluatConditionView = new EvaluatConditionView();
		evaluatConditionView.setProductId(productSku.getProductId());
		ArrayList<EvaluateQueryAllView> listEvaluateView = iEvaluateService.listAllView(evaluatConditionView);

		// evaluatConditionView.setEvaluateNumStatus("0");
		// ArrayList<EvaluateQueryAllView> listEvaluateCount =
		// iEvaluateService.listAllView(evaluatConditionView);

		// 传递对象数据
		request.setAttribute("productSku", productSku);
		request.setAttribute("product", product);
		request.setAttribute("size", size);
		request.setAttribute("color", color);
		request.setAttribute("brand", brand);
		// request.setAttribute("listEvaluate", listEvaluate);
		request.setAttribute("listEvaluateView", listEvaluateView);
		// request.setAttribute("listEvaluateCount", listEvaluateCount);

		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/front/details.jsp").forward(request, response);

	}

	// 方便用户使用
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doGet(request, response);
	}

}