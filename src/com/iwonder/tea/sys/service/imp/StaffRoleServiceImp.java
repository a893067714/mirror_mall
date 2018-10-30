package com.iwonder.tea.sys.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.sys.dao.IStaffRoleDao;
import com.iwonder.tea.sys.dao.imp.StaffRoleDaoImp;
import com.iwonder.tea.sys.entity.StaffRole;
import com.iwonder.tea.sys.service.IStaffRoleService;
import com.iwonder.tea.sys.view.StaffRoleConditionView;
import com.iwonder.tea.sys.view.StaffRoleQueryView;

public class StaffRoleServiceImp implements IStaffRoleService {
	private IStaffRoleDao staffRoleDao = new StaffRoleDaoImp();

	public ArrayList<StaffRoleQueryView> list(StaffRoleConditionView staffRoleConditionView) {
		return staffRoleDao.list(staffRoleConditionView);
	}

	public ArrayList<StaffRole> list() {
		return staffRoleDao.list();
	}

	public StaffRole load(String staffRoleId) {
		return staffRoleDao.load(staffRoleId);
	}

	public void insert(StaffRole staffRole) {
		staffRoleDao.insert(staffRole);
	}

	public void update(StaffRole staffRole) {
		staffRoleDao.update(staffRole);
	}

	public void delete(String staffRoleId) {
		staffRoleDao.delete(staffRoleId);
		// addressInfoDao.deleteByStudentId(userId);

	}
}
