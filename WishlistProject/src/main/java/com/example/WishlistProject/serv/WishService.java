package com.example.WishlistProject.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WishlistProject.Entity.Packages;
import com.example.WishlistProject.Entity.Services;
import com.example.WishlistProject.Entity.Wishlist;
import com.example.WishlistProject.dto.PackagesDto;
import com.example.WishlistProject.dto.ServicesDto;
import com.example.WishlistProject.dto.WishlistDto;
import com.example.WishlistProject.repo.WishlistRepo;

@Service
public class WishService {
    @Autowired
	private WishlistRepo repo;
	
	
	public WishlistDto saveWishlist(WishlistDto wishlistDto)
	{
		Wishlist wishlist=repo.save(convertDtoToEntity(wishlistDto));
		return convertEntityToDto(wishlist);
		
	}
	
	
	
	
	public Wishlist convertDtoToEntity(WishlistDto wishlistDto)
	{
		double serviceAmount=0,packageAmount=0;
		List<Services> servList=new ArrayList<>();
		for(ServicesDto s:wishlistDto.getServicesDto())
		{
			Services services=new Services();
			services.setName(s.getName());
			services.setPrice(s.getPrice());
			serviceAmount+=s.getPrice();
			servList.add(services);
		}
		List<Packages> packList=new ArrayList<>();
		for(PackagesDto p:wishlistDto.getPackagesDto())
		{
			Packages packages=new Packages();
			packages.setName(p.getName());
			packages.setPrice(p.getPrice());
			packageAmount+=p.getPrice();
			packList.add(packages);
		}
		
		 double total=wishlistDto.getAmount()+serviceAmount+packageAmount;
		Wishlist w=new Wishlist(wishlistDto.getEmailId(),servList,packList,total);
		return w;
	}
	
	public WishlistDto convertEntityToDto(Wishlist wishlist)
	{   
		double serviceAmount=0,packageAmount=0;
		List<ServicesDto> servList=new ArrayList<>();
		for(Services s:wishlist.getServices())
		{
			ServicesDto services=new ServicesDto();
			services.setName(s.getName());
			services.setPrice(s.getPrice());
			serviceAmount+=s.getPrice();
            	servList.add(services);		
		}
		List<PackagesDto> packList=new ArrayList<>();
		for(Packages p:wishlist.getPackages())
		{
			PackagesDto packages=new PackagesDto();
			packages.setName(p.getName());
			packages.setPrice(p.getPrice());
			packageAmount+=p.getPrice();
			packList.add(packages);
		}
		
		double total=wishlist.getAmount()+serviceAmount+packageAmount;
		WishlistDto wishlistDto=new WishlistDto(wishlist.getEmailId(), servList, packList, total);
		return wishlistDto;
	
	}
	
	
}
