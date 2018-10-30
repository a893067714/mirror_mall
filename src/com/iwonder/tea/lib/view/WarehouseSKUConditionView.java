package com.iwonder.tea.lib.view;

import java.math.BigDecimal;

public class WarehouseSKUConditionView {
	private String warehouseDtlCode;
	private String productSkuId;
	private String warehouseId;
	private BigDecimal unitPrice;
	private Integer  quantity;
	private BigDecimal totalPrice;
	private String remark;
	public String getWarehouseDtlCode() {
		return warehouseDtlCode;
	}
	public void setWarehouseDtlCode(String warehouseDtlCode) {
		this.warehouseDtlCode = warehouseDtlCode;
	}
	public String getProductSkuId() {
		return productSkuId;
	}
	public void setProductSkuId(String productSkuId) {
		this.productSkuId = productSkuId;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WarehouseSKUConditionView [warehouseDtlCode=");
		builder.append(warehouseDtlCode);
		builder.append(", productSkuId=");
		builder.append(productSkuId);
		builder.append(", warehouseId=");
		builder.append(warehouseId);
		builder.append(", unitPrice=");
		builder.append(unitPrice);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", totalPrice=");
		builder.append(totalPrice);
		builder.append(", remark=");
		builder.append(remark);
		builder.append("]");
		return builder.toString();
	}
}
