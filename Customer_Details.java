package com.java;

import java.util.Scanner;

public class Customer_Details {

//	ArrayList<Customer_Details> list = new ArrayList<Customer_Details>();
	String a_no = "";
	private String a_deposite = "";
	private String type = "" ,a_name = "" ,a_curr = "" ;
	
	Scanner in = new Scanner(System.in);
	
	
	public void welcome() {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome To Bank Of Attra");
		System.out.println("Please enter your choices to open account ");
	}
	public void A_Details() {
		
		System.out.println("Open a Account ? Press y/n");
		int choice = in.next().charAt(0);
		
		
		while(choice != 'n')
		{
			System.out.println("Enter Account Type (Saving/Current)------");
			
			setType(in.nextLine());
			if(getType() != null && (getType().equalsIgnoreCase("Saving") || (getType().equalsIgnoreCase("Current")) ) ) 
			{
				System.out.println("Entered Account type is :=> " +getType());
				
			}
			else {
				System.out.println("Entered Account type is Wrong :=> " +getType());
				continue;
			}
	
			
			System.out.println("Enter Account Holdder name :=> ");
			setA_name(in.nextLine());
			if(getA_name() != null && getA_name().length()>0) 
			{
				System.out.println("Entered Act Holder name is :=> " +getA_name());
				
			}
			else {
				System.out.println("Entered Account holder data is Wrong :=> " +getA_name());
				continue;
			}
			
			System.out.println("Enter account currency :=> ");
			
			setA_curr(in.nextLine());
			if(getA_curr() != null && (getA_curr().equalsIgnoreCase("INR") || getA_curr().equalsIgnoreCase("USD"))) 
			{
				System.out.println("Entered Act Holder currency is :=> " +getA_curr());
			
				
			}
			else {
				System.out.println("Entered Account holder data is Wrong :=> " +getA_name());
				continue;
			}
			
			System.out.println("Enter account Number :=> ");
			
			setA_no(in.nextLine());
			if(getA_no() != null && getA_no().length() < 15) 
			{
				System.out.println("Entered Act no is :=> " +getA_no());
			
				
			}
			else {
				System.out.println("Entered Account no data is Wrong :=> " +getA_no());
				continue;
			}
			
			System.out.println("Enter amount to deposite :=> ");
			
			setA_deposite(in.nextLine());
			if(getA_deposite() != null && a_no.length() < 12) 
			{
				System.out.println("you have deposited  :=> " +getA_deposite());
				
			}
			else {
				System.out.println("Entered Wrong deposite amount :=> " +getA_deposite());
				continue;
			}
			
		
			System.out.println("Thanks for adding detials we will save it to database");
			
			System.out.println("Do you want to add again?");
			choice = in.next().charAt(0);
			
			
		}
		
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getA_deposite() {
		return a_deposite;
	}
	public void setA_deposite(String a_deposite) {
		this.a_deposite = a_deposite;
	}
	public String getA_curr() {
		return a_curr;
	}
	public void setA_curr(String a_curr) {
		this.a_curr = a_curr;
	}
	public String getA_no() {
		return a_no;
	}
	public void setA_no(String a_no) {
		this.a_no = a_no;
	}
	
	
}
	


