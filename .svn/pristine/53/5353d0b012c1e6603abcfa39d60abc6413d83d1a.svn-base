package com.iwonder.tea.ord.service;

import java.util.ArrayList;

import com.iwonder.tea.ord.entity.Order;
import com.iwonder.tea.ord.view.OrderConditionView;
import com.iwonder.tea.ord.view.OrderQueryView;
import com.iwonder.tea.ord.view.OrderView;

public interface IOrderService {
	public Order insert(Order order);

	public void update(Order order);

	public ArrayList<Order> list();

	public ArrayList<OrderQueryView> list(OrderConditionView orderConditionView);

	public Order load(String orderId);

	public void delete(String orderId);

	public ArrayList<OrderView> listView(String userId);

}
