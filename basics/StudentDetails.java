package com.based;

public class StudentDetails {
	
	 private String id;
	 private String firstname;
	 private String lastname;
	 private String gender;
	 private String branch;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	 
	
	@Override
	public String toString() {

		return firstname  +lastname+"," +gender +","+branch;
		}
	
}

	