package com.iwonder.tea.prd.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.framework.view.PageView;
import com.iwonder.tea.prd.dao.IProductDao;
import com.iwonder.tea.prd.dao.imp.ProductDaoImp;
import com.iwonder.tea.prd.entity.Product;
import com.iwonder.tea.prd.service.IProductService;
import com.iwonder.tea.prd.view.ProductConditionView;
import com.iwonder.tea.prd.view.ProductQueryView;

public class ProductServiceImp implements IProductService {

	private IProductDao productDao = new ProductDaoImp();

	@Override
	public ArrayList<Product> list() {
		return productDao.list();
	}

	@Override
	public ArrayList<ProductQueryView> list(ProductConditionView productConditionView) {
		return productDao.list(productConditionView);
	}

	@Override
	public void insert(Product product) {
		productDao.insert(product);
	}

	@Override
	public void update(Product product) {
		productDao.update(product);
	}

	@Override
	public void delete(String productId) {
		productDao.delete(productId);
	}

	@Override
	public Product load(String productId) {
		return productDao.load(productId);
	}

	@Override
	public PageView page(ProductConditionView productConditionView, int pageIndex, int pageSize) {
		ArrayList<ProductQueryView> list = productDao.list(productConditionView, pageIndex, pageSize);
		int recordCount = productDao.recordCount(productConditionView);
		PageView pageView = new PageView();
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
		pageView.setList(list);
		pageView.setRecordCount(recordCount);
		int pageCount = (recordCount - 1) / pageSize + 1;
		pageView.setPageCount(pageCount);
		return pageView;
	}

	@Override
	public int recordCount(ProductConditionView productConditionView) {
		return productDao.recordCount(productConditionView);
	}

}
