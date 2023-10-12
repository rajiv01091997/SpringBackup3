package com.globallogic.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.globallogic.Connection.DBconnection;
import com.globallogic.Dto.StudentDto;

public class Repo {
	
	public String addStudent(StudentDto dto)
	{  String id;
		try {
		Connection con=DBconnection.connect();
		PreparedStatement ps=con.prepareStatement("insert into Student values(?,?,?,?)");
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getName());
		ps.setString(3, dto.getAddress());
		ps.setString(4, dto.getEmail());
		ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return dto.getId();
	}
	
	public StudentDto findStudent(String id)
	{  StudentDto dto=null;
		try
		{
			Connection con=DBconnection.connect();
			PreparedStatement ps=con.prepareStatement("select * from Student where id=?");
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				dto=new StudentDto(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return dto;
	}
	
	public List<StudentDto> getStudents()
	{ List<StudentDto> list=new ArrayList<>();
		try
		{
			Connection con=DBconnection.connect();
			PreparedStatement ps=con.prepareStatement("select * from Student");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				StudentDto dto=new StudentDto(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(dto);
			}
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		return list;
	}
	
	public void deleteStudent(String id)
	{
		try
		{
			Connection con=DBconnection.connect();
			PreparedStatement ps=con.prepareStatement("delete from Student where id=?");
			ps.setString(1, id);
			int num=ps.executeUpdate();
			System.out.println("number of student deleted are: "+num);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void updateStudent(String id,StudentDto dto)
	{
		try
		{
			Connection con=DBconnection.connect();
			PreparedStatement ps=con.prepareStatement("update Student set id=?,name=?,address=?,email=? where id=?");
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getAddress());
			ps.setString(4, dto.getEmail());
			ps.setString(5, id);
			int n=ps.executeUpdate();
			if(n==0)
				System.out.println("No Student with matching id is present");
			else
				System.out.println("updated successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
