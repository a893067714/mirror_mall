package com.iwonder.tea.cart.service;

import java.util.ArrayList;

import com.iwonder.tea.cart.entity.Cart;
import com.iwonder.tea.cart.view.CartConditionView;
import com.iwonder.tea.cart.view.CartQueryView;

public interface ICartService {
	public void insert(Cart cart);

	public void update(Cart cart);

	public ArrayList<CartQueryView> list(CartConditionView cartConditionView);

	public Cart load(String cartId);

	public void delete(String cartId);

	public ArrayList<CartQueryView> list(String userId);

	public void update(String cartId, String quality);

	public CartQueryView loadCart(String cartId);
}
