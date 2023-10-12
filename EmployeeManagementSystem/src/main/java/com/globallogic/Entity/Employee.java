package com.globallogic.Entity;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
public class Employee {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
	private String firstName;
	private String lastName;
	private int birthDate;
	private int cellPhone;
	
	//@JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Project> project;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String firstName, String lastName, int birthDate, int cellPhone, Department department,
			List<Project> project) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.cellPhone = cellPhone;
		this.department = department;
		this.project = project;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public int getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(int cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	
	
	
	
}
