package com.iwonder.tea.bas.dao;

import java.util.ArrayList;

import com.iwonder.tea.bas.entity.TypeDetail;
import com.iwonder.tea.bas.view.TypeDetailConditionView;
import com.iwonder.tea.bas.view.TypeDetailQueryView;

/**
 * 接口类：数据访问层
 * 
 * @author Tearell
 *
 */
public interface ITypeDetailDao {

	public ArrayList<TypeDetail> list();
	
	public ArrayList<TypeDetailQueryView> list(TypeDetailConditionView typeDetailConditionView);

	public void insert(TypeDetail typeDetail);

	public void update(TypeDetail typeDetail);

	public void delete(String typeDetailId);

	public TypeDetail load(String typeDetailId);

}
