package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {

	public static void main(String[] args) 
	{
		try
		{
    		  Connection con = DriverManager.getConnection
    				  ("jdbc:oracle:thin:@locahost:1521:orcl","java17","java17");
    		  Statement stmt = con.createStatement();
    		  
    		  int k = stmt.executeUpdate
    				("insert into employee values('mk1021','madhu','developer',40000)");
    		  System.out.println("Record Inserted Successfully....");
    		  con.close();
    	  }//try
			/*
			 * catch(InputMismatchException ime) {
			 * System.out.println("Enter integer Values only..."); }//catch
			 * catch(SQLIntegrityConstraintViolationException sicve) { System.out.
			 * println("Data Already Available...\n or Duplicates Not Allowed...."); }
			 */
    	  catch(SQLException cnfe)
    	  {
    		  cnfe.printStackTrace();
    	  }
	}
}