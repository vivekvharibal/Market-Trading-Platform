package com.tcs.ilp.mtp.bean;

import java.math.BigDecimal;
import java.util.Date;

public class ViewOpenPosition {

	private BigDecimal productId;
	private String productName;
	private Date transactionDate;
	private BigDecimal noOfShares;
	private BigDecimal transactionPrice;
	private String transactionType;
	
	public BigDecimal getProductId() {
		return productId;
	}
	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public BigDecimal getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(BigDecimal noOfShares) {
		this.noOfShares = noOfShares;
	}
	public BigDecimal getTransactionPrice() {
		return transactionPrice;
	}
	public void setTransactionPrice(BigDecimal transactionPrice) {
		this.transactionPrice = transactionPrice;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	
	
}
