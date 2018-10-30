package com.iwonder.tea.sys.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.sys.dao.IRoleMenuDao;
import com.iwonder.tea.sys.dao.imp.RoleMenuDaoImp;
import com.iwonder.tea.sys.entity.RoleMenu;
import com.iwonder.tea.sys.service.IRoleMenuService;
import com.iwonder.tea.sys.view.RoleMenuConditionView;
import com.iwonder.tea.sys.view.RoleMenuQueryView;

public class RoleMenuServiceImp implements IRoleMenuService{
	private IRoleMenuDao roleMenuDao = new RoleMenuDaoImp();

	public ArrayList<RoleMenuQueryView> list(RoleMenuConditionView roleMenuConditionView) {

		return roleMenuDao.list(roleMenuConditionView);

	}
	public ArrayList<RoleMenu> list() {
		
		return roleMenuDao.list();
		
	}

	public RoleMenu load(String roleMenuId) {

		return roleMenuDao.load(roleMenuId);

	}

	public void insert(RoleMenu roleMenu) {

		roleMenuDao.insert(roleMenu);

	}

	public void update(RoleMenu roleMenu) {

		roleMenuDao.update(roleMenu);

	}

	public void delete(String roleMenuId) {

		roleMenuDao.delete(roleMenuId);
//		addressInfoDao.deleteByStudentId(userId);

	}
}
