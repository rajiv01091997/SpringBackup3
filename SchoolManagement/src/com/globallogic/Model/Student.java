package com.globallogic.Model;

public class Student {
private String studentName;
private String fatherName;
private int id;
private String phoneNumber;
private String address;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String studentName, String fatherName, String phoneNumber, String address,int id) {
	super();
	this.studentName = studentName;
	this.fatherName = fatherName;
	this.id = id;
	this.phoneNumber = phoneNumber;
	this.address = address;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", fatherName=" + fatherName + ", id=" + id + ", phoneNumber="
			+ phoneNumber + ", address=" + address + "]";
}


}
