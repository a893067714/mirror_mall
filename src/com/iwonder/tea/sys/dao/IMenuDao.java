package com.iwonder.tea.sys.dao;

import java.util.ArrayList;

import com.iwonder.tea.sys.entity.Menu;
import com.iwonder.tea.sys.view.MenuConditionView;
import com.iwonder.tea.sys.view.MenuQueryView;

public interface IMenuDao {

	public ArrayList<Menu> list();
	
	public ArrayList<MenuQueryView> list(MenuConditionView menuConditionView);
	
	public void delete(String menuId);
	
	public Menu load(String menuId);
	
	public void insert(Menu menu);
	
	public void update(Menu menu);
}
