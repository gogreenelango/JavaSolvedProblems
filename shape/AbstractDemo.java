package com.shape;

public class AbstractDemo
{
    public static void main(String[] args)
    {
        Shape shape;
        
       
        Rectangle rect = new Rectangle();
        
        
        shape = rect;

       
        shape.setValues(78, 5);
        
    
        System.out.println("Area of rectangle : " + shape.getArea());
        
     
        Triangle tri = new Triangle();
        
          
        shape = tri;
        
           
        shape.setValues(34,3);
        
       
        System.out.println("Area of triangle : " + shape.getArea());
    }
}