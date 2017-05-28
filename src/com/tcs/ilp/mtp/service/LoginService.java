package com.tcs.ilp.mtp.service;

import com.tcs.ilp.mtp.bean.User;
import com.tcs.ilp.mtp.dao.LoginDAO;

public class LoginService {

	public User authentionService(User user) throws Exception {
		LoginDAO loginDAO = new LoginDAO();
		User authenticatedUser= loginDAO.authenticationDAO(user);
		return authenticatedUser;
	}

}
