package com.tcs.ilp.mtp.service;

import java.util.List;

import com.tcs.ilp.mtp.bean.Customer;
import com.tcs.ilp.mtp.bean.Market;
import com.tcs.ilp.mtp.bean.Product;
import com.tcs.ilp.mtp.bean.Transaction;
import com.tcs.ilp.mtp.bean.ViewOpenPosition;
import com.tcs.ilp.mtp.dao.OpenPositionDao;

public class OpenPositionService {

	OpenPositionDao openPositionDao = new OpenPositionDao();
	
	public List<ViewOpenPosition> viewOpenPositionService(Customer customer, Market market,
			Product product, Transaction transaction) 
	{
		
		return openPositionDao.viewOpenPositionDao(customer,market,product,transaction);
		
		
	}

}
