package com.tcs.ilp.mtp.dao;

import java.util.ArrayList;
import java.util.Set;

import com.tcs.ilp.mtp.bean.Customer;
import com.tcs.ilp.mtp.bean.Product;
import com.tcs.ilp.mtp.bean.Transaction;
import com.tcs.ilp.mtp.util.HibernateUtil;

public class ProfitLossDao extends HibernateUtil{

	private double profitLoss;

	public double viewProfitLossDAO() throws Exception {

		Transaction transaction;
		Product product;
		try {
			begin();

			Customer customer = (Customer)getSession().load(Customer.class,4 );
			//			return customer.getCustomerId();
			transaction=new Transaction();
			product=new Product(); 
			int j = 0;
			Set<Transaction> transactionList= (Set<Transaction>) new ArrayList<Transaction>(customer.getTransaction());

			double [] profitAndLoss =new double[transactionList.size()];

			for(Transaction transactions:transactionList)
			{

				if(transactions.getTransactionType().equals("buy"))
				{	
					int NoOfShares = transactions.getNoOfShares();
					System.out.println("NoOfshares"+NoOfShares);
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
			System.out.println(agg);
			System.out.println(transaction.getNoOfShares()+" "+transaction.getTransactionPrice()+" "+product.getSellPrice());		
			this.setProfitLoss(agg);
			commit();
			close();
			System.out.println("The size of Transaction"+transactionList.size());
			return profitLoss;
		} catch (Exception e) {




			rollback();
		}


		return profitLoss;
	}

	public double getProfitLoss() {
		return profitLoss;
	}

	public void setProfitLoss(double profitLoss) {
		this.profitLoss = profitLoss;
	}




}
