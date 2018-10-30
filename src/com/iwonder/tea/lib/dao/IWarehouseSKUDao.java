package com.iwonder.tea.lib.dao;

import java.util.ArrayList;

import com.iwonder.tea.lib.entity.Warehouse;
import com.iwonder.tea.lib.entity.WarehouseSKU;
import com.iwonder.tea.lib.view.WarehouseSKUConditionView;
import com.iwonder.tea.lib.view.WarehouseSKUQueryView;
import com.iwonder.tea.ord.entity.Order;

public interface IWarehouseSKUDao {
	public ArrayList<WarehouseSKU> list() ;
	public ArrayList<WarehouseSKUQueryView> list(WarehouseSKUConditionView warehouseSKUConditionView) ;
	public void delete(String warehouseDtlId) ;
	
	public void insert(WarehouseSKU warehouseSKU) ;
	
	public void update(WarehouseSKU warehouseSKU) ;
	
	public WarehouseSKU load(String warehouseDtlId) ;
	
	
}
