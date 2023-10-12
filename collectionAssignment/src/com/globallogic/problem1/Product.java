package com.globallogic.problem1;

public class Product implements Comparable<Product> {
private int id;
private String name;
private int price;
private int quantity;


@Override
public int compareTo(Product o) {
	// TODO Auto-generated method stub
	return this.name.compareTo(o.name);
}


public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String name, int price, int quantity) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.quantity = quantity;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}



}
