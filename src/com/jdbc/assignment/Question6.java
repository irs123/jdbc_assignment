package com.jdbc.assignment;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.*;  

public class Question6 {

	  
		public static void main(String args[])throws Exception{  
		try{
		Class.forName("com.mysql.jdbc.Driver");  
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mealpha","root","encyclopedia");
		

		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?)");  
		  
		  Scanner sc=new Scanner(System.in);  
       
		  
		  do{  
		System.out.println("Enter employee id");  
		int id=sc.nextInt();  
		System.out.println("enter first name ");  
		String fname=sc.next();  
	
		System.out.println("enter last name ");  
		String lname=sc.next();  
	
		System.out.println("enter salary of the employee");  
		int salary=sc.nextInt();
		
		System.out.println("enter doj ");  
		String doj=sc.next();

	
    	System.out.println("enter department name ");  
		String dept_name=sc.next();  
	
		System.out.println("enter department no ");  
		int dept_no =sc.nextInt();  
	
		System.out.println("enter email  ");  
		String email=sc.next();  
	
	
		
		
		ps.setInt(1,id);  
		ps.setString(2,fname);  
		ps.setString(3,lname);
		ps.setInt(4,salary);  
		ps.setDate(5,java.sql.Date.valueOf(doj) );  
		ps.setString(6,dept_name);  
		ps.setInt(7,dept_no);  
		ps.setString(8,email);  
		
		int i=ps.executeUpdate();  
		System.out.println("no of rows affected"+i);  
		  
		System.out.println("Do you want to continue  y or n");  
		String s=sc.next();  
		
		if(s!="n"){  
		break;  
		}  
		}while(true);  
		  
		con.close();
		sc.close();
		}
		
		catch(Exception e)
		{e.printStackTrace();}

	}
}

