package com.iwonder.tea.sys.dao;

import java.util.ArrayList;

import com.iwonder.tea.sys.entity.Role;
import com.iwonder.tea.sys.view.RoleConditionView;
import com.iwonder.tea.sys.view.RoleQueryView;

public interface IRoleDao {

	public ArrayList<Role> list();
	
	public ArrayList<RoleQueryView> list(RoleConditionView roleConditionView);
	
	public void delete(String roleId);
	
	public Role load(String roleId);
	
	public void insert(Role role);
	
	public void update(Role role);
}
