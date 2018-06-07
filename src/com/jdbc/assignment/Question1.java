package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question1 {

	public static void main(String[] args) {
	
			  try {
		        Class.forName("com.mysql.jdbc.Driver");
			  
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mealpha","root","encyclopedia");
			    Statement stmt = con.createStatement();
			  
			   /* <------- This is for inserting 10 records in DEPARTMENT table-------> 
			    String query = "INSERT INTO department VALUES (2,'research','mumbai') , (3,'marketing','chennai') , (4,'administration','Delhi') , (5,'production','lucknow') , (6,'HR','Delhi') , (7,'purchasing','jaipur'),(8,'accounting','banglore'),(9,'finance','bangore'),(10,'charity','delhi') ";
			    int result = stmt.executeUpdate(query);
			    System.out.println(result);
			   
			    */
			    String query1 = "INSERT INTO employee VALUES (111,'naved','khan',25000,'2018-02-12','development',1,'navedkhan@gmail.com'),(103,'abhinav','sharma',22500,'2018-03-22','marketing',3,'abhinavshamra@gmail.com') , (104,'rahul','malik',12000,'2018-01-02','administration',4,'rahulmalik@gmail.com') , (105,'sumit','yadav',12500,'2018-02-23','production',5,'sumityadav@gmail.com') , (106,'ravi','dubey',33000,'2018-02-12','HR',6,'ravidubey@gmail.com') , (107,'shayam','sunder',19000,'2018-02-12','purchasing',7,'shayamsunder@gmail.com') , (108,'javed','saifi',18000,'2018-02-12','accounting',8,'javedsaifi@gmailcom') , (109,'mahir','khan',20500,'2018-02-12','finance',9,'mahirkhan@gmail.com') , (110,'harish','saifi',21400,'2018-02-12','charity',10,'harishsaifi@gmail.com') ";
			    int result1 = stmt.executeUpdate(query1);
			    System.out.println(result1);	            
			   
			    
			    con.close();
			  }
			  catch(Exception e){
				  e.printStackTrace();
			 }
}
}

