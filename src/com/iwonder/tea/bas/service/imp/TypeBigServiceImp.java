package com.iwonder.tea.bas.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.bas.dao.ITypeBigDao;
import com.iwonder.tea.bas.dao.ITypeDetailDao;
import com.iwonder.tea.bas.dao.imp.TypeBigDaoImp;
import com.iwonder.tea.bas.dao.imp.TypeDetailDaoImp;
import com.iwonder.tea.bas.entity.TypeBig;
import com.iwonder.tea.bas.service.ITypeBigService;
import com.iwonder.tea.bas.view.TypeBigConditionView;
import com.iwonder.tea.bas.view.TypeBigView;
import com.iwonder.tea.bas.view.TypeDetailConditionView;

public class TypeBigServiceImp implements ITypeBigService {

	private ITypeBigDao typeBigDao = new TypeBigDaoImp();
	private ITypeDetailDao typeBigDaoDetail = new TypeDetailDaoImp();

	@Override
	public ArrayList<TypeBig> list() {
		return typeBigDao.list();
	}

	@Override
	public ArrayList<TypeBig> list(TypeBigConditionView typeBigConditionView) {
		return typeBigDao.list(typeBigConditionView);
	}

	public ArrayList<TypeBigView> listView() {
		ArrayList<TypeBigView> listTypeBigView = new ArrayList<>();
		
		for (TypeBig e : this.list(new TypeBigConditionView())) {
			TypeBigView typeBigView = new TypeBigView();
			
			TypeDetailConditionView tdcv = new TypeDetailConditionView();
			tdcv.setTypeBigId(e.getTypeBigId());

			typeBigView.setTypeBigId(e.getTypeBigId());
			typeBigView.setTypeBigName(e.getTypeBigName());
			typeBigView.setListTypeDetail(typeBigDaoDetail.list(tdcv));
			listTypeBigView.add(typeBigView);
		}

		return listTypeBigView;
	}

	@Override
	public void insert(TypeBig typeBig) {
		typeBigDao.insert(typeBig);
	}

	@Override
	public void update(TypeBig typeBig) {
		typeBigDao.update(typeBig);
	}

	@Override
	public void delete(String productId) {
		typeBigDao.delete(productId);
	}

	@Override
	public TypeBig load(String productId) {

		return typeBigDao.load(productId);
	}

}
