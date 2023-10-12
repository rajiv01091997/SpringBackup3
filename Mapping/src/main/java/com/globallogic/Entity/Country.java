package com.globallogic.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Country {
	
	@Id
	private int id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "country")
	private Capital capital;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int id, String name, Capital capital) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
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

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", capital=" + capital + "]";
	}
	
	
	
	
}
