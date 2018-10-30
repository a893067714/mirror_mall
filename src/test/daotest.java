package test;

import java.util.ArrayList;

import org.junit.Test;

import com.iwonder.tea.constant.DictConstant;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.view.PageView;
import com.iwonder.tea.prd.dao.IProductDao;
import com.iwonder.tea.prd.dao.imp.ProductDaoImp;
import com.iwonder.tea.prd.service.IProductService;
import com.iwonder.tea.prd.service.imp.ProductServiceImp;
import com.iwonder.tea.prd.view.ProductConditionView;
import com.iwonder.tea.prd.view.ProductQueryView;

public class daotest {
	private IProductService productService = (IProductService) ProxyServiceFactory
			.getProxyService(ProductServiceImp.class);

	@Test
	public void daocheck() {
		ProductConditionView productConditionView = new ProductConditionView();

		PageView pageView = productService.page(productConditionView, 0, 3);
		ArrayList list = pageView.getList();

		System.out.println(pageView.getList());
		System.out.println(pageView.getPageCount());
		System.out.println(pageView.getPageSize());
	}
}
