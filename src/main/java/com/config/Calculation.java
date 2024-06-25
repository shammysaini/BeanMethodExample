package com.config;

import org.springframework.stereotype.Component;

public class Calculation {
	
	public void add(int a,int b)
	{
		int result = a+b;
		System.out.println("The sum is "+result);
	}
	public void subtract(int a,int b)
	{
		int result = a-b;
		System.out.println("The subtraction is "+result);
	}
	public void multi(int a,int b)
	{
		int result = a*b;
		System.out.println("The Multiplication is "+result);
	}
	public void divide(int a,int b)
	{
		int result = a/b;
		System.out.println("The Division is "+result);
	}

}
