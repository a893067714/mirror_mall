package com.iwonder.tea.prd.view;

import java.io.Serializable;
import java.util.Date;

public class ProductSkuAllConditionView implements Serializable {

	private static final long serialVersionUID = 1L;

	private String productName;// 产品名称

	private Date timePrevious;// 上市时间区间

	private Date timeLater;// 上市时间区间

	private String evalGoodQtyDesc;// 好评数量升序

	private String saleQtyDesc;// 销售总数升序

	private String evalGoodQtyAsc;// 好评数量

	private String saleQtyAsc;// 销售总数降序

	private String colorId;// 颜色ID

	private String sizeId;// 尺码ID

	private String brandId;// 品牌ID

	private String typeBigId;// 大分类ID

	private String typeDtlId;// 小分类ID

	private String major;// 主SKU

	private Integer limitPage;

	private Integer limitIndex;
	
	private String limit;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getTimePrevious() {
		return timePrevious;
	}

	public void setTimePrevious(Date timePrevious) {
		this.timePrevious = timePrevious;
	}

	public Date getTimeLater() {
		return timeLater;
	}

	public void setTimeLater(Date timeLater) {
		this.timeLater = timeLater;
	}

	public void setEvalGoodQtyDesc() {
		this.evalGoodQtyDesc = "open";
	}

	public void setSaleQtyDesc() {
		this.saleQtyDesc = "open";
	}

	public void setEvalGoodQtyAsc() {
		this.evalGoodQtyAsc = "open";
	}

	public void setSaleQtyAsc() {
		this.saleQtyAsc = "open";
	}

	public String getColorId() {
		return colorId;
	}

	public void setColorId(String colorId) {
		this.colorId = colorId;
	}

	public String getSizeId() {
		return sizeId;
	}

	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getTypeBigId() {
		return typeBigId;
	}

	public void setTypeBigId(String typeBigId) {
		this.typeBigId = typeBigId;
	}

	/**
	 * 好评数降序
	 * 
	 * @return
	 */
	public String getEvalGoodQtyDesc() {
		return evalGoodQtyDesc;
	}

	/**
	 * 销量降序
	 * 
	 * @return
	 */
	public String getSaleQtyDesc() {
		return saleQtyDesc;
	}

	/**
	 * 好评数升序
	 * 
	 * @return
	 */
	public String getEvalGoodQtyAsc() {
		return evalGoodQtyAsc;
	}

	/**
	 * 销量升序
	 * 
	 * @return
	 */
	public String getSaleQtyAsc() {
		return saleQtyAsc;
	}

	public String getTypeDtlId() {
		return typeDtlId;
	}

	public void setTypeDtlId(String typeDtlId) {
		this.typeDtlId = typeDtlId;
	}

	public void setMajorOpen() {
		this.major = "open";
	}

	public String getMajor() {
		return major;
	}

	/**
	 * 分页查询
	 * 
	 * @param limitPage
	 * @param limitIndex
	 */
	public void setLimit(Integer limitPage, Integer limitIndex) {
		this.limitPage = limitPage;
		this.limitIndex = limitIndex;
		this.limit = "open";
	}

	public String getLimit() {
		return limit;
	}

	public Integer getLimitPage() {
		return limitPage;
	}

	public Integer getLimitIndex() {
		return limitIndex;
	}

	@Override
	public String toString() {
		return "ProductSkuAllConditionView [productName=" + productName + ", timePrevious=" + timePrevious
				+ ", timeLater=" + timeLater + ", evalGoodQtyDesc=" + evalGoodQtyDesc + ", saleQtyDesc=" + saleQtyDesc
				+ ", evalGoodQtyAsc=" + evalGoodQtyAsc + ", saleQtyAsc=" + saleQtyAsc + ", colorId=" + colorId
				+ ", sizeId=" + sizeId + ", brandId=" + brandId + ", typeBigId=" + typeBigId + ", typeDtlId="
				+ typeDtlId + ", major=" + major + ", limitPage=" + limitPage + ", limitIndex=" + limitIndex + "]";
	}
}
