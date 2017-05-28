package com.tcs.ilp.mtp.action;

import java.sql.SQLException;

import com.tcs.ilp.mtp.bean.Customer;
import com.tcs.ilp.mtp.bean.User;
import com.tcs.ilp.mtp.service.CashBalanceService;

public class CashBalanceAction {
private User user;
private double result;
private Customer customer;


public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public double getResult() {
	return result;
}

public void setResult(double result) {
	this.result = result;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}
public String executeViewCashBalance() throws Exception{
	System.out.println("Hello reached user action");
	CashBalanceService customerService=new CashBalanceService();
	double result=customerService.viewCashBalance("4");
	System.out.println("called service and received balance is "+result);
	setResult(result);
	return "success";
}
}
