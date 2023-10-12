package com.globallogic.problem1;

import org.springframework.stereotype.Component;

@Component
public class Address {
private int house_no;
private String street;
private String city;



public Address(int house_no, String street, String city) {
	super();
	this.house_no = house_no;
	this.street = street;
	this.city = city;
}




}
