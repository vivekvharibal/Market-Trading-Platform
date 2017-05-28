package com.tcs.ilp.mtp.service;

import java.util.ArrayList;
import java.util.List;

import com.tcs.ilp.mtp.bean.Customer;
import com.tcs.ilp.mtp.bean.Market;
import com.tcs.ilp.mtp.bean.OpeningPrice;
import com.tcs.ilp.mtp.bean.Product;
import com.tcs.ilp.mtp.bean.TradeAlert;
import com.tcs.ilp.mtp.bean.Transaction;
import com.tcs.ilp.mtp.bean.ViewTradeAlertList;
import com.tcs.ilp.mtp.dao.TradeAlertDao;

public class TradeAlertService {

	TradeAlertDao tradeAlertDao = new TradeAlertDao();
	
	public void createTradeAlertService(TradeAlert tradeAlert, Customer customer, Product product) throws Exception {
		tradeAlertDao.createTradeAlertDao(tradeAlert,customer,product);
		System.out.println("inside service");	
	}

	public List<ViewTradeAlertList> viewTradeAlertService1(Product  product, Transaction transaction, Customer customer) {
		System.out.println("inside view service");
		return tradeAlertDao.viewTradeAlertDao1(product,transaction,customer);
	}	
//	public List viewTradeAlertService2(Product  product, Transaction transaction) {
//		System.out.println("inside view service");
//		return tradeAlertDao.viewTradeAlertDao2(product,transaction);
//	}

	public List<OpeningPrice> viewTradeAlertService2() {

		 
		return tradeAlertDao.viewTradeAlertDao2();
	}
}
