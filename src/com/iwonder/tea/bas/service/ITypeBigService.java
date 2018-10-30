package com.iwonder.tea.bas.service;

import java.util.ArrayList;

import com.iwonder.tea.bas.entity.TypeBig;
import com.iwonder.tea.bas.view.TypeBigConditionView;
import com.iwonder.tea.bas.view.TypeBigView;

/**
 * 产品表业务逻辑层
 * @author Tearell
 *
 */
public interface ITypeBigService {
	public ArrayList<TypeBig> list();
	
	public ArrayList<TypeBig> list(TypeBigConditionView typeBigConditionView);
	
	public ArrayList<TypeBigView> listView();

	public void insert(TypeBig typeBig);

	public void update(TypeBig typeBig);

	public void delete(String typeBigId);

	public TypeBig load(String typeBigId);
}
