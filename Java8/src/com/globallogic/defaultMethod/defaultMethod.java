package com.globallogic.defaultMethod;

public class defaultMethod implements Interface1,Interface2 {

	public static void main(String args[])
	{
		defaultMethod df=new defaultMethod();
		df.getMessage();
		df.printNumber();
	}

	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		System.out.println("this is msg");
	}
	public void printNumber()
	{
		//System.out.println("printing digits");
		
//		Interface2.super.printNumber();
//		Interface1.super.printNumber();
	}
	
	
}
