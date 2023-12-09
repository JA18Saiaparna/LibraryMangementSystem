package com.exp;

public class Bank {

	public static void main(String[] args) {
		int accounts[]= {101,102,103,104,105};
		String names[]= {"Sai","Aparna","Pranu","Charan","Vaibhav"};
		double balance[]= {4000,900,7000,9000,5000};
		for(int i=0;i<accounts.length;i++)
		{
			System.out.println(accounts[i]+" named "+names[i]+" has balance "+balance[i]);
			if(balance[i]<1000)
			{
				try 
				{
				throw new LowBalancedException();
				}
				catch(LowBalancedException e)
				
				{
					System.err.println(names[i]+" your balance is low please deposit mimimum amount");
				}
			}
		}
       
	}

}
