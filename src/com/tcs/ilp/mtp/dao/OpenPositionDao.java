package com.tcs.ilp.mtp.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import com.tcs.ilp.mtp.bean.*;
import com.tcs.ilp.mtp.util.*;

public class OpenPositionDao extends HibernateUtil {

	public List<ViewOpenPosition> viewOpenPositionDao(Customer customer, Market market,
			Product product, Transaction transaction)
	{
		List<ViewOpenPosition> list1 = new ArrayList<ViewOpenPosition>();
		List<Object[]> list2 = new ArrayList<Object[]>();
		ViewOpenPosition viewOpenPosition = new ViewOpenPosition();
		try{
			
			begin();
			Query query = getSession().createSQLQuery("select tbl_product.product_name,tbl_transaction.product_id,tbl_transaction.transaction_date,tbl_transaction.no_of_shares,tbl_transaction.transaction_price,tbl_transaction.transaction_type from tbl_transaction join tbl_product on tbl_transaction.product_id=tbl_product.product_id");
			list2 = query.list();
			for(Object[] obj : list2)
			{
				viewOpenPosition.setProductName((String)obj[0]);
				viewOpenPosition.setProductId((BigDecimal)obj[1]);
				viewOpenPosition.setTransactionDate((Date)obj[2]);
				viewOpenPosition.setNoOfShares((BigDecimal)obj[3]);
				viewOpenPosition.setTransactionPrice((BigDecimal)obj[4]);
				viewOpenPosition.setTransactionType((String)obj[5]);
				list1.add(viewOpenPosition);
			}
		}
		catch(Exception e) {
			
		}
		return list1;
	}

	
	
}
