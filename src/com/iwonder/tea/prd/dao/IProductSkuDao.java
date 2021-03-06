package com.iwonder.tea.prd.dao;

import java.util.ArrayList;

import com.iwonder.tea.prd.entity.ProductSku;
import com.iwonder.tea.prd.view.ProductSkuAllConditionView;
import com.iwonder.tea.prd.view.ProductSkuAllQueryView;
import com.iwonder.tea.prd.view.ProductSkuConditionView;
import com.iwonder.tea.prd.view.ProductSkuQueryView;

/**
 * 接口类：数据访问层
 */
public interface IProductSkuDao {

	public ArrayList<ProductSku> list();

	public ArrayList<ProductSkuQueryView> list(ProductSkuConditionView productSkuConditionView);

	public ArrayList<ProductSkuAllQueryView> listAll(ProductSkuAllConditionView pscv);

	public ArrayList<ProductSkuAllQueryView> listAll();

	public void insert(ProductSku productSku);

	public void update(ProductSku sku);

	public void delete(String productSkuId);

	public ProductSku load(String productSkuId);

	public ProductSkuQueryView loadView(String productSkuId);

}
