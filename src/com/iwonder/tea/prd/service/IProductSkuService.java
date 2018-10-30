package com.iwonder.tea.prd.service;

import java.util.ArrayList;

import com.iwonder.tea.prd.entity.ProductSku;
import com.iwonder.tea.prd.view.ProductSkuAllConditionView;
import com.iwonder.tea.prd.view.ProductSkuAllQueryView;
import com.iwonder.tea.prd.view.ProductSkuConditionView;
import com.iwonder.tea.prd.view.ProductSkuQueryView;
/**
 * 产品表业务逻辑层
 * @author Tearell
 *
 */
public interface IProductSkuService {
	public ArrayList<ProductSku> list();
	
	public ArrayList<ProductSkuQueryView> list(ProductSkuConditionView productSkuConditionView);

	public ArrayList<ProductSkuAllQueryView> listAll();
	
	public ArrayList<ProductSkuAllQueryView> listAll(ProductSkuAllConditionView pscv);

	public void insert(ProductSku productSku);

	public void update(ProductSku productSku);

	public void delete(String productSkuId);

	public ProductSku load(String productSkuId);
	
	public ProductSkuQueryView loadView(String productSkuId);
}
