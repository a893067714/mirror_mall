package com.iwonder.tea.bas.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.bas.dao.ITypeDetailDao;
import com.iwonder.tea.bas.dao.imp.TypeDetailDaoImp;
import com.iwonder.tea.bas.entity.TypeDetail;
import com.iwonder.tea.bas.service.ITypeDetailService;
import com.iwonder.tea.bas.view.TypeDetailConditionView;
import com.iwonder.tea.bas.view.TypeDetailQueryView;

public class TypeDetailServiceImp implements ITypeDetailService {

	private ITypeDetailDao typeDetailDao = new TypeDetailDaoImp();
	
	@Override
	public ArrayList<TypeDetail> list() {
		return typeDetailDao.list();
	}

	@Override
	public ArrayList<TypeDetailQueryView> list(TypeDetailConditionView typeDetailConditionView) {
		return typeDetailDao.list(typeDetailConditionView);
	}
	
	@Override
	public void insert(TypeDetail typeDetail) {
		typeDetailDao.insert(typeDetail);
	}

	@Override
	public void update(TypeDetail typeDetail) {
		typeDetailDao.update(typeDetail);
	}

	@Override
	public void delete(String productId) {
		typeDetailDao.delete(productId);
	}

	@Override
	public TypeDetail load(String productId) {

		return typeDetailDao.load(productId);
	}

	

}
