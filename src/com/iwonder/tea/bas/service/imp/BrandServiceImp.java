package com.iwonder.tea.bas.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.bas.dao.IBrandDao;
import com.iwonder.tea.bas.dao.imp.BrandDaoImp;
import com.iwonder.tea.bas.entity.Brand;
import com.iwonder.tea.bas.service.IBrandService;
import com.iwonder.tea.bas.view.BrandConditionView;

public class BrandServiceImp implements IBrandService {

	private IBrandDao brandDao = new BrandDaoImp();

	@Override
	public ArrayList<Brand> list() {
		return brandDao.list();
	}

	@Override
	public ArrayList<Brand> list(BrandConditionView brandConditionView) {
		return brandDao.list(brandConditionView);
	}
	@Override
	public void insert(Brand brand) {
		brandDao.insert(brand);
	}

	@Override
	public void update(Brand brand) {
		brandDao.update(brand);
	}

	@Override
	public void delete(String productId) {
		brandDao.delete(productId);
	}

	@Override
	public Brand load(String productId) {

		return brandDao.load(productId);
	}

	

}
