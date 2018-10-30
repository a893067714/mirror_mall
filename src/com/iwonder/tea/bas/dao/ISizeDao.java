package com.iwonder.tea.bas.dao;

import java.util.ArrayList;

import com.iwonder.tea.bas.entity.Size;
import com.iwonder.tea.bas.view.SizeConditionView;

/**
 * 接口类：数据访问层
 * 
 * @author Tearell
 *
 */
public interface ISizeDao {

	public ArrayList<Size> list();
	
	public ArrayList<Size> list(SizeConditionView sizeConditionView);

	public void insert(Size size);

	public void update(Size size);

	public void delete(String sizeId);

	public Size load(String sizeId);

}
