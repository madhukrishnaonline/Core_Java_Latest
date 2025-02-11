package com.java8.classes;

import com.java8.features.Operations;

public class Operation1 implements Operations 
{
	
	@Override
	public int calculate(int x, int y) 
	{
		return x+y;
	}//method
	
	public int test()
	{
	    return	Operations.super.add(33, 22);
	}
	
	public static void main(String[] args) {
		Operation1 operations = new Operation1();
		System.out.println(operations.calculate(27, 23));
		System.out.println(operations.test());
	}
}//class