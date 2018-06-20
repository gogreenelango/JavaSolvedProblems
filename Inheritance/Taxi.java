package com.Inheritance;

public class Taxi extends Car {
	
	
	//object substitution
	int b=100;
	 
	//This method name is construct chaining
	public Taxi()
	{
		this(100.00);
		System.out.println("Thanking for using OLA taxi");
	}
	
	public Taxi( double i)
	{
		
		this(100,5);
		
		System.out.println("Taxi speed is: "+i +"km/hr");
	}
	
	
	public Taxi(int k,int r,int a)
	{
		
		System.out.println("Rate of "+k +" km/hr= " +r +"\nfuel usage level is:" +a +" liter" );
	}

 
	
	public  Taxi(int i,int j)
	{
		this(1,45,3);
		System.out.println("Charge is : "+i +" and tax is : "+j  );
		System.out.println("Total is "+(i+j));
	}
	
	@Override
	public void brake()
	{
		System.out.println("Taxi barke called");
	}
	
public static void main(String[] args) {
		
		
		Taxi t1=new Taxi();
		t1.brake();
	
		Car car=new Taxi();
		
		System.out.println(Car.b);
		System.out.println(car instanceof Taxi );
		
		
	}
}
