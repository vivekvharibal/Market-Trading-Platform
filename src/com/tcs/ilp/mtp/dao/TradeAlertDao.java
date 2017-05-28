package com.tcs.ilp.mtp.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;

import com.tcs.ilp.mtp.action.LoginAction;
import com.tcs.ilp.mtp.bean.*;
import com.tcs.ilp.mtp.util.*;

public class TradeAlertDao extends HibernateUtil implements SessionAware {
	
	List<Integer> productIdList = new ArrayList<Integer>();
	

	public void createTradeAlertDao(TradeAlert tradeAlert, Customer customer, Product product) throws Exception {
		try {
			begin();
			System.out.println("enter dao 1");
			//customer = (Customer) getSession().get(Customer.class, new Integer(customer.getCustomerId()));
			String productName = product.getProductName();
			Query query = getSession().createQuery("from Product  where productName =:productName");
			System.out.println("after product query 2 " +productName );
			query.setString("productName",productName);
			product = (Product) query.uniqueResult();
			System.out.println(product.getProductId() +"afer product query 3");
			// product = (Product) getSession().load(Product.class, new Integer(product.getProductId()));
			// System.out.println(market.getMarketId());
			// System.out.println(market.getMarketType());
//			System.out.println(product.getAbbr());
			
			//System.out.println(customer.getBalance());
			System.out.println("before query1");
			LoginAction loginAction = new LoginAction();
			String userName =  (String) loginAction.getSessionMap().get("userName");
			System.out.println(userName);
//			Query customerQuery = getSession().createQuery("from Customer where userName =:userName");
			Query customerQuery = getSession().createSQLQuery("select * from tbl_customer_details where user_name =:userName");
			customerQuery.setString("userName", userName);
			Object[] object = (Object[]) customerQuery.uniqueResult();
			System.out.println(object);
			int id = Integer.parseInt(object[0].toString());
			System.out.println(id +"parsed");
			System.out.println(customer+"is what");
			Customer customer1 = new Customer();
			customer1.setCustomerId(id);
			customer1.setTitle((String)object[1].toString());
			customer1.setFirstName((String)object[2].toString());
			customer1.setLastName((String)object[3].toString());
			customer1.setDob((Date)object[4]);
			customer1.setCountry((String)object[5].toString());
			customer1.setPhone((BigDecimal) object[6]);
			customer1.setMobile((BigDecimal)object[7]);
			customer1.setEmail((String)object[8].toString());

			tradeAlert.setCustomer(customer1);
			tradeAlert.setProduct(product);
			//tradeAlert.setMarket(market);
			//getSession().saveOrUpdate(customer1);
			getSession().saveOrUpdate(tradeAlert);
			commit();
			close();
		} 
		catch (Exception e) {
			e.printStackTrace();
			rollback();
		}
	}

	public List<ViewTradeAlertList> viewTradeAlertDao1(Product product, Transaction transaction,Customer customer) {

		List<Object[]> list2 = new ArrayList<Object[]>();
		
		List<ViewTradeAlertList> list1 = new ArrayList<ViewTradeAlertList>();
		try {
			
			begin();
			//System.out.println("before query1");
			LoginAction loginAction = new LoginAction();
			String userName =  (String) loginAction.getSessionMap().get("userName");
			//System.out.println(userName);
			Query customerIdQuery = getSession().createSQLQuery(" select customer_id from tbl_customer_details where user_name =:userName");
			customerIdQuery.setParameter("userName", userName);
			int customerId = Integer.parseInt(customerIdQuery.uniqueResult().toString());
			//System.out.println(customerId);
			Query query = getSession().createSQLQuery("select tbl_product.product_name,tbl_alert.product_id,tbl_alert.customer_id,tbl_alert.more_than,tbl_alert.less_than,tbl_alert.price from tbl_product Join tbl_alert on tbl_alert.product_id=tbl_product.product_id and tbl_alert.customer_id =:customerId");
			query.setParameter("customerId", customerId);
			list2 = query.list();
			for(Object[] obj1 : list2) {
				ViewTradeAlertList viewTradeAlert = new ViewTradeAlertList();
				viewTradeAlert.setProductName((String)obj1[0]);
			//	System.out.println(viewTradeAlert.getProductName());
				viewTradeAlert.setProductId((BigDecimal)obj1[1]);
				BigDecimal d = ((BigDecimal)obj1[1]);
				int i = d.intValue();
				Integer productId = i;
				productIdList.add(productId);
				System.out.println(viewTradeAlert.getProductId());
				viewTradeAlert.setCustomerId((BigDecimal)obj1[2]);
				viewTradeAlert.setMoreThan((String)obj1[3]);
				viewTradeAlert.setLessThan((String)obj1[4]);
				viewTradeAlert.setPrice((BigDecimal)obj1[5]);
				//System.out.println(viewTradeAlert.getPrice());
				list1.add(viewTradeAlert);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list1;
		
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
		
	}

	public List<OpeningPrice> viewTradeAlertDao2() {
		
		List<OpeningPrice> openingPriceList = new ArrayList<OpeningPrice>();
		List<Double> list = new ArrayList<Double>();
		List<BigDecimal> bigDecimalList = new ArrayList<BigDecimal>();
		
		for(Integer productId : productIdList)
		{
			try {
				System.out.println("product ids are  " +productId);
				Query openingPriceQuery = getSession().createQuery("select openingPrice from Product where productId=:productId");
				openingPriceQuery.setInteger("productId", productId);
				list = openingPriceQuery.list();
				for(Double obj : list)
				{
					OpeningPrice op = new OpeningPrice();
					op.setOpeningPrice(obj);
					System.out.println("opening price are   " +op.getOpeningPrice());
					openingPriceList.add(op);
				}	
				for(OpeningPrice o : openingPriceList)
				{
					System.out.println("come on " +o.getOpeningPrice());
				}
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return openingPriceList;
	}

//	public List viewTradeAlertDao2(Product product, Transaction transaction) {
//
//		List<Object[]> list2 = new ArrayList<Object[]>();
//		try {
//			begin();
//			Query query = getSession().createSQLQuery("select no_of_shares,transaction_price from tbl_transaction");
//			list2 = query.list();
//			for(Object[] obj : list2) {
//				System.out.println(obj[0]);
//				System.out.println(obj[1]);
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list2;
//	}
}
