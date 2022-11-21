package com.orm;

import com.orm.bean.Emp;
import com.orm.demo.orm.EmpOrm;

public class Main {

	public static void main(String[] args) 
	{
		
	
		Emp bean=new Emp();
		
		bean.setName("Raghav");
		bean.setEmail("raghav");
		

		EmpOrm orm=new EmpOrm();
	
		   int i=orm.insertdate(bean);
	       	
		   if(i>0)
		   {
			   System.out.println("Success");
		   }else
		   {
			   System.out.println("Failed");
		   }
	}

}
