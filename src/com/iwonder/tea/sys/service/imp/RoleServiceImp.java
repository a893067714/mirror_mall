package com.iwonder.tea.sys.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.sys.dao.IRoleDao;
import com.iwonder.tea.sys.dao.imp.RoleDaoImp;
import com.iwonder.tea.sys.entity.Role;
import com.iwonder.tea.sys.service.IRoleService;
import com.iwonder.tea.sys.view.RoleConditionView;
import com.iwonder.tea.sys.view.RoleQueryView;

public class RoleServiceImp implements IRoleService{
	private IRoleDao roleDao = new RoleDaoImp();

	public ArrayList<RoleQueryView> list(RoleConditionView roleConditionView) {

		return roleDao.list(roleConditionView);

	}
	public ArrayList<Role> list() {
		
		return roleDao.list();
		
	}

	public Role load(String roleId) {

		return roleDao.load(roleId);

	}

	public void insert(Role role) {

		roleDao.insert(role);

	}

	public void update(Role role) {

		roleDao.update(role);

	}

	public void delete(String roleId) {

		roleDao.delete(roleId);
//		addressInfoDao.deleteByStudentId(userId);

	}
}
