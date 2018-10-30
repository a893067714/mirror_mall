package test.ql.service;

import org.junit.Test;

import com.iwonder.tea.bas.service.ITypeBigService;
import com.iwonder.tea.bas.service.ITypeDetailService;
import com.iwonder.tea.bas.service.imp.TypeBigServiceImp;
import com.iwonder.tea.bas.service.imp.TypeDetailServiceImp;
import com.iwonder.tea.bas.view.TypeBigView;
import com.iwonder.tea.bas.view.TypeDetailConditionView;
import com.iwonder.tea.bas.view.TypeDetailQueryView;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.prd.service.IProductSkuService;
import com.iwonder.tea.prd.service.imp.ProductSkuServiceImp;
import com.iwonder.tea.prd.view.ProductSkuAllConditionView;

public class TestTypeBigView {
	private ITypeBigService typeBigService = (ITypeBigService) ProxyServiceFactory
			.getProxyService(TypeBigServiceImp.class);
	
	private ITypeDetailService typeDetailService = (ITypeDetailService) ProxyServiceFactory
			.getProxyService(TypeDetailServiceImp.class);
	
	private IProductSkuService productSkuService = (IProductSkuService) ProxyServiceFactory
			.getProxyService(ProductSkuServiceImp.class);
	@Test
	public void test() {
		for (TypeBigView e : typeBigService.listView()) {
			System.out.println(e.getTypeBigName()+"\0"+e.getTypeBigId());
			for (TypeDetailQueryView tdqv : e.getListTypeDetail()) {
				System.out.println(tdqv.getTypeDtlName()+"\0"+tdqv.getTypeDtlId());
			}
			System.out.println();
		}
		
	}
	@Test
	public void test1() {
		typeBigService.list();
	}
	@Test
	public void test2() {
		TypeDetailConditionView tdcv = new TypeDetailConditionView();
		tdcv.setTypeBigId("3");
		
		typeDetailService.list(tdcv);
	}
	@Test
	public void test3() {
		typeDetailService.list();
	}

	@Test
	public void test4() {
		productSkuService.listAll();
	}
	
	@Test
	public void test5() {
		ProductSkuAllConditionView p = new ProductSkuAllConditionView();
//		p.setEvalGoodQty();//好评降序
//		p.setSaleQty();//根据销售数量降序
	//	p.setMajorOpen();//默认
	//	p.setBrandId("1");
	//	p.setColorId("");
		
		
		productSkuService.listAll(p);
	}


}
