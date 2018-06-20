package com.based;

public class NewStudent {
	
	
	
	
	
	public static void main(String[] args) {
		StudentDetails studentOne=new StudentDetails();
		studentOne.setFirstname("Sam");
		studentOne.setLastname("Billings");
		studentOne.setGender("male");
		studentOne.setBranch("InformationTech");
		NewStudent s=new NewStudent();
		s.display(studentOne);
		
	} 
	public void display(StudentDetails studentOne) {
		System.out.println(studentOne);
	}

}
