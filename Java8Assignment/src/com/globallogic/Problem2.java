package com.globallogic;

import java.util.Arrays;
import java.util.List;

public class Problem2 {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(8,11,10,12,15,9);
		
		int res=list.stream().reduce(1,(n1,n2)->n1*n2);
		System.out.println(res);
		

	}

}
