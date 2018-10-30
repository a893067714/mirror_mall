package com.iwonder.tea.prd.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.prd.dao.IProductSkuDao;
import com.iwonder.tea.prd.dao.imp.ProductSkuDaoImp;
import com.iwonder.tea.prd.entity.ProductSku;
import com.iwonder.tea.prd.service.IProductSkuService;
import com.iwonder.tea.prd.view.ProductSkuAllConditionView;
import com.iwonder.tea.prd.view.ProductSkuAllQueryView;
import com.iwonder.tea.prd.view.ProductSkuConditionView;
import com.iwonder.tea.prd.view.ProductSkuQueryView;

public class ProductSkuServiceImp implements IProductSkuService {

	private IProductSkuDao productSkuDao = new ProductSkuDaoImp();

	@Override
	public ArrayList<ProductSku> list() {
		return productSkuDao.list();
	}

	@Override
	public ArrayList<ProductSkuQueryView> list(ProductSkuConditionView productSkuConditionView) {
		return productSkuDao.list(productSkuConditionView);
	}

	@Override
	public void insert(ProductSku product) {
		productSkuDao.insert(product);
	}

	@Override
	public void update(ProductSku product) {
		productSkuDao.update(product);
	}

	@Override
	public void delete(String productId) {
		productSkuDao.delete(productId);
	}

	@Override
	public ProductSku load(String productId) {
		return productSkuDao.load(productId);
	}

	@Override
	public ArrayList<ProductSkuAllQueryView> listAll() {
		return productSkuDao.listAll();
	}

	@Override
	public ArrayList<ProductSkuAllQueryView> listAll(ProductSkuAllConditionView pscv) {
		return productSkuDao.listAll(pscv);
	}

	@Override
	public ProductSkuQueryView loadView(String productSkuId) {
		return productSkuDao.loadView(productSkuId);
	}

}
