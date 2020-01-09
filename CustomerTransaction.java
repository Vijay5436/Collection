package main2;

import java.util.*;

public class CustomerTransaction {
	public static void main(String args[])
	{
		ArrayList<Customer>  customer = new ArrayList<Customer>();
		Customer customer1 = new Customer("John", 20000D);
		customer1.addTransaction(30000D);
		customer1.addTransaction(50000D);
		customer.add(customer1);
		Customer customer2 = new Customer("Tim", 15000D);
		customer2.addTransaction(20000D);
		customer.add(customer2);
		for(int i=0; i<customer.size();i++)
		{
			Customer ggg= customer.get(i);
			for(int k=0;k<ggg.getName().size();k++)
			{
				String customer_name = ggg.getName().get(k);
				System.out.println(customer_name);
			}
			for(int j=0;j<ggg.getTransaction().size();j++)
			{
				Double transaction = ggg.getTransaction().get(j);
				System.out.println(transaction);
			}
		
		}
		
	}

}
class Customer
{
	private ArrayList<Double> transactions;
	private ArrayList<String> names;
	public Customer(String name, double initialAmount)
	{
		this.names = new ArrayList<String>(); 
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
		addName(name);
		
	}
	
	public void addTransaction(double amount)
	{
		this.transactions.add(amount);
		
	}
	public void addName(String c_name)
	{
		this.names.add(c_name);
	}
	public ArrayList<String>getName()
	{
		return names;
	}
	public ArrayList<Double> getTransaction()
	{
		return transactions;
	}
}