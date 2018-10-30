package com.iwonder.tea.front.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.bas.service.IBrandService;
import com.iwonder.tea.bas.service.ITypeBigService;
import com.iwonder.tea.bas.service.imp.BrandServiceImp;
import com.iwonder.tea.bas.service.imp.TypeBigServiceImp;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.prd.service.IProductSkuService;
import com.iwonder.tea.prd.service.imp.ProductSkuServiceImp;
import com.iwonder.tea.prd.view.ProductSkuAllConditionView;

@WebServlet("/IndexServlet.do")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ITypeBigService typeBigService = (ITypeBigService) ProxyServiceFactory
			.getProxyService(TypeBigServiceImp.class);

	private IProductSkuService productSkuService = (IProductSkuService) ProxyServiceFactory
			.getProxyService(ProductSkuServiceImp.class);

	private IBrandService brandService = (IBrandService) ProxyServiceFactory.getProxyService(BrandServiceImp.class);

	public IndexServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("tbvList", typeBigService.listView());
		request.setAttribute("brandList", brandService.list());

		ProductSkuAllConditionView pscv = new ProductSkuAllConditionView();
		pscv.setMajorOpen();
		pscv.setEvalGoodQtyDesc();
		pscv.setLimit(0, 5);
		request.setAttribute("productList", productSkuService.listAll(pscv));

		response.setContentType("text/html; charset=UTF-8");
		request.getRequestDispatcher("/WEB-INF/jsp/front/index.jsp").forward(request, response);

	}

}