package com.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Employee {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBeans.xml");

		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

		// Insert
		
		  String savequery = "Insert into employee(id,name,city) values(?,?,?)"; int
		  result = template.update(savequery,1,"Uday","Bangalore");
		  
//		  int result = template.update(savequery, new Object[] {2,"Rahul","Hassan"});
		  
		  System.out.println("Data Inserted: "+result);
		 

		// Update
		/*
		 * String updatequery = "update employee set name=? where id = ?"; int result =
		 * template.update(updatequery, "Shivu", 1);
		 * 
		 * int result = template.update(updatequery, new Object[] { "Uday", 1 });
		 * 
		 * System.out.println("Updated: " + result);
		 */

		// Delete
		/*
		 * String deletequery = "delete from employee where id = ?"; int result =
		 * template.update(deletequery, 1);
		 * 
		 * int result = template.update(deletequery, new Object[] {2});
		 * System.out.println("Deleted: " + result);
		 */
	}

}
