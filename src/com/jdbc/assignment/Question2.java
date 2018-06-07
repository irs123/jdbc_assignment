package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question2 {

	public static void main(String[] args) {

		  try {
		   
			Class.forName("com.mysql.jdbc.Driver");
		  
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mealpha","root","encyclopedia");
		    Statement stmt = con.createStatement();
		    
			String query=" select distinct * from employee e,department d where emp_salary = (select distinct salary from employee order by salary desc limit 2,1) and e.dep_no=d.dep_no order by salary desc;";
		    
		    ResultSet rs = stmt.executeQuery(query);
		    while(rs.next())
		   {
				  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getString(8)+" "+rs.getString(11));
		   }    
	      con.close();
		  }
		  
		  catch(Exception e)
		  {e.printStackTrace();}

}
}
