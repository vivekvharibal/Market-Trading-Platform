package com.tcs.ilp.mtp.bean;

import java.math.BigDecimal;

public class ViewTradeAlertList {

	private String productName;
	private BigDecimal productId;
	private String moreThan;
	private String lessThan;
	private BigDecimal price;
	private BigDecimal customerId;
	
	public BigDecimal getCustomerId() {
		return customerId;
	}
	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public BigDecimal getProductId() {
		return productId;
	}
	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}
	public String getMoreThan() {
		return moreThan;
	}
	public void setMoreThan(String moreThan) {
		this.moreThan = moreThan;
	}
	public String getLessThan() {
		return lessThan;
	}
	public void setLessThan(String lessThan) {
		this.lessThan = lessThan;
	}
	
	
}
