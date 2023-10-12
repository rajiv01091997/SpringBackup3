package com.globallogic.problem1;

import org.springframework.stereotype.Component;

@Component 
public class Employee {
	private String emp_name;
	private int emp_id;
	private int salary;
	private String dob;
	private String doj;
	private Address address;
	
	
	
	public Employee(String emp_name, int emp_id, int salary, String dob, String doj, Address address) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.salary = salary;
		this.dob = dob;
		this.doj = doj;
		this.address = address;
	}
	
	

}
