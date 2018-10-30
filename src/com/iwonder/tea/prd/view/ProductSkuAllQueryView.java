package com.iwonder.tea.prd.view;

import java.io.Serializable;
import java.util.Date;

import com.iwonder.tea.prd.entity.ProductSku;

public class ProductSkuAllQueryView extends ProductSku implements Serializable {

	private static final long serialVersionUID = 1L;

	private String productName;
	
	private Date timeToMarket;
	
	private String introduce;
	
	private String shelfStat;
	
	private Integer evalGoodQty;
	
	private Integer evalGeneralQty;
	
	private Integer evalBadQty;
	
	private Integer saleQty;
	
	private String picture;//商品图片
	
	private String colorValue;

	private String sizeValue;
	
	private String brandName;
	
	private String brandPic;
	
	private String typeBigName;
	
	private String typeDtlName;
	
	private String dictionaryDetailLabel;
	
	private Integer qtyTotal;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getTimeToMarket() {
		return timeToMarket;
	}

	public void setTimeToMarket(Date timeToMarket) {
		this.timeToMarket = timeToMarket;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getShelfStat() {
		return shelfStat;
	}

	public void setShelfStat(String shelfStat) {
		this.shelfStat = shelfStat;
	}

	public Integer getEvalGoodQty() {
		return evalGoodQty;
	}

	public void setEvalGoodQty(Integer evalGoodQty) {
		this.evalGoodQty = evalGoodQty;
	}

	public Integer getEvalGeneralQty() {
		return evalGeneralQty;
	}

	public void setEvalGeneralQty(Integer evalGeneralQty) {
		this.evalGeneralQty = evalGeneralQty;
	}

	public Integer getEvalBadQty() {
		return evalBadQty;
	}

	public void setEvalBadQty(Integer evalBadQty) {
		this.evalBadQty = evalBadQty;
	}

	public Integer getSaleQty() {
		return saleQty;
	}

	public void setSaleQty(Integer saleQty) {
		this.saleQty = saleQty;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getColorValue() {
		return colorValue;
	}

	public void setColorValue(String colorValue) {
		this.colorValue = colorValue;
	}

	public String getSizeValue() {
		return sizeValue;
	}

	public void setSizeValue(String sizeValue) {
		this.sizeValue = sizeValue;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandPic() {
		return brandPic;
	}

	public void setBrandPic(String brandPic) {
		this.brandPic = brandPic;
	}

	public String getTypeBigName() {
		return typeBigName;
	}

	public void setTypeBigName(String typeBigName) {
		this.typeBigName = typeBigName;
	}

	public String getTypeDtlName() {
		return typeDtlName;
	}

	public void setTypeDtlName(String typeDtlName) {
		this.typeDtlName = typeDtlName;
	}

	public String getDictionaryDetailLabel() {
		return dictionaryDetailLabel;
	}

	public void setDictionaryDetailLabel(String dictionaryDetailLabel) {
		this.dictionaryDetailLabel = dictionaryDetailLabel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	


	public Integer getQtyTotal() {
		return qtyTotal;
	}

	public void setQtyTotal(Integer qtyTotal) {
		this.qtyTotal = qtyTotal;
	}

	@Override
	public String toString() {
		return "ProductSkuAllQueryView [productName=" + productName + ", timeToMarket=" + timeToMarket + ", introduce="
				+ introduce + ", shelfStat=" + shelfStat + ", evalGoodQty=" + evalGoodQty + ", evalGeneralQty="
				+ evalGeneralQty + ", evalBadQty=" + evalBadQty + ", saleQty=" + saleQty + ", picture=" + picture
				+ ", colorValue=" + colorValue + ", sizeValue=" + sizeValue + ", brandName=" + brandName + ", brandPic="
				+ brandPic + ", typeBigName=" + typeBigName + ", typeDtlName=" + typeDtlName
				+ ", dictionaryDetailLabel=" + dictionaryDetailLabel + ", qtyTotal=" + qtyTotal + "]";
	}

}
