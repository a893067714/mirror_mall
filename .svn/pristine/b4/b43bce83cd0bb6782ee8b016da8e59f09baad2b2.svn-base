package com.iwonder.tea.lib.dao;

import java.util.ArrayList;

import com.iwonder.tea.lib.entity.Warehouse;
import com.iwonder.tea.lib.view.WarehouseConditionView;
import com.iwonder.tea.lib.view.WarehouseQueryView;
import com.iwonder.tea.ord.entity.Order;

public interface IWarehouseDao {
	public ArrayList<Warehouse> list() ;
	public ArrayList<WarehouseQueryView> list(WarehouseConditionView warehouseConditionView) ;
	public void delete(String warehouseId) ;
	
	public void insert(Warehouse warehouse) ;
	
	public void update(Warehouse warehouse) ;
	
	public Warehouse load(String warehouseId) ;
	
	
}
