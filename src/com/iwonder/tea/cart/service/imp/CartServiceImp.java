package com.iwonder.tea.cart.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.cart.dao.ICartDao;
import com.iwonder.tea.cart.dao.imp.CartDaoImp;
import com.iwonder.tea.cart.entity.Cart;
import com.iwonder.tea.cart.service.ICartService;
import com.iwonder.tea.cart.view.CartConditionView;
import com.iwonder.tea.cart.view.CartQueryView;
import com.iwonder.tea.framework.service.imp.BaseServiceImp;

public class CartServiceImp extends BaseServiceImp implements ICartService {
	private ICartDao cartDao = new CartDaoImp();

	public void insert(Cart cart) {
		cartDao.insert(cart);
	}

	public ArrayList<CartQueryView> list(CartConditionView cartConditionView) {
		return cartDao.list(cartConditionView);
	}

	public Cart load(String cartId) {
		return cartDao.load(cartId);
	}

	public void update(Cart cart) {
		cartDao.update(cart);
	}

	public void update(String cartId, String quality) {
		cartDao.update(cartId, quality);
	}

	public void delete(String cartId) {
		cartDao.delete(cartId);
	}

	public ArrayList<CartQueryView> list(String userId) {
		return cartDao.list(userId);
	}

	@Override
	public CartQueryView loadCart(String cartId) {
		return cartDao.loadCart(cartId);
	}

}
