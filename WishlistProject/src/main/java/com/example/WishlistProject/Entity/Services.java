package com.example.WishlistProject.Entity;

public class Services {

	private String name;
	private int price;
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Services(String name, int price) {
		super();
		this.name = name;
		this.price = price;
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
	@Override
	public String toString() {
		return "Services [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
