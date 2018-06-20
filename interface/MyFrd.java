package com.java.interfac;

public class MyFrd implements IProfile {

	@Override
	public void myBasiInfo() {
		
		String  firstName="Imran";
		String lastName="Tahir ";
		int age=25;
		System.out.println("Name:" +firstName +lastName +"\nage:" +age);
		
		
		
		
	}

	@Override
	public void myHobbies() {
		System.out.println("My Hobbies is :");
		System.out.println("Cricket");
		System.out.println("\n");
		}
	
	
}
