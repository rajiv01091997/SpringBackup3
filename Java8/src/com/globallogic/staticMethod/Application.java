package com.globallogic.staticMethod;

public class Application implements Interface1 {

	public static void main(String[] args) {
	Application app=new Application();
	app.printMsg();
	Interface1.cricket();
	app.cricket();
	//cricket();
	}

	@Override
	public void printMsg() {
		// TODO Auto-generated method stub
		System.out.println("from interface1");
	}
	
	public void cricket()
	{
   System.out.println("this is overriden static method");
 }

}
