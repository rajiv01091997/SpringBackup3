package com.globallogic.Service;

import java.util.List;

import com.globallogic.Dto.StudentDto;
import com.globallogic.Exceptions.StudentNotPresent;
import com.globallogic.Repository.Repo;

public class Service {
	Repo repo=new Repo();

	public void addStudent(StudentDto dto)
	{
		StudentDto student=repo.findStudent(dto.getId());
		if(student!=null)
		{
			System.out.println("Student with this id is already present");
			
		}
		else
			System.out.println("Student added with id "+repo.addStudent(dto));
		
	}
	
	public StudentDto findStudent(String id)
	{
		StudentDto student=repo.findStudent(id);
		
			return student;
	}
	
	public List<StudentDto> getStudent()
	{
		return repo.getStudents();
	}
	public void deleteStudent(String id)
	{
		if(repo.findStudent(id)==null)
		      throw new StudentNotPresent("No student with the entered id is present");
		repo.deleteStudent(id);
	}
	
	public void updateStudent(String id, StudentDto dto)
	{
		if(repo.findStudent(id)==null)
		      throw new StudentNotPresent("No student with the entered id is present");
		repo.updateStudent(id, dto);
	}
	
}
