package com.iwonder.tea.ord.dao;

import java.util.ArrayList;

import com.iwonder.tea.ord.entity.OrderSKU;
import com.iwonder.tea.ord.view.OrderSKUConditionView;
import com.iwonder.tea.ord.view.OrderSKUQueryView;

public interface IOrderSKUDao {
	public ArrayList<OrderSKU> list();

	public ArrayList<OrderSKUQueryView> list(OrderSKUConditionView orderSKUConditionView);

	public void delete(String orderDtlId);

	public void insert(OrderSKU orderSKU);

	public void update(OrderSKU orderSKU);

	public OrderSKU load(String orderDtlId);

	public void deleteByOrderId(String orderId);
}
