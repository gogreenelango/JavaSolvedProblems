package com.based;

import com.sun.org.apache.regexp.internal.recompile;

public class Employee {
	String firstname;
	String lastname;
    static double monthlysalary;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getMonthlysalary(double monthsalary) {
		if(monthlysalary>0)
		{
			double a=(int) monthlysalary;
			double b=(a*12);
			System.out.println(b);
			double c=b/10;
			double yearlysalary=b+c;
		return yearlysalary;
		}
		else 
		{
			return 0;
		}
			}
	public double setMonthlysalary(double monthlysalary) {
		this.monthlysalary = month
				lysalary;
		return monthlysalary;
	} 
	public static void main(String args[]) {
		
			Employee e1=new Employee();
			Employee e2=new Employee();
			e1.setFirstname("Thiru");
			e1.setLastname("rajan");
			e2.setFirstname("Ben");
			e2.setLastname("Stokes");
			e1.setMonthlysalary(10000.0);
			e2.setMonthlysalary(10000.0);
			
			
			
			System.out.println(e1.getFirstname());
			System.out.println(e1.getLastname());
			System.out.println(e1.getMonthlysalary(monthlysalary));
			
			System.out.println("");
			
			
			
			System.out.println(e2.getFirstname());
			System.out.println(e2.getLastname());
			System.out.println(e1.getMonthlysalary(monthlysalary));
			
			
			
			
			
			

		
			
			
			
		
		
	}

}
