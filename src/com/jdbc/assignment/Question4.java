package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question4 {

	public static void main(String[] args) {
	
			  try {
				Class.forName("com.mysql.jdbc.Driver");
			  
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mealpha","root","encyclopedia");
			    Statement stmt = con.createStatement();
			  
			   /*
			    * <---- This is to insert in the department table-------->  
			    String query = "INSERT INTO department VALUES (11,'xyz','mumbai') , (12,'tanji','chennai') , (13,'abc','Delhi') ";
			    int result = stmt.executeUpdate(query);
			    System.out.println(result);
			   */
			    
			    String query1 = "INSERT INTO employee VALUES (113,'fanaved','khan',26000,'2018-02-12','development',1,'fanavedkhan@gmail.com'),(114,'sabhinav','sharma',12500,'2018-03-22','marketing',3,'sabhinavshamra@gmail.com') , (115,'samrahul','malik',12250,'2018-01-02','administration',4,'samrahulmalik@gmail.com')";

			    int result1 = stmt.executeUpdate(query1);
			    System.out.println(result1);	            
			   
			    
			    con.close();
			  }
			  catch(Exception e){
				  e.printStackTrace();
			 }
}
}

