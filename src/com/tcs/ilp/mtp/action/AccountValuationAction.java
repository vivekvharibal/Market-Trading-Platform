package com.tcs.ilp.mtp.action;

import com.tcs.ilp.mtp.dao.*;
import java.sql.SQLException;


public class AccountValuationAction {
	double AccountValuation;

	public double getAccountValuation() {
		return AccountValuation;
	}

	public void setAccountValuation(double accountValuation) {
		AccountValuation = accountValuation;
	}

	private static final int CustomerId = 0;
	AccountValuationDao dao=new AccountValuationDao();

	public String viewAccountValuation() throws Exception
	{
		double a=0;
		double b=0;
		
		a= dao.viewCashBalance();
		System.out.println(a);
		b= dao.viewProfitOrLoss();
		AccountValuation=a+b;	 
		return "success";

	}
}
