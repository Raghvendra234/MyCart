package com.orm.demo.orm;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.orm.bean.Emp;
import com.orm.db.ConnectionProvider;

public class EmpOrm
{

	public int insertdate(Emp bean)
	{
		try
		{
			Connection connection=ConnectionProvider.getConnection();

PreparedStatement psmt=connection.prepareStatement("insert into orm (Name,Email) values(?,?)");

       psmt.setString(1, bean.getName());
       psmt.setString(2, bean.getEmail());
      
       
       
       int i=psmt.executeUpdate();
//		if(i>0)
//		return 1;
//		else
//		return 0;
//		
		return i;
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		return 0;
		
		
		
		
	
		
	}
}
