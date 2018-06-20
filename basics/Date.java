package com.based;

public class Date {
	 int month;
	 int day;
	 int year;
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	
	public Date(int month,int day,int year)
	{
	this.day=day;
	this.month=month;
	this.year=year;
    }
	public void displayDate() {
		// TODO Auto-generated constructor stub
		System.out.println(day +"/" +month +"/" +year);
	}

	public static void main(String[] args)
	{
		
		Date displayDate=new Date(3,3,2018);
	  displayDate.setDay(12);
	  displayDate.setMonth(12);
	  displayDate.setYear(1998);
		displayDate.displayDate();
		
		Date todaysDate=new Date(30,5,2018);
		todaysDate.setDay(30);
		todaysDate.setMonth(5);
		todaysDate.setYear(2018);
		todaysDate.displayDate();
		
		
		
		
		/*System.out.println(day +"/" +month +"/" +year);
		System.out.println();*/
	}
	
}
