package com.java8.classes;

import com.java8.features.Operations;

public class Operation3 implements Operations 
{
	
	@Override
	public int calculate(int x, int y) {
		return x*y;
	}//method
	
	public static void main(String[] args) {
		Operation3 operation3 = new Operation3();
		System.out.println(operation3.calculate(10,5));
	}
}//class