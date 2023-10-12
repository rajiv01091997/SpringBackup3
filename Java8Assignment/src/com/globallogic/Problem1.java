package com.globallogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class Problem1 {

	public static void main(String[] args) {
		
		List<Integer> list=List.of(1,2,2,3,4,5,3,6);

		//***************cube of each number using lamda****************
		Function<Integer,Integer> f=i->i*i*i;
		List<Integer> b=new ArrayList<>();
		for(int i:list)
		{
			b.add(f.apply(i));
		}
		
		System.out.println(b);
		
		
		//*****************cubes of numbers using streams
		Set<Integer> c=list.stream().map(i->i*i*i).collect(Collectors.toSet());
		c.forEach(i->System.out.println(i));
		
		//find the square of distinct number
		Set<Integer> s=list.stream().map(i->i*i).collect(Collectors.toSet());
		System.out.println(s);
		
		
		list.stream().sorted().forEach(e->System.out.println(e));
		
	}

}
