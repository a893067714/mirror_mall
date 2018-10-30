package com.iwonder.tea.lib.service;

import java.util.ArrayList;

import com.iwonder.tea.lib.entity.Warehouse;
import com.iwonder.tea.lib.view.WarehouseConditionView;
import com.iwonder.tea.lib.view.WarehouseQueryView;
import com.iwonder.tea.ord.entity.Order;

public interface IWarehouseService {
	public void insert(Warehouse warehouse) ;
	
	public void update(Warehouse warehouse) ;
	
	public ArrayList<WarehouseQueryView> list(WarehouseConditionView warehouseConditionView);
	
	public Warehouse load(String warehouseId);
	
	public void delete(String warehouseId) ;
	
}
