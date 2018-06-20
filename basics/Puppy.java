package com.based;

public class Puppy {
	
	public Puppy(String name)
	{
		System.out.println("Puppy name is : "+name);
	}
	
	static int age;
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
		System.out.println("Getting age : " +age);
	}
	
	
	
	public static void main(String args[])
	{
		Puppy myPuppy=new Puppy("Tommy");
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("Age is : "+age);
		
		Puppy anotherPuppy=new Puppy("scubby");
		anotherPuppy.setAge(5);
		anotherPuppy.getAge();
		System.out.println("Age of  scubby : "+age);
		
		
		
		
		 
		
	}
	

}
