package com.iwonder.tea.ord.view;

import java.util.ArrayList;
import java.util.List;

import com.iwonder.tea.ord.entity.Order;

/**
 * @author mirror
 * @version 创建时间：2018年9月25日 下午8:00:05
 * 
 */
public class OrderView extends Order {
	private List<OrderSKUQueryView> listOrderSKU = new ArrayList<>();

	public List<OrderSKUQueryView> getListOrderSKU() {
		return listOrderSKU;
	}

	public void setListOrderSKU(List<OrderSKUQueryView> listOrderSKU) {
		this.listOrderSKU = listOrderSKU;
	}

	@Override
	public String toString() {
		return "OrderView [listOrderSKU=" + listOrderSKU + "]";
	}

}
