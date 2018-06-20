package com.array;



public class MaxMini {
	public void disp() {
	 int array[]= {3,4,5,33,24,2};
		int l=array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i]>l)
			{
				l=array[i];
			}
		}
		System.out.println("Maximum value of array :"+l);
		for (int i1= 0; i1 < array.length; i1++) {
			if(array[i1]<l)
			{
				l=array[i1];
			}
		}
		System.out.println("Minimum value of array:"+l);
	}
public static void main(String[] args) {
	MaxMini minMax=new MaxMini();
	minMax.disp();
	
}
}

