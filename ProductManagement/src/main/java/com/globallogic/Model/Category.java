package com.globallogic.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Category")
public class Category {

@Id
private int categoryId;
private String category;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="product_id")
//@JsonBackReference
private Product product;


public Category() {
	super();
	// TODO Auto-generated constructor stub
}


public Category(int categoryId, String category, Product product) {
	super();
	this.categoryId = categoryId;
	this.category = category;
	this.product = product;
}


public int getCategoryId() {
	return categoryId;
}


public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}


public String getCategory() {
	return category;
}


public void setCategory(String category) {
	this.category = category;
}


public Product getProduct() {
	return product;
}


public void setProduct(Product product) {
	this.product = product;
}



}
