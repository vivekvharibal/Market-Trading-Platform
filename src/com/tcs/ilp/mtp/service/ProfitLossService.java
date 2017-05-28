package com.tcs.ilp.mtp.service;

import com.tcs.ilp.mtp.dao.ProfitLossDao;

public class ProfitLossService {

	public double viewProfitLoss() throws Exception {
		ProfitLossDao profitLossDAO = new ProfitLossDao();
		
		double profitLoss =profitLossDAO.viewProfitLossDAO(); 
		return profitLoss;
		
		
		
	}

}
