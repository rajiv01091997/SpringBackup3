package com.globallogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globallogic.Entity.Capital;
import com.globallogic.Entity.Country;
import com.globallogic.Repository.CountryRepo;

@SpringBootApplication
public class MappingApplication implements CommandLineRunner {
	@Autowired
	private CountryRepo repo;
	

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}

	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
//		Country country=new Country();
//		Capital capital=new Capital();
//
//		country.setId(1);
//		country.setName("america");
//		
//		capital.setId(1);
//		capital.setName("washington");
//		
//		capital.setCountry(country);
//		country.setCapital(capital);
//		
//
//		repo.save(country);
		
		
		//System.out.println(repo.findAll());
		
		System.out.println(repo.findById(1));
	}
	
	
	
}
