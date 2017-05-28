package com.tcs.ilp.mtp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tcs.ilp.mtp.service.ProfitLossService;

public class ProfitLossAction extends ActionSupport{

private static final long serialVersionUID = 7957093869631388972L;
private double profitLoss;

public double getProfitLoss() {
	return profitLoss;
}

public void setProfitLoss(double profitLoss) {
	this.profitLoss = profitLoss;
}

public String executeViewProfitLoss(){
	ProfitLossService profitLossService = new ProfitLossService();
	try {
		
		this.setProfitLoss(profitLossService.viewProfitLoss());
		System.out.println(profitLossService.viewProfitLoss());
		return SUCCESS;
	} catch (Exception e) {
		
		e.printStackTrace();
		return ERROR;
	}
	
	
	
}
	
}
