package com.iwonder.tea.bas.service;

import java.util.ArrayList;

import com.iwonder.tea.bas.entity.Size;
import com.iwonder.tea.bas.view.SizeConditionView;

/**
 * 产品表业务逻辑层
 * 
 * @author Tearell
 *
 */
public interface ISizeService {
	public ArrayList<Size> list();

	public ArrayList<Size> list(SizeConditionView sizeConditionView);

	public void insert(Size size);

	public void update(Size size);

	public void delete(String sizeId);

	public Size load(String sizeId);
}
