package com.tcs.ilp.mtp.bean;

public class TradeAlert {

	private int customerId;
	private int marketId;
	private int alertId;
	private String moreThan;
	private String lessThan;
	private double price;
	private int status;
	private Customer customer;
	private Product product;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getMarketId() {
		return marketId;
	}
	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getAlertId() {
		return alertId;
	}
	public void setAlertId(int alertId) {
		this.alertId = alertId;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
