package com.tcs.ilp.mtp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tcs.ilp.mtp.util.HibernateUtil;

public class CashBalanceDao extends HibernateUtil {

	@SuppressWarnings("unchecked")
	public double viewCashBalance(String customerId) throws Exception
	{
		List<Double> result = new ArrayList<Double>();
		try {
			begin();
			String hql ="SELECT customer.balance FROM Customer customer WHERE customer.customerId=customerId";
			Query query =getSession().createQuery(hql);
			result=query.list();
			commit();
			close();
			
		} catch (Exception e) {
			
			rollback();
		}
		return result.get(0) ;
	}
	}
