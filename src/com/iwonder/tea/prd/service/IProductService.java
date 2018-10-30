package com.iwonder.tea.prd.service;

import java.util.ArrayList;

import com.iwonder.tea.framework.view.PageView;
import com.iwonder.tea.prd.entity.Product;
import com.iwonder.tea.prd.view.ProductConditionView;
import com.iwonder.tea.prd.view.ProductQueryView;

/**
 * 产品表业务逻辑层
 * 
 * @author Tearell
 *
 */
public interface IProductService {
	public ArrayList<Product> list();

	public ArrayList<ProductQueryView> list(ProductConditionView productConditionView);

	public void insert(Product product);

	public void update(Product product);

	public void delete(String productId);

	public Product load(String productId);

	public PageView page(ProductConditionView productConditionView, int pageIndex, int pageSize);

	public int recordCount(ProductConditionView productConditionView);
}
