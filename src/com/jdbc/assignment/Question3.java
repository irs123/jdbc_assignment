package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
	
			  try {
				  Class.forName("com.mysql.jdbc.Driver");
			  
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mealpha","root","encyclopedia");
			   
			    String query=" select  * from employee e,department d where  e.dep_no=d.dep_no and d.dep_name='HR';";
			    Statement stmt = con.createStatement();
			    
			     int c=0;
				  ResultSet rs = stmt.executeQuery(query);
				  
				  String mail="",up_query="";
				  Scanner s1= new Scanner(System.in);
				 
				  while(rs.next()) {
					  c++;
					  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getString(8));
					  //System.out.println("Enter the email for employee with emp_no : "+ rs.getInt(1));
					  mail = s1.nextLine();
					  up_query = "update employee set emp_mail = '"+mail+"' where emp_id= '"+rs.getInt(1)+"'";
					  //System.out.println(up_query);
					  Statement stmt2 = con.createStatement();
					  System.out.println(stmt2.executeUpdate(up_query)+"row updated");
				 
			    
			    con.close();
			  }
		      }
			  catch(Exception e){
				  e.printStackTrace();
			 }
}
}

