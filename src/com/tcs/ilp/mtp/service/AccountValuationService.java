package com.tcs.ilp.mtp.service;

import java.sql.SQLException;

import com.tcs.ilp.mtp.dao.AccountValuationDao;

public class AccountValuationService {
	public double viewCashBalance() throws Exception 
	{
		double a=0;
	AccountValuationDao d=new AccountValuationDao();
	a=d.viewCashBalance();
	System.out.println("abb");
	return a;


	}

	public double viewProfitOrLoss() throws Exception{


		double b=0.0;
		AccountValuationDao d=new AccountValuationDao();
		b=d.viewProfitOrLoss();
		return b;
	}

}
