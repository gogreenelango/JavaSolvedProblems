package com.shape;

public abstract class Shape {
	   private double height;  // To hold height.
	   private double width;  //To hold width or base

	   public void setValues(double height, double width)
	   {
	      this.height = height;
	      this.width = width;
	   }

	   public double getHeight() 
	   {
	       return height;
	   }
	   
	   public double getWidth() 
	   {
	       return width;
	   } 

	    

	   public abstract double getArea();
	

}
