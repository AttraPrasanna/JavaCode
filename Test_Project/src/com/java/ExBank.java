package com.java;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExBank extends Bank
{
	 String type = "" ,a_name = "" ,a_curr = "" ;
	 long a_no = 0 ,a_deposite = 0;
	 char choice;
	 
	public void welcome() {
			// TODO Auto-generated method stub
			
			System.out.println("Welcome To Bank Of Attra");
			System.out.println("Please enter your choices to open account ");
		}
	public void AccountInfo()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Open a Account ? Press y/n");
		
		choice = input.next().charAt(0);
		
		
	 
		while(choice != 'n') 
	    {
			try {
	    	System.out.println("Enter Account Type :\n ");
	        type = input.next();
			}catch(StringIndexOutOfBoundsException e) {
				
				System.out.println(e.getMessage());
				System.out.println("please give name without space");
			}
			
			try {
            System.out.println("Enter Account Holder Name :\n");
            a_name = input.next();
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				System.out.println("please give name without space");
			}
			catch(ArithmeticException e1){
				System.out.println(e1.getMessage());
				System.out.println("you have entered number, please enter name");
			}
			
			try {
	    	System.out.println("Enter Account Number :=> \n");
	        a_no = input.nextLong();
			}catch(NumberFormatException e1) {
				System.out.println(e1.getMessage());
				System.out.println("Number is not in format , Please enter valid account number");
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				System.out.println("entered invalid account number");	
			}
			
			try {
	    	System.out.println("Enter amount to deposite into account :\n");
	    	a_deposite = input.nextLong();
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("Please enter valid format of amount");
			}
			
			try {
	    	System.out.println("Enter Currency  :\n");
	    	a_curr = input.next();
			}catch(IllegalFormatException e) {
				System.out.println(e.getMessage());
				System.out.println("Please enter valid format of currency");
			}
	    	
			display();
	    	
	    	System.out.println("Do you want to continue? press y or n");
	    	choice = input.next().charAt(0);
	    	
	    }	
    	
	}
	
    public void display()
    {
    	
    	
    	if (choice == 'y')
    	{
    		System.out.println("Your Account Type :" +type);
    	
    		System.out.println("Your Account Holder Name :"+a_name);
                    
    		System.out.println("Your Account Number :=> "+a_no);
    		    	
    		System.out.println("Your amount to deposite into account :"+a_deposite);
    		
    		System.out.println("Your Currency  :"+a_curr);
    	}
    	else
    	{
    		System.out.println("you have entered value " +choice);
    		System.out.println("Below account details are created ");
    		System.out.println("Account Type :" +type);
        	
    		System.out.println("Account Holder Name :"+a_name);
                    
    		System.out.println("Account Number :=> "+a_no);
    		    	
    		System.out.println("Amount to deposite into account :"+a_deposite);
    		
    		System.out.println("Currency  :"+a_curr);

    	
    		System.out.println("Thank you for banking with Bank of Attra ");
    	}
    }

	
    
}
