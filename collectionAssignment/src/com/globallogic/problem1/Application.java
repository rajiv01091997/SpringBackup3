package com.globallogic.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 List<Product> productList=new ArrayList<Product>();
		 
		Product prod1=new Product(101,"Television",25000,22);
		Product prod2=new Product(106,"Refriferator",40000,8);
		Product prod3=new Product(104,"Dishwasher",32000,10);
		Product prod4=new Product(105,"Speakers",7500,15);
		Product prod5=new Product(103,"Headphone",8000,28);
		Product prod6=new Product(102,"Geyser",10000,32);
		
		productList.add(prod1);
		productList.add(prod2);
		productList.add(prod3);
		productList.add(prod4);
		productList.add(prod5);
		productList.add(prod6);
		
		//DEFAULT SORTING ,COMPARABLE HAS BEEN IMPLEMENTED IN POJO CLASS
		Collections.sort(productList);
		printList(productList);
		
		System.out.println("_________________________________________________________");
		System.out.println("\nEnter 1 for Sorting based on Name\n"
				           +"Enter 2 for Sorting based on Id\n"
				           +"Enter 3 for Sorting based on Price\n"
				           +"Enter 4 for Sorting based on available_Quantity");
		System.out.println("_________________________________________________________");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Collections.sort(productList, new NameComparator());
			System.out.println("_________________________________________________________");
			printList(productList);
			break;
		case 2:
			Collections.sort(productList, new IdComparator());
			System.out.println("_________________________________________________________");
			printList(productList);
			break;
			
		case 3:
			Collections.sort(productList, new PriceComparator());
			System.out.println("_________________________________________________________");
			printList(productList);
			break;
		case 4:
			Collections.sort(productList, new QuantityComparator());
			System.out.println("_________________________________________________________");
			printList(productList);
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}
		
		
     
	}
	
	public static void printList(List<Product> list)
	{
		for(Product p:list)
		{
			System.out.println(p);
		}
	}

}
