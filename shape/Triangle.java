package com.shape;

public class Triangle extends Shape
{ 
    //Calculate and return area of triangle
    public double getArea() 
    {
        return (getHeight() * getWidth()) / 2;
    }
}   