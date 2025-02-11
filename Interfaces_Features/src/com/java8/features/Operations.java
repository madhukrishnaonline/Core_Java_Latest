package com.java8.features;

public interface Operations 
{
	//abstract method
	int calculate(int x,int y);
	
             //int add1(int x,int y);
	
	//default method
	default int add(int x,int y)
	{
		return x+y;
	}
	//default methods provide backward compatibility
	
	//static method
	static int substract(int x,int y)
	{
		return x-y;
	}
	
	/*	strictfp int multiple(int x,int y)
		{
			return x*y;
		}*/
}
