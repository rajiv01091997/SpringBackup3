package com.globallogic.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.globallogic.Model.Country;
import com.globallogic.Model.Guest;
import com.globallogic.Model.Hobby;
import com.globallogic.Model.Language;

public class EventManager {

	public static void main(String[] args) {
		
     List<Guest> list=new ArrayList<Guest>();
     List<Guest> detailedList=populateGuest(list);
     //System.out.println(detailedList);
     
     List<Guest> countryGuest = filterGuestsByCountry("France");
		countryGuest.forEach(System.out::println);
     
	}
	
	public static List<Guest> populateGuest(List<Guest> list)
	{
		list.add(new Guest("Rajiv Yadav", "1997-09-01", Country.valueOf("China"), Language.valueOf("Chinese"), 
				Arrays.asList(Hobby.valueOf("WaterSports"), Hobby.valueOf("Music"))));
		
		list.add(new Guest("rakesh", "1950-01-01", Country.valueOf("Spain"), Language.valueOf("Spanish"), 
				Arrays.asList(Hobby.valueOf("Dance"), Hobby.valueOf("Music"))));
		
		list.add(new Guest("Raman", "2000-01-05", Country.valueOf("France"), Language.valueOf("French"), 
				Arrays.asList(Hobby.valueOf("Drink"), Hobby.valueOf("Music"))));
		
		list.add(new Guest("Rajdeep", "2005-08-09", Country.valueOf("Germany"), Language.valueOf("German"), 
				Arrays.asList(Hobby.valueOf("Eat"), Hobby.valueOf("Music"))));
		
		list.add(new Guest("Raghav", "1956-01-16", Country.valueOf("USA"), Language.valueOf("English"), 
				Arrays.asList(Hobby.valueOf("Read"), Hobby.valueOf("Music"))));
		
		list.add(new Guest("Ratandeep", "1980-09-01", Country.valueOf("China"), Language.valueOf("Chinese"), 
				Arrays.asList(Hobby.valueOf("Read"), Hobby.valueOf("Music"))));
		
		return list;
		
	}
	public static List<Guest> filterGuestsByCountry(String country,List<Guest> list)
	{

		return list.stream().filter(list -> list.getCountry().equals(Country.valueOf(country)))
				.collect(Collectors.toList());

	 }
	
	

}
