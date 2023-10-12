package com.example.WishlistProject.dto;

public class PackagesDto {

	private String name;
	private int price;
	public PackagesDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PackagesDto(String name, int price) {
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
		return "PackagesDto [name=" + name + ", price=" + price + "]";
	}
	
}
