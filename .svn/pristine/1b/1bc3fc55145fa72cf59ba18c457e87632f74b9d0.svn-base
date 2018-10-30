package com.iwonder.tea.usr.dao;

import java.util.ArrayList;

import com.iwonder.tea.usr.entity.AddressInfo;
import com.iwonder.tea.usr.view.AddressInfoConditionView;
import com.iwonder.tea.usr.view.AddressInfoQueryView;

public interface IAddressInfoDao {

	public ArrayList<AddressInfo> list();
	
	public ArrayList<AddressInfoQueryView> list(AddressInfoConditionView addressInfoConditionView);
	
	public void delete(String addressId);
	
	public void deleteByStudentId(String userId);
	
	public AddressInfo load(String addressId);
	
	public void insert(AddressInfo addressInfo);
	
	public void update(AddressInfo addressInfo);
	
}
