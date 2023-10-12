package com.globallogic;

public class Address {
private String label;
private String address;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String label, String address) {
	super();
	this.label = label;
	this.address = address;
}
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Address [label=" + label + ", address=" + address + "]";
}


}
