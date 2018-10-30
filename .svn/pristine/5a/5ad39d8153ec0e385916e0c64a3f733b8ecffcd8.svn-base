package com.iwonder.tea.lib.service;

import java.util.ArrayList;

import com.iwonder.tea.lib.entity.Warehouse;
import com.iwonder.tea.lib.entity.WarehouseSKU;
import com.iwonder.tea.lib.view.WarehouseSKUConditionView;
import com.iwonder.tea.lib.view.WarehouseSKUQueryView;
import com.iwonder.tea.ord.entity.Order;

public interface IWarehouseSKUService {
	public void insert(WarehouseSKU warehouseSKU) ;
	
	public void update(WarehouseSKU warehouseSKU) ;
	
	public ArrayList<WarehouseSKU> list();
	public ArrayList<WarehouseSKUQueryView> list(WarehouseSKUConditionView warehouseSKUConditionView);

	
	public WarehouseSKU load(String warehouseDtlId);
	
	public void delete(String warehouseDtlId) ;
	
}
