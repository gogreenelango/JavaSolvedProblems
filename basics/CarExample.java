package com.based;
public class CarExample{
public static void main(String[] args)
	{
		
		Date displayDate=new Date(3,3,2018);
		Date.displayDate();		
		
		
		Date todaysDate=new Date(3,3,2018);
		todaysDate.setDay(30);
		todaysDate.setMonth(5);;
		todaysDate.setYear(2018);   
		
		
		
		System.out.println(day +"/" +month +"/" +year);
	}
}