package com.globallogic;

public class PhoneNumber {
private String label;
private String phoneNumber;

public PhoneNumber() {
	super();
	
}

public PhoneNumber(String label, String phoneNumber) {
	super();
	this.label = label;
	this.phoneNumber = phoneNumber;
}

public String getLabel() {
	return label;
}

public void setLabel(String label) {
	this.label = label;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

@Override
public String toString() {
	return "PhoneNumber [label=" + label + ", phoneNumber=" + phoneNumber + "]";
}



}
