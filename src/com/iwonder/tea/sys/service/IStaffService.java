package com.iwonder.tea.sys.service;

import java.util.ArrayList;

import com.iwonder.tea.sys.entity.Staff;
import com.iwonder.tea.sys.view.StaffConditionView;
import com.iwonder.tea.sys.view.StaffQueryView;

public interface IStaffService {

	public ArrayList<Staff> list();
	
	public ArrayList<StaffQueryView> list(StaffConditionView staffConditionView);
	
	public Staff load(String staffId);
	
	public void insert(Staff staff);
	
	public void update(Staff staff);
	
	public void delete(String staffId);

	public Staff login(Staff staff);
}
