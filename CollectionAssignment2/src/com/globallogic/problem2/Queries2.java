package com.globallogic.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queries2 {

	
	public static void main(String args[])
	{
		List<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		int numberOfQueries=sc.nextInt();
		for(int i=0;i<numberOfQueries;i++)
		{
			String s=sc.next();
			if(s.equalsIgnoreCase("Insert"))
			{
				int index=sc.nextInt();
				int number=sc.nextInt();
				if(index>list.size())
					System.out.println("can't insert");
				else
				list.add(index, number);
			}
			else
			{   int index=sc.nextInt();
			   if(list.size()<=index)
				   System.out.println("Number not present at index");
			   else
				list.remove(index);
			}
		}
		
		System.out.println(list);
	}
}
