package com.java.abstractEx;

public class Demo extends Sum {

	@Override
	public void addTwoValue(int a, int b) {
		a=10;
		b=12;
		
		System.out.println( a=a+b);
	}
	

	@Override
	public void addThreeValue(double a,double b,double c) {
		
		a=10.2;
		b=14.5;
		c=12.5;
		b=a+b+c;
		
		System.out.println(b);
	}


	

}
