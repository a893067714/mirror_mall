package com.iwonder.tea.lib.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.framework.service.imp.BaseServiceImp;
import com.iwonder.tea.lib.dao.IWarehouseSKUDao;
import com.iwonder.tea.lib.dao.imp.WarehouseDaoImp;
import com.iwonder.tea.lib.dao.imp.WarehouseSKUDaoImp;
import com.iwonder.tea.lib.entity.Warehouse;
import com.iwonder.tea.lib.entity.WarehouseSKU;
import com.iwonder.tea.lib.service.IWarehouseSKUService;
import com.iwonder.tea.lib.service.IWarehouseService;
import com.iwonder.tea.lib.view.WarehouseConditionView;
import com.iwonder.tea.lib.view.WarehouseSKUConditionView;
import com.iwonder.tea.lib.view.WarehouseSKUQueryView;
import com.iwonder.tea.ord.dao.IOrderDao;
import com.iwonder.tea.ord.dao.imp.OrderDaoImp;
import com.iwonder.tea.ord.entity.Order;
import com.iwonder.tea.ord.service.IOrderService;


public class WarehouseSKUServiceImp extends BaseServiceImp implements IWarehouseSKUService {
	private IWarehouseSKUDao warehouseSKUDao = new WarehouseSKUDaoImp();


	public void insert(WarehouseSKU warehouseSKU) {
		
		warehouseSKUDao.insert(warehouseSKU);
		
	}

	public ArrayList<WarehouseSKU> list() {
		return warehouseSKUDao.list();

	}
	public ArrayList<WarehouseSKUQueryView> list(WarehouseSKUConditionView warehouseSKUConditionView) {
		return warehouseSKUDao.list(warehouseSKUConditionView);

	}

	public WarehouseSKU load(String   warehouseDtlId) {
		
	return warehouseSKUDao.load(warehouseDtlId);
		
		
	}

	public void update(WarehouseSKU warehouseSKU) {
		
		warehouseSKUDao.update(warehouseSKU);
		
		
	}

	public void delete(String warehouseDtlId) {
		warehouseSKUDao.delete(warehouseDtlId);
	

	}

	

	
}
