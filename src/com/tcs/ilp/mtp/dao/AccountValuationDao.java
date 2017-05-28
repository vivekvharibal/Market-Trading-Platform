package com.tcs.ilp.mtp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import com.tcs.ilp.mtp.bean.Customer;
import com.tcs.ilp.mtp.bean.Product;
import com.tcs.ilp.mtp.bean.Transaction;
import com.tcs.ilp.mtp.util.HibernateUtil;

public class AccountValuationDao extends HibernateUtil {
	double balance =0;
	public double viewCashBalance( ) throws Exception
	{List<Double> result = new ArrayList<Double>();
	try {
		begin();
		String hql ="SELECT customer.balance FROM Customer customer WHERE customer.userName= userName ";
		Query query =getSession().createQuery(hql);
		result=query.list();
		System.out.println("cash balance");
		commit();
		close();

	} catch (Exception e) {
		rollback();
	}
	return result.get(0) ;
	}

	public double viewProfitOrLoss() throws Exception
	{
		try {
			begin();
			Object obj= getSession().load(Customer.class,"1");
			Customer customer= (Customer)obj;
			System.out.println(customer.getCountry());
			System.out.println("Customer searched successfully");
			int j=0;
			Transaction t=new Transaction();
			Product product=new Product(); 
			Set<Transaction> transactionSet= customer.getTransaction();
			ArrayList<Transaction> transactionList=new ArrayList<Transaction>(transactionSet);

			double [] profitAndLoss =new double[transactionList.size()];
			for(Transaction transactions:transactionList)
			{
				if(transactions.getTransactionType().equals("buy"))
				{	
					int NoOfShares = transactions.getNoOfShares();
					System.out.println("NoOfshares");
				}
				double pl=((transactions.getNoOfShares()*product.getSellPrice())-(transactions.getNoOfShares()*product.getBuyPrice()));
				System.out.println(pl);
				profitAndLoss[j++]=pl;

			}
			int total=0;
			for(int i=0;i<profitAndLoss.length;i++)
			{
				total+=profitAndLoss[i];
			}
			double agg=total/profitAndLoss.length;
			commit();
			close();
			return agg;
		} catch (Exception e) {
			rollback();
		}
		return 0;
	}

}