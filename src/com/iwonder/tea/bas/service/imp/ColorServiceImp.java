package com.iwonder.tea.bas.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.bas.dao.IColorDao;
import com.iwonder.tea.bas.dao.imp.ColorDaoImp;
import com.iwonder.tea.bas.entity.Color;
import com.iwonder.tea.bas.service.IColorService;
import com.iwonder.tea.bas.view.ColorConditionView;

public class ColorServiceImp implements IColorService {

	private IColorDao colorDao = new ColorDaoImp();

	@Override
	public ArrayList<Color> list() {
		return colorDao.list();
	}

	@Override
	public ArrayList<Color> list(ColorConditionView colorConditionView) {

		return colorDao.list(colorConditionView);
	}

	@Override
	public void insert(Color color) {
		colorDao.insert(color);
	}

	@Override
	public void update(Color color) {
		colorDao.update(color);
	}

	@Override
	public void delete(String productId) {
		colorDao.delete(productId);
	}

	@Override
	public Color load(String productId) {

		return colorDao.load(productId);
	}

}
