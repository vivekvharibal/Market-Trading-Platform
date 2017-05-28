package com.tcs.ilp.mtp.bean;

import java.util.Set;

public class Product {

	private int productId;
	private int marketId;
	private String productName;
	private String abbr;
	private int typeId;
	private double openingPrice;
	private double sellPrice;
	private double buyPrice;
	private double dayHigh;
	private double dayLow;
	
	private Market market;
	private Set<TradeAlert> tradeAlert;
	private Transaction transaction;
	private TradeType tradeType;
	private Set<CurrentValues> currentValues;
	
	public Set<CurrentValues> getCurrentValues() {
		return currentValues;
	}
	public void setCurrentValues(Set<CurrentValues> currentValues) {
		this.currentValues = currentValues;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public TradeType getTradeType() {
		return tradeType;
	}
	public void setTradeType(TradeType tradeType) {
		this.tradeType = tradeType;
	}
	public Set<TradeAlert> getTradeAlert() {
		return tradeAlert;
	}
	public void setTradeAlert(Set<TradeAlert> tradeAlert) {
		this.tradeAlert = tradeAlert;
	}
	public Market getMarket() {
		return market;
	}
	public void setMarket(Market market) {
		this.market = market;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getMarketId() {
		return marketId;
	}
	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getAbbr() {
		return abbr;
	}
	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public double getOpeningPrice() {
		return openingPrice;
	}
	public void setOpeningPrice(double openingPrice) {
		this.openingPrice = openingPrice;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public double getDayHigh() {
		return dayHigh;
	}
	public void setDayHigh(double dayHigh) {
		this.dayHigh = dayHigh;
	}
	public double getDayLow() {
		return dayLow;
	}
	public void setDayLow(double dayLow) {
		this.dayLow = dayLow;
	}	
}
