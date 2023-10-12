package com.globallogic.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class Department {
@Id
private int deptId;
private String deptName;

@OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
private List<Employee> employee;

public Department() {
	super();
	// TODO Auto-generated constructor stub
}

public Department(int deptId, String deptName, List<Employee> employee) {
	super();
	this.deptId = deptId;
	this.deptName = deptName;
	this.employee = employee;
}

public int getDeptId() {
	return deptId;
}

public void setDeptId(int deptId) {
	this.deptId = deptId;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public List<Employee> getEmployee() {
	return employee;
}

public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}


}
