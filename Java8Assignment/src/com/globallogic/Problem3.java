package com.globallogic;

import java.util.function.Predicate;

public class Problem3 {
public static void main(String[] args) {
	Predicate<Integer> isOdd=i->i%2!=0?true:false;
	Predicate<Integer> isPrime= j->
			{
				int count=0;
				for(int i=2;i<j;i++)
				{
					if(j%i==0)
						count++;
				}
				if(count==0)
					return true;
				else return false;
			};
			
			
			System.out.println(isOdd.test(18));
			System.out.println(isPrime.test(13));
			
	
}
}
