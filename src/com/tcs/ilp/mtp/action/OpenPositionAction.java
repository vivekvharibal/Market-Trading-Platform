package com.tcs.ilp.mtp.action;

import java.util.List;

import com.tcs.ilp.mtp.bean.*;
import com.tcs.ilp.mtp.service.OpenPositionService;

public class OpenPositionAction {

	private Market market;
	private Transaction transaction;
	private Product product;
	private Customer customer;
	private List<ViewOpenPosition> viewOpenPositionList;
	OpenPositionService openPositionService = new OpenPositionService();
	
	public List<ViewOpenPosition> getViewOpenPositionList() {
		return viewOpenPositionList;
	}
	public void setViewOpenPositionList(List<ViewOpenPosition> viewOpenPositionList) {
		this.viewOpenPositionList = viewOpenPositionList;
	}

	
	
	public Market getMarket() {
		return market;
	}
	public void setMarket(Market market) {
		this.market = market;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String viewOpenPositionAction()
	{
		
		setViewOpenPositionList(openPositionService.viewOpenPositionService(getCustomer(),getMarket(),getProduct(),getTransaction()));
		return "success";
		
	}
	
}
