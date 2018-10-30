package com.iwonder.tea.bas.dao;

import java.util.ArrayList;

import com.iwonder.tea.bas.entity.TypeBig;
import com.iwonder.tea.bas.view.TypeBigConditionView;

/**
 * 接口类：数据访问层
 * 
 * @author Tearell
 *
 */
public interface ITypeBigDao {

	public ArrayList<TypeBig> list();
	
	public ArrayList<TypeBig> list(TypeBigConditionView typeBigConditionView);

	public void insert(TypeBig typeBig);

	public void update(TypeBig typeBig);

	public void delete(String typeBigId);

	public TypeBig load(String typeBigId);

}
