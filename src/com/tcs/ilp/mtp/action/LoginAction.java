package com.tcs.ilp.mtp.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.tcs.ilp.mtp.bean.User;
import com.tcs.ilp.mtp.service.LoginService;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements SessionAware{
	private User user= new User();
	private static Map<String, Object> sessionMap;
	public  Map<String, Object> getSessionMap() {
		return sessionMap;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap=session;

	}

	public String getUserName()
	{
		return (String) getSessionMap().get("userName");
	}

	public String execute(){
		System.out.println("inside execute");
		System.out.println(user.getUserName());
		//		LoginService loginService = new LoginService();
		if((user.getUserName().equals("user1") || user.getUserName().equals("user2")) && (user.getPassword().equals("admin") || user.getPassword().equals("customer"))){
			sessionMap.put("login", "true");
			sessionMap.put("userName", user.getUserName());
			System.out.println(getSessionMap().get("userName"));
			User userLoggedIn = new User();
			userLoggedIn.setUserName(user.getUserName());
			userLoggedIn.setPassword(user.getPassword());
			userLoggedIn.setRole(user.getRole());
			sessionMap.put("userLoggedIn", userLoggedIn);
			return SUCCESS;
		}
		else
			return ERROR;
		//		try {
		//			if(loginService.authentionService(user)!=null)
		//				return SUCCESS;
		//			else
		//				return ERROR;
		//		} catch (Exception e) {
		//			return ERROR;
		//		}


	}
	
	public void setSessionMap(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
	public String logout(){
		 if(sessionMap.containsKey("login")&&sessionMap.containsKey("userId")){
			 sessionMap.remove("login");
			 sessionMap.remove("userId");
		 }
		 return SUCCESS;
	 }
	public void validate(){



	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}




}
