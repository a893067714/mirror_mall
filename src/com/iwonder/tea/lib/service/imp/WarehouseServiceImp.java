package com.iwonder.tea.lib.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.framework.service.imp.BaseServiceImp;
import com.iwonder.tea.lib.dao.IWarehouseDao;
import com.iwonder.tea.lib.dao.imp.WarehouseDaoImp;
import com.iwonder.tea.lib.entity.Warehouse;
import com.iwonder.tea.lib.service.IWarehouseService;
import com.iwonder.tea.lib.view.WarehouseConditionView;
import com.iwonder.tea.lib.view.WarehouseQueryView;
import com.iwonder.tea.ord.dao.IOrderDao;
import com.iwonder.tea.ord.dao.imp.OrderDaoImp;
import com.iwonder.tea.ord.entity.Order;
import com.iwonder.tea.ord.service.IOrderService;


public class WarehouseServiceImp extends BaseServiceImp implements IWarehouseService {
	private IWarehouseDao warehouseDao = new WarehouseDaoImp();


	public void insert(Warehouse warehouse) {
		
		warehouseDao.insert(warehouse);
		
	}

	public ArrayList<Warehouse> list() {
		return warehouseDao.list();

	}
	public ArrayList<WarehouseQueryView> list(WarehouseConditionView warehouseConditionView) {
		return warehouseDao.list(warehouseConditionView);

	}

	public Warehouse load(String   warehouseId) {
		
	return warehouseDao.load(warehouseId);
		
		
	}

	public void update(Warehouse warehouse) {
		
		warehouseDao.update(warehouse);
		
		
	}

	public void delete(String warehouseId) {
		warehouseDao.delete(warehouseId);
	

	}

	

	
}
