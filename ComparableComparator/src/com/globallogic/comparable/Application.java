package com.globallogic.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Employee> emp=new HashSet<>();
emp.add(new Employee("rajiv",2531,25,70000));
emp.add(new Employee("abhishek",2533,30,78000));
emp.add(new Employee("niraj",2561,23,70009));
emp.add(new Employee("rajiv",2531,25,70000));
System.out.println(emp);

System.out.println(emp);
	}

}
