package com.globallogic.Dto;


public class ProductDto {

	private int id;
	private String name;
	private int price;
	
	
	private CategoryDto categoryDto;


	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProductDto(int id, String name, int price, CategoryDto categoryDto) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.categoryDto = categoryDto;
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


	public CategoryDto getCategoryDto() {
		return categoryDto;
	}


	public void setCategoryDto(CategoryDto categoryDto) {
		this.categoryDto = categoryDto;
	}


	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", name=" + name + ", price=" + price + ", categoryDto=" + categoryDto + "]";
	}
	
	
	

	
	
}
