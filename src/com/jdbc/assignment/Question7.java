package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question7 {

	public static void main(String[] args) {
	
			  try {
				  Class.forName("com.mysql.jdbc.Driver");
			  
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mealpha","root","encyclopedia");
			    Statement stmt = con.createStatement();
			  
			    
			    String query = "DROP TABLE department CASCADE CONSTRAINTS ";
			    
			    int result = stmt.executeUpdate(query);
			    System.out.println(result);	            
			   
			    
			    con.close();
			  }
			  catch(Exception e){
				  e.printStackTrace();
			 }
}
}

