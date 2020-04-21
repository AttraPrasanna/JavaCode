package com.java;

import java.util.ArrayList;


public class List_Case {

	public static void main(String[] a)
	{
		
		ArrayList<Customer_Details> list = new ArrayList<Customer_Details>();
		
		Customer_Details d = new Customer_Details();
//		Customer_Details d = new Customer_Details(777544544,1000,"Saving ","Prasanna" ,"INR");
	
		 d.welcome();
		 d.A_Details();
		 
		list.add(d);
		
		System.out.println("Name | Account No | Account Type | Amount | Currency ");
		for(Customer_Details i:list)
		{
			
			System.out.println(i.getA_name()+ "     " + i.getA_no() + "        " +i.getType() +"          " + i.getA_deposite() + "      " + i.getA_curr());
		}
		
		list.retainAll(list);
		
		System.out.println("Name | Account No | Account Type | Amount | Currency ");
		for(Customer_Details i:list)
		{
			
			System.out.println(i.getA_name()+ "     " + i.getA_no() + "        " +i.getType() +"          " + i.getA_deposite() + "      " + i.getA_curr());
		}
		
		list.remove(d);
		
		System.out.println("Account data is deleted");
		System.out.println("Name | Account No | Account Type | Amount | Currency ");
		for(Customer_Details i:list)
		{
			
			System.out.println(i.getA_name()+ "     " + i.getA_no() + "        " +i.getType() +"          " + i.getA_deposite() + "      " + i.getA_curr());
		}
		
		
	}
	

}


