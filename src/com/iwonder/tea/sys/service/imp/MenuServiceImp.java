package com.iwonder.tea.sys.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.sys.dao.IMenuDao;
import com.iwonder.tea.sys.dao.imp.MenuDaoImp;
import com.iwonder.tea.sys.entity.Menu;
import com.iwonder.tea.sys.service.IMenuService;
import com.iwonder.tea.sys.view.MenuConditionView;
import com.iwonder.tea.sys.view.MenuQueryView;

public class MenuServiceImp implements IMenuService{
	private IMenuDao menuDao = new MenuDaoImp();

	public ArrayList<MenuQueryView> list(MenuConditionView menuConditionView) {

		return menuDao.list(menuConditionView);

	}
	public ArrayList<Menu> list() {
		
		return menuDao.list();
		
	}

	public Menu load(String menuId) {

		return menuDao.load(menuId);

	}

	public void insert(Menu menu) {

		menuDao.insert(menu);

	}

	public void update(Menu menu) {

		menuDao.update(menu);

	}

	public void delete(String menuId) {

		menuDao.delete(menuId);
//		addressInfoDao.deleteByStudentId(userId);

	}
}
