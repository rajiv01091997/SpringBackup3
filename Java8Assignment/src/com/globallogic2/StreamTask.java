package com.globallogic2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {

	public static void main(String[] args) {
	
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("Avi", 101, 50000, 2, "Software dev", "M"));
		list.add(new Employee("Ram", 104, 80000, 1, "Software analyst", "M"));
		list.add(new Employee("Shubbham", 103, 60000, 3, "Software engg", "M"));
		list.add(new Employee("Ajjuss", 102, 70000, 7, "TA", "F"));
		list.add(new Employee("Siraj", 105, 95000, 8, "Tester", "M"));
		list.add(new Employee("Nehass", 106, 40000, 4, "TA", "F"));
		
		//Question-1
		list.stream().filter(e->e.getRole().equals("TA")).forEach(e->System.out.println(e));
		long count=list.stream().filter(e->e.getGender().equals("F")).count();
		System.out.println("No of female employees: "+count);
		
		//Question 2:Write  a java program using Stream API to count names of employees whose length is greater than three.
		
		long nameCount=list.stream().filter(e->e.getName().length()>3).count();
		System.out.println("Number of employees whose name length is greater than three is: "+nameCount);
		
		//Question 3:Write a java program using Stream API to convert the role of employees from lower to uppercase
		
		List<Employee> list2=list.stream().
				map(e->{
					Employee ee=new Employee(e.getName(), e.getId(),e.getSal(),e.getYearsInOrg(), e.getRole().toUpperCase(), e.getGender());
				return ee;}).
				collect(Collectors.toList());
        System.out.println(list2);
        
        
        //Question 4:Write  a java program using Stream API to sort the  employees based on their names?
        
        list.stream().sorted((i1,i2)->
        {if(i1.getSal()>i2.getSal())
        	return 1;
        else if(i1.getSal()<i2.getSal())
        	return -1;
        else
        	return 0;
        }).
        forEach(e->System.out.println(e));
        
        

		
		

		
		
		
	}

}
