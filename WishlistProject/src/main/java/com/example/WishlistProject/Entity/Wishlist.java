package com.example.WishlistProject.Entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Wishlist")
public class Wishlist {
    @MongoId
	private String emailId;
	private List<Services> services;
	private List<Packages> packages;
	private static double amount;
	public Wishlist() {
		super();

	}
	public Wishlist(String emailId, List<com.example.WishlistProject.Entity.Services> services,
			List<com.example.WishlistProject.Entity.Packages> packages, double amount) {
		super();
		this.emailId = emailId;
		this.services = services;
		this.packages = packages;
		this.amount = amount;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<Services> getServices() {
		return services;
	}
	public void setServices(List<Services> services) {
		this.services = services;
	}
	public List<Packages> getPackages() {
		return packages;
	}
	public void setPackages(List<Packages> packages) {
		this.packages = packages;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Wishlist [emailId=" + emailId + ", services=" + services + ", packages=" + packages + ", amount="
				+ amount + "]";
	}
	
	
	
}
