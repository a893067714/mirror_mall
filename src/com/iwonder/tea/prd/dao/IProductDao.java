package com.iwonder.tea.prd.dao;

import java.util.ArrayList;

import com.iwonder.tea.prd.entity.Product;
import com.iwonder.tea.prd.view.ProductConditionView;
import com.iwonder.tea.prd.view.ProductQueryView;

/**
 * 接口类：数据访问层
 * 
 * @author Tearell
 *
 */
public interface IProductDao {

	public ArrayList<Product> list();

	public ArrayList<ProductQueryView> list(ProductConditionView productConditionView);

	public void insert(Product product);

	public void update(Product product);

	public void delete(String productId);

	public Product load(String productId);

	public ArrayList<ProductQueryView> list(ProductConditionView productConditionView, int pageIndex, int pageSize);

	public int recordCount(ProductConditionView productConditionView);

}
