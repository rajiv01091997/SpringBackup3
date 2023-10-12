package com.globallogic.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Persons")
public class Person {
@Id
private int id;
private String name;
private String address;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
}

}
