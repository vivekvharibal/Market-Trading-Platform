package com.tcs.ilp.mtp.service;

import com.tcs.ilp.mtp.dao.CashBalanceDao;

public class CashBalanceService {
public double viewCashBalance(String customerId) throws Exception{
	
	System.out.println("Hello reached customer service");
	CashBalanceDao customerDao=new CashBalanceDao();
    double balance= customerDao.viewCashBalance(customerId);
    System.out.println("returned from dao");
    return balance;

}
}
