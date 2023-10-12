package com.example.WishlistProject.dto;

import java.util.List;


public class WishlistDto {
	private String emailId;
	private List<ServicesDto> servicesDto;
	private List<PackagesDto> packagesDto;
	private static double amount;
	public WishlistDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WishlistDto(String emailId, List<com.example.WishlistProject.dto.ServicesDto> servicesDto,
			List<com.example.WishlistProject.dto.PackagesDto> packagesDto, double amount) {
		super();
		this.emailId = emailId;
		this.servicesDto = servicesDto;
		this.packagesDto = packagesDto;
		this.amount = amount;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<ServicesDto> getServicesDto() {
		return servicesDto;
	}
	public void setServicesDto(List<ServicesDto> servicesDto) {
		this.servicesDto = servicesDto;
	}
	public List<PackagesDto> getPackagesDto() {
		return packagesDto;
	}
	public void setPackagesDto(List<PackagesDto> packagesDto) {
		this.packagesDto = packagesDto;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "WishlistDto [emailId=" + emailId + ", servicesDto=" + servicesDto + ", packagesDto=" + packagesDto
				+ ", amount=" + amount + "]";
	}
	
	
}
