package com.iwonder.tea.sys.service;

import java.util.ArrayList;

import com.iwonder.tea.sys.entity.Role;
import com.iwonder.tea.sys.view.RoleConditionView;
import com.iwonder.tea.sys.view.RoleQueryView;

public interface IRoleService {

	public ArrayList<Role> list();
	
	public ArrayList<RoleQueryView> list(RoleConditionView roleConditionView);
	
	public void delete(String roleId);
	
	public Role load(String roleId);
	
	public void insert(Role role);
	
	public void update(Role role);
}
