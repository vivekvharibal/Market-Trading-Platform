package com.tcs.ilp.mtp.action;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tcs.ilp.mtp.bean.Customer;
import com.tcs.ilp.mtp.bean.Market;
import com.tcs.ilp.mtp.bean.OpeningPrice;
import com.tcs.ilp.mtp.bean.Product;
import com.tcs.ilp.mtp.bean.TradeAlert;
import com.tcs.ilp.mtp.bean.Transaction;
import com.tcs.ilp.mtp.bean.ViewTradeAlertList;
import com.tcs.ilp.mtp.service.TradeAlertService;

public class AlertAction extends ActionSupport  {

	private static final long serialVersionUID = -3838909734314123939L;
		
	TradeAlert tradeAlert;
	Market market;
	Customer customer;
	Product product;
	Transaction transaction; 
	List<ViewTradeAlertList> viewTradeAlertList; 
	TradeAlertService tradeAlertService = new TradeAlertService();
	List<OpeningPrice> openingPriceList = new ArrayList<OpeningPrice>();
	List<OpeningPrice> currentValueList = new ArrayList<OpeningPrice>();
	
	
	
	
	public List<OpeningPrice> getCurrentValueList() {
		return currentValueList;
	}

	public void setCurrentValueList(List<OpeningPrice> currentValueList) {
		this.currentValueList = currentValueList;
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

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public TradeAlert getTradeAlert() {
		return tradeAlert;
	}

	public void setTradeAlert(TradeAlert tradeAlert) {
		this.tradeAlert = tradeAlert;
	}
	public String createTradeAlertAction() throws Exception {
		System.out.println("hello");
		System.out.println(getProduct().getProductId());
		tradeAlertService.createTradeAlertService(getTradeAlert(),getCustomer(),getProduct());
		System.out.println("hello1");
		return SUCCESS;
}
	public String viewTradeAlertAction() {
		System.out.println("hello");
		setViewTradeAlertList(tradeAlertService.viewTradeAlertService1(getProduct(),getTransaction(),getCustomer()));
		openingPriceList = tradeAlertService.viewTradeAlertService2();
		for(OpeningPrice op : openingPriceList)
		{
			Double o = op.getOpeningPrice();
			Double currentValue = o + Math.random()*15;
			op.setOpeningPrice(currentValue);
			currentValueList.add(op);
			
		}
		return SUCCESS;
	}

	public List<OpeningPrice> getOpeningPriceList() {
		return openingPriceList;
	}

	public void setOpeningPriceList(List<OpeningPrice> openingPriceList) {
		this.openingPriceList = openingPriceList;
	}

	public List<ViewTradeAlertList> getViewTradeAlertList() {
		return viewTradeAlertList;
	}

	public void setViewTradeAlertList(List<ViewTradeAlertList> viewTradeAlertList) {
		this.viewTradeAlertList = viewTradeAlertList;
	}

	

	
	

	
}
