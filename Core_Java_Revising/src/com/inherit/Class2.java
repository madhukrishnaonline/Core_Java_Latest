package com.inherit;

public class Class2 extends Class1 
{
	public static int a = 30;
	public int b = 20;
	
	public Class2() {
		super();
		System.out.println("Class2.Class2()");
	}
	
//	@Override
	public static int calculate(int x,int y)
	{
		System.out.println("Class2.calculate()");
		return x+y;
	}
	
	@Override
	public int calculate2(int x, int y)
	{
		System.out.println("Class2.calculate2()");
		b = y;
		System.out.println(b);
		return x*y;
	}
	
	{
		System.out.println("Class2.enclosing_method()---instance Block-Child");
//		System.out.println(a+b);
	}//instance block
	
	static
	{
		System.out.println("Class2.enclosing_method()---static block--Child");
	}//static block
	
}
