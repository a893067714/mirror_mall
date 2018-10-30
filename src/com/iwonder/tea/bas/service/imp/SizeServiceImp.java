package com.iwonder.tea.bas.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.bas.dao.ISizeDao;
import com.iwonder.tea.bas.dao.imp.SizeDaoImp;
import com.iwonder.tea.bas.entity.Size;
import com.iwonder.tea.bas.service.ISizeService;
import com.iwonder.tea.bas.view.SizeConditionView;

public class SizeServiceImp implements ISizeService {

	private ISizeDao sizeDao = new SizeDaoImp();

	@Override
	public ArrayList<Size> list() {
		return sizeDao.list();
	}
	
	@Override
	public ArrayList<Size> list(SizeConditionView sizeConditionView) {
		
		return sizeDao.list(sizeConditionView);
	}

	@Override
	public void insert(Size size) {
		sizeDao.insert(size);
	}

	@Override
	public void update(Size size) {
		sizeDao.update(size);
	}

	@Override
	public void delete(String productId) {
		sizeDao.delete(productId);
	}

	@Override
	public Size load(String productId) {

		return sizeDao.load(productId);
	}

	

}
