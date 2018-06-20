package com.based;

public class ArrayOne {
	public static void main(String[] args) {
		
		int[] N= new int[5];
		
		N[0]=1;
		N[1]=2;
		N[2]=3;  
		N[3]=4;
		printArray(N);
		
		
	}

	private static void printArray(int[] array) {
			
		
		for(int i=0;i<array.length;i++) 
		{
	
		System.out.println(array[i]);
		
	}
		

	}
}
	
