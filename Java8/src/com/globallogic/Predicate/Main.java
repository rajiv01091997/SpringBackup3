package com.globallogic.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class Main {

	public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(101,"amar"));
        list.add(new Student(99,"minakshi"));
        list.add(new Student(109,"sunny"));
        list.add(new Student(104,"wasantu"));
        list.add(new Student(95,"vipin"));
        list.add(new Student(106,"ankits"));

        //print names that have id greater than 100
        Predicate<Student> p=s->s.getId()>100;
//        for(Student s:list)
//        {
//        	if(p.test(s))
//        		System.out.println(s.getName());
//        }
        
        Predicate<Student> p2=s->s.getName().length()>5;
        //print names that have id>100 && length(name)>5 using joining predicates
        
        
//        for(Student s:list)
//        {
//        	if(p.and(p2).test(s))
//        		System.out.println(s.getName());
//        }
//        
        
        
        //print names that have id>100 or length(name)>5 using joining predicates
//        for(Student s:list)
//        {
//        	if(p.or(p2).test(s))
//        		System.out.println(s.getName());
//        }
        
        
        
        //print names that have id<100
//        for(Student s:list)
//        {
//        	if(p.negate().test(s))
//        		System.out.println(s.getName());
//        }
//        
        
        Predicate<Student>p3=s->s.getName().contains("a");
        for(Student s:list)
        {
        	if(p.or(p2).or(p3).test(s))
        		System.out.println(s.getName());
        }
	}

}
