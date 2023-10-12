package com.globallogic.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		 List<Product> productList=new ArrayList<Product>();
		 Scanner sc=new Scanner(System.in);
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
			
			
			
			System.out.println("_________________________________________________________");
			System.out.println("\nEnter 1 for Searching based on Name\n"
					           +"Enter 2 for Searching based on Id\n"
					           +"Enter 3 for Searching based on available_Quantity");
			System.out.println("_________________________________________________________");

			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			    System.out.println("Enter name to be searched for");
				System.out.println("_________________________________________________________");
				//sc.nextLine();//used this extra because it was not accepting input
				String name=sc.nextLine();
				new Service().search(name, productList);
				break;
			case 2:
				System.out.println("Enter id to be searched for");
				System.out.println("_________________________________________________________");
				int id=sc.nextInt();
				new Service().search(id, productList);
				break;
				
			case 3:
				System.out.println("Enter quantity to be searched for");
				System.out.println("_________________________________________________________");
				int quantity=sc.nextInt();
				new Service().search(productList,quantity);
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
			
			
			
	}

}
