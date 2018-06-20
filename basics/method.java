package com.base;

import java.util.Scanner;

public class method {

	public static void main(String[] args)

	{
		char operator;
    	Double num1, num2, res;
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter operator (either +, -, * or /): ");
    	operator = scanner.next().charAt(0);
    	System.out.print("Enter num1 and num2 respectively: ");
    	num1 = scanner.nextDouble();
    	num2 = scanner.nextDouble();
    	switch(operator)

		{
		case '+':
			res=num1+num2;
			System.out.println("add"+res);
			break;
		case '-':
		    res=num1-num2;
		    System.out.println("sub"+res);
		    break;
		case '/':
		    res=num1/num2;
		    System.out.println("div"+res);
		    break;
		 case '*':
	           res = num1 * num2;
	           System.out.print(num1 + "*" + num2 + " = " + res);
	           break;
		 default:
		 System.out.println("oprator is wrong");
		}
		}
		
		
		
	}


    	
    	




