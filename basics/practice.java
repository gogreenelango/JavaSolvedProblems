package com.based;

import java.util.Scanner;

public class practice {
	int[] array=new int[] {1,2,3};

	 int sm=array[0];
	
	
	public static void main(String[] args) {
		
		practice p1=new practice();
		p1.pratice();
		
				
		
		
		
	}

	private void pratice() {

		for(int i=0;i<array.length;i++)
		{
			if(array[i]<sm)
			{
				sm=array[i];
			}
		}
		System.out.println(sm);
		

		
	}
	
	
	
	
	

}
