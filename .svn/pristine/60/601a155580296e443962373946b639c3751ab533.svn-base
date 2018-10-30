package com.iwonder.tea.front.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.bas.service.IBrandService;
import com.iwonder.tea.bas.service.IColorService;
import com.iwonder.tea.bas.service.ISizeService;
import com.iwonder.tea.bas.service.ITypeDetailService;
import com.iwonder.tea.bas.service.imp.BrandServiceImp;
import com.iwonder.tea.bas.service.imp.ColorServiceImp;
import com.iwonder.tea.bas.service.imp.SizeServiceImp;
import com.iwonder.tea.bas.service.imp.TypeDetailServiceImp;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.prd.service.IProductService;
import com.iwonder.tea.prd.service.IProductSkuService;
import com.iwonder.tea.prd.service.imp.ProductServiceImp;
import com.iwonder.tea.prd.service.imp.ProductSkuServiceImp;
import com.iwonder.tea.prd.view.ProductConditionView;
import com.iwonder.tea.prd.view.ProductSkuAllConditionView;
import com.iwonder.tea.prd.view.ProductSkuConditionView;

@WebServlet("/SearchServlet.do")
public class SearchServlet extends HttpServlet {
	
	
	private IProductSkuService productSkuService = (IProductSkuService) ProxyServiceFactory.getProxyService(ProductSkuServiceImp.class);
	private IBrandService brandService = (IBrandService) ProxyServiceFactory.getProxyService(BrandServiceImp.class);
	private IColorService colorService = (IColorService) ProxyServiceFactory.getProxyService(ColorServiceImp.class);
	private ISizeService sizeService = (ISizeService) ProxyServiceFactory.getProxyService(SizeServiceImp.class);
	private ITypeDetailService typeDetailService = (ITypeDetailService) ProxyServiceFactory.getProxyService(TypeDetailServiceImp.class);

	private static final long serialVersionUID = 1L;

	public SearchServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}  

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
		String colorId = request.getParameter("colorId");
		String sizeId = request.getParameter("sizeId");
		String brandId = request.getParameter("brandId");
		String typeDtlId = request.getParameter("typeDtlId");
		System.out.println(colorId);
	/*	ProductSkuAllConditionView p = new ProductSkuAllConditionView();
//		p.setEvalGoodQty();//好评降序
//		p.setSaleQty();//根据销售数量降序
	//	p.setMajorOpen();//默认
	//	p.setBrandId("1");
	//	p.setColorId("");
		
		productSkuService.listAll(p);*/
		ProductSkuAllConditionView p1 = new ProductSkuAllConditionView();
		p1.setMajorOpen();	
		ProductSkuAllConditionView p2 = new ProductSkuAllConditionView();
		p2.setColorId(colorId);
		p2.setMajorOpen();
		ProductSkuAllConditionView p3 = new ProductSkuAllConditionView();
		p3.setSizeId(sizeId);
		p3.setMajorOpen();
		ProductSkuAllConditionView p4 = new ProductSkuAllConditionView();
		p4.setBrandId(brandId);
		p4.setMajorOpen();
		ProductSkuAllConditionView p5 = new ProductSkuAllConditionView();
		p5.setTypeDtlId(typeDtlId);
		p5.setMajorOpen();
		if(colorId!=null){
			request.setAttribute("listProductSku", productSkuService.listAll(p2));
		}else if(sizeId!=null){
			request.setAttribute("listProductSku", productSkuService.listAll(p3));
		}else if(brandId!=null){
			request.setAttribute("listProductSku", productSkuService.listAll(p4));
		}else if(typeDtlId!=null){
			request.setAttribute("listProductSku", productSkuService.listAll(p5));
		}
		else{
			request.setAttribute("listProductSku", productSkuService.listAll(p1));
		}

		request.setAttribute("listBrand", brandService.list());
		request.setAttribute("listColor", colorService.list());
		
		request.getRequestDispatcher("/WEB-INF/jsp/front/search.jsp").forward(request, response);
	}

}