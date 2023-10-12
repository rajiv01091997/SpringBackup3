package com.globallogic.problem2;

import java.util.List;

public class Service {
	
	public void search(String name,List<Product> productList)
	{
		for(Product p: productList)
		{
			if(p.getName().equals(name))
			{
				System.out.println(p);
			}
		}
	}
	
	public void search(int id,List<Product> list)
	{
		for(Product p: list)
		{
			if(p.getId()==id)
			{
				System.out.println(p);
			}
		}
	}
	public void search(List<Product> list,int quantity)
	{
		for(Product p: list)
		{
			if(p.getQuantity()>=quantity)
			{
				System.out.println(p);
			}
		}
	}

}
