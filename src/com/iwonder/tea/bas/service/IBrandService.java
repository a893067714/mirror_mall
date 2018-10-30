package com.iwonder.tea.bas.service;

import java.util.ArrayList;

import com.iwonder.tea.bas.entity.Brand;
import com.iwonder.tea.bas.view.BrandConditionView;

/**
 * 产品表业务逻辑层
 * @author Tearell
 *
 */
public interface IBrandService {
	public ArrayList<Brand> list();
	
	public ArrayList<Brand> list(BrandConditionView brandConditionView);

	public void insert(Brand brand);

	public void update(Brand brand);

	public void delete(String brandId);

	public Brand load(String brandId);
}
