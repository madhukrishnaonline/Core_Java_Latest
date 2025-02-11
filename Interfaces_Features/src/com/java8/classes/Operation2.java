package com.java8.classes;

import com.java8.features.Operations;

public class Operation2 implements Operations 
{
	
	@Override
	public int calculate(int x, int y) {
		return x-y;
	}//method
	
	public static void main(String[] args) 
	{
		Operation2 operation2 = new Operation2();
		System.out.println(operation2.calculate(27,23));
		System.out.println(Operations.substract(33, 22));
	}
}//class