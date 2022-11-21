package com.orm.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider 
{

	public static Connection connection=null;
	
	public static Connection getConnection()
	{
		if(connection==null)
		{
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/gamingapplication";
			String username="root";
			String password="root";
		    connection=DriverManager.getConnection(url,username,password);
			
		    
		    System.out.println(connection);
			return connection;
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			return connection;
		
		}
		return connection;
		
	}


	

}
