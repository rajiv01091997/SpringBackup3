package com.globallogic.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {

	public static void main(String[] args) {
		 List<Student> list=new ArrayList<>();
	        list.add(new Student(34,"amar"));
	        list.add(new Student(95,"minakshi"));
	        list.add(new Student(46,"sunny"));
	        list.add(new Student(68,"wasantu"));
	        list.add(new Student(74,"vipin"));
	        list.add(new Student(53,"ankits"));
	        
	        Function<Student,String> f=s->
	        {String grade="";
	        	if(s.getMarks()>80)
	        		grade="A[Distinction]";
	        	else if(s.getMarks()>60)
	        		grade="B[First class]";
	        	else if(s.getMarks()>45)
	        		grade="C[Second class]";
	        	else if(s.getMarks()>35)
	        		grade="D[Third class]";
	        	else
	        		grade="E[Failed]";
	        	return grade;
	        };
	        
//	        for(Student s:list)
//	        {
//	        	System.out.println("name= "+s.getName());
//	        	System.out.println("marks= "+s.getMarks());
//	        	System.out.println("grade= "+f.apply(s));
//	        	
//	        	System.out.println();
//	 
//	        }
	        Function<Student,Boolean> f2=s->s.getMarks()>60;
	        Consumer<Student>c1=s->System.out.println(s.getName());
	        Consumer<Student> c2=s->System.out.println(s.getMarks());
	        
	        for(Student s:list)
	        {
	        	c1.andThen(c2).accept(s);
	        }

	}

}
