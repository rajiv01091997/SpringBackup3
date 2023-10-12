package com.globallogic.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Capital {
	
	@Id
private int id;
private String name;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="country")

private Country country;

public Capital() {
	super();
	// TODO Auto-generated constructor stub
}

public Capital(int id, String name, Country country) {
	super();
	this.id = id;
	this.name = name;
	this.country = country;
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

public Country getCountry() {
	return country;
}

public void setCountry(Country country) {
	this.country = country;
}

@Override
public String toString() {
	return "Capital [id=" + id + ", name=" + name + "]";
}


}
