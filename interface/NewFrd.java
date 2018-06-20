package com.java.interfac;

public class NewFrd implements IProfile {

	@Override
	public void myBasiInfo() {
		
	   System.out.println(ProfileConstant.FIRST_NAME+"Suresh");
	   System.out.println(ProfileConstant.LAST_NAME+"Raina");
	   System.out.println(ProfileConstant.AGE+"21");
	}

	@Override
	public void myHobbies() {
		System.out.println("My Hobbies is :");
		System.out.println("Chess,Fottball");
		System.out.println("\n");
		
	}

	
}
