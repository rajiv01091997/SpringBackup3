package com.globallogic.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queries {

	public static void main(String[] args) {
	
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> temp=null;
		for(int i=0;i<n;i++)
		{   temp= new ArrayList<Integer>();
			//System.out.println("Enter the number of values in this line");
			int count=sc.nextInt();
			temp.add(count);
			for(int j=0;j<count;j++)
			{
				temp.add(sc.nextInt());
			}
			list.add(temp);
			temp=null;
			
		}
		//System.out.println(list);
		System.out.println("Enter the number of queries:");
		int numberOfQuesries=sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			int line=sc.nextInt();
			int position=sc.nextInt();
			if((list.size()<line)||list.get(line-1).size()-1<position)
			System.out.println("ERROR!");
			else
			System.out.println(list.get(line-1).get(position));
		}

	}

}
