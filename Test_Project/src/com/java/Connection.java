package com.java;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.sql.Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs= null;
		
		try {
			System.out.println("1");
			
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			
			System.out.println("2");
			
			conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\mydb.accdb");
			
			System.out.println("3");
			
			String sql = "select * from account";
			
			System.out.println("4");
			
			pst = conn.prepareStatement(sql);
			
			System.out.println("5");
			
			rs = pst.executeQuery();
			
			System.out.println("6");
			
			if(rs.next()) {
				
				System.out.println("Conncetion sucessful");
			}
			else {
				System.out.println("Check code ");
			}
			
		}catch(HeadlessException | ClassNotFoundException | SQLException e) {
			
			System.out.println("Hello you are in Catch");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			System.out.println(e.fillInStackTrace());
		}

	}

}
