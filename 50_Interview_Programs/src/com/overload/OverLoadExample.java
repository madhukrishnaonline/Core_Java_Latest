package com.overload;

public class OverLoadExample 
{
	public void abc(int a)
	{
		System.out.println("OverLoadExample.abc(int a)"+a);
	}//abc
	
	public void abc(Integer a)
	{
		System.out.println("OverLoadExample.abc(Integer a)"+a);
	}//abc
	
	public static void mk()
	{
		OverLoadExample overLoadExample = new OverLoadExample();
		overLoadExample.abc(10);
	}
	public static void main(String[] args) 
	{
		/*OverLoadExample overLoadExample = new OverLoadExample();
		overLoadExample.abc(null);*/
		
		OverLoadExample.mk();
	}//main
}//class