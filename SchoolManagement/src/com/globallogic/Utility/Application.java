package com.globallogic.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.globallogic.Model.Student;

public class Application {

	List<Student> list=new ArrayList<Student>();
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		Application app=new Application();
		int k=1;
		
		while(k==1)
		{
			System.out.println("==================================================================================");
		System.out.println(" Press 1 for adding a student \n Press 2 for removing a Student \n"
				+ " Press 3 for updating details \n"
				+ " Press 4 for viewing details of a student \n Press 5 to exit");
		    System.out.println("==================================================================================");
		
		int choice=sc.nextInt();
		 
		    System.out.println("==================================================================================");
		switch(choice)
		{
		case 1:
			app.addStudent();
		    break;
		
		case 2:
			System.out.println("Enter id of Student whom to be removed");
			int id=sc.nextInt();
			System.out.println("==================================================================================");
			app.removeStudent(id);
			break;
		case 3:
			System.out.println("Enter id of Student whose details to be updated");
			int updateId=sc.nextInt();
			System.out.println("==================================================================================");
			app.updateDetails(updateId);
			break;
		case 4:
			System.out.println("Enter the id whose details you want to see");
			int studentId=sc.nextInt();
			System.out.println("==================================================================================");
			app.viewDetails(studentId);
			break;
		case 5:
			k=0;
			break;
		default:
			System.out.println("Wrong choice");
			break;
			
		}
		}
		

	}
	
	public void addStudent()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name,father's name, phone number, address,id");
		System.out.println("==================================================================================");
	    Student student=new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
		list.add(student);
		System.out.println("student added");
		
	}
	public void removeStudent(int id)
	{
		for(Student s:list)
		{
			if(s.getId()==id)
			{
				list.remove(s);
				System.out.println("student removed");
				return;
			}
		}
		System.out.println("Student with given id"+id+"not present");
		
	}
	
	public void updateDetails(int id)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new name, father's name,phone number,address,id");
		System.out.println("==================================================================================");
		 Student student=new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
		
		
		for(Student s:list)
		{
			if(s.getId()==id)
			{
				s.setStudentName(student.getStudentName());
				s.setFatherName(student.getFatherName());
				s.setPhoneNumber(student.getPhoneNumber());
				s.setAddress(student.getAddress());
				System.out.println("details updated");
				return;
			}
		}
		System.out.println("no student with given id");
	}
	
	
	
	
	public void viewDetails(int id)
	{
		for(Student s:list)
		{
			if(s.getId()==id)
			{
				System.out.println(s);
				return;
			}
		}
		System.out.println("Not found with id: "+id);
	}
	
	

}
