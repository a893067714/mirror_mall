package com.iwonder.tea.ord.service;

import java.util.ArrayList;

import com.iwonder.tea.ord.entity.OrderSKU;
import com.iwonder.tea.ord.view.OrderSKUConditionView;
import com.iwonder.tea.ord.view.OrderSKUQueryView;

public interface IOrderSKUService {
	public void insert(OrderSKU orderSKU);

	public void update(OrderSKU orderSKU);

	public ArrayList<OrderSKU> list();

	public ArrayList<OrderSKUQueryView> list(OrderSKUConditionView orderSKUConditionView);

	public OrderSKU load(String orderDtlId);

	public void delete(String orderDtlId);

	public void deleteByOrderId(String orderId);
}
