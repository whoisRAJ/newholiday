package com.jcg.jdbc.mssql;
 
import java.sql.Connection;

import java.sql.DriverManager;
 
public class JdbcMsSql {
 
    public static Connection connObj;
    public static final String URL = "jdbc:sqlserver://WKSBAN29RBW1468\\MSSQLSERVER:1433;databaseName=SLADB";
    public static final String USER = "sa";
    public static final String PASS = "5J2Yn.7I-"; 
    
    public static Connection getConnection(){
    	try
	    {
	      // Step 1: "Load" the JDBC driver
	      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 

	      // Step 2: Establish the connection to the database 
	      return DriverManager.getConnection(URL,USER,PASS);  
	      
	      
	    }
	    catch (Exception e)
	    {
	      System.err.println("D'oh! Got an exception!"); 
	      System.err.println(e.getMessage()); 
	    }
		return null;
    }
}