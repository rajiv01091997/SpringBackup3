package com.globallogic.defaultMethod;

public interface Interface1 {
	
	public void getMessage();
	
	public default void printNumber()
	{
		System.out.println("interace1");
	}
	
	
	
}
