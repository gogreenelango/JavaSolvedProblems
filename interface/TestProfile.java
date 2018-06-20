package com.java.interfac;

public class TestProfile {
	  
	public  static void printProfile(IProfile profile) {
		profile.myBasiInfo();
		profile.myHobbies();
		
	}

		public static void main(String[] args) {
			
			IProfile pro=new MyFrd();
			IProfile prof=new SamProfile();
			IProfile profile=new NewFrd();
			//static
		    printProfile(prof);
			printProfile(pro);
			printProfile(profile);
			
		}
	}

