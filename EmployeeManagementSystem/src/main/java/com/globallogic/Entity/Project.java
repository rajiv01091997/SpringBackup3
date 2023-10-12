package com.globallogic.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Project {
	@Id
private int projectId;
private String projectName;
private String projectLocation;

@ManyToMany(mappedBy = "project",cascade = CascadeType.ALL)
private List<Employee> employee;

public Project() {
	super();
	// TODO Auto-generated constructor stub
}

public Project(int projectId, String projectName, String projectLocation, List<Employee> employee) {
	super();
	this.projectId = projectId;
	this.projectName = projectName;
	this.projectLocation = projectLocation;
	this.employee = employee;
}

public int getProjectId() {
	return projectId;
}

public void setProjectId(int projectId) {
	this.projectId = projectId;
}

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public String getProjectLocation() {
	return projectLocation;
}

public void setProjectLocation(String projectLocation) {
	this.projectLocation = projectLocation;
}

public List<Employee> getEmployee() {
	return employee;
}

public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}




}
