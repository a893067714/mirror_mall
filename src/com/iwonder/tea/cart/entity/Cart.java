package com.iwonder.tea.cart.entity;

public class Cart {

	private String cartId;
	private String cartCode;
	private String productSkuId;
	private String userId;
	private Integer quantity;
	private String statCheck;
	private String statDelete;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public String getProductSkuId() {
		return productSkuId;
	}

	public void setProductSkuId(String productSkuId) {
		this.productSkuId = productSkuId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getStatCheck() {
		return statCheck;
	}

	public void setStatCheck(String statCheck) {
		this.statCheck = statCheck;
	}

	public String getStatDelete() {
		return statDelete;
	}

	public void setStatDelete(String statDelete) {
		this.statDelete = statDelete;
	}

	public String getCartCode() {
		return cartCode;
	}

	public void setCartCode(String cartCode) {
		this.cartCode = cartCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cart [cartId=");
		builder.append(cartId);
		builder.append(", cartCode=");
		builder.append(cartCode);
		builder.append(", productSkuId=");
		builder.append(productSkuId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", statCheck=");
		builder.append(statCheck);
		builder.append(", statDelete=");
		builder.append(statDelete);
		builder.append("]");
		return builder.toString();
	}

}
