package com.tcs.ilp.mtp.dao;



import com.tcs.ilp.mtp.bean.User;
import com.tcs.ilp.mtp.util.HibernateUtil;

public class LoginDAO extends HibernateUtil {

	public User authenticationDAO(User user) throws Exception {
		User userAuthenticated = null;
		try {
			begin();
			userAuthenticated =(User) getSession().createQuery("from User u where u.userName=:userName and password=:password ").setString("userName", user.getUserName()).setString("password",user.getPassword()).uniqueResult();
			System.out.println(userAuthenticated.getUserName());
			commit();
			close();
		} catch (Exception e) {
			rollback();
		}
		return userAuthenticated;

	}
	}
