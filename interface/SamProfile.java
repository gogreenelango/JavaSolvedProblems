package com.java.interfac;

public class SamProfile implements IProfile
{

	@Override
	public void myBasiInfo() {
		
		String  firstName="Sam";
		String lastName="Billings ";
		int age=23;
		System.out.println("Name:" +firstName +lastName +"\nage:" +age);
		
		
		
		
		
	}

	@Override
	public void myHobbies() {
		
		System.out.println("My Hobbies is :");
		System.out.println("Chess,Fottball");
		System.out.println("\n");
		
	}
	
	

}
