package com.inherit;

public class Class1 
{
	public static int a =10;
	int b = 20;
	public Class1() {
         System.out.println("Class1.Class1()");
//         System.out.println(a+b);
	}
	public static int calculate(int x,int y)
	{
		System.out.println("Class1.calculate()");
		return x+y;
	}
	
	public int calculate2(int x, int y)
	{
		System.out.println("Class1.calculate2()");
		b = y;
		a=x;
		System.out.println("a :: + b:: "+a*b);
		return x*y;
	}
	
	
	/*	public Class1(int b) {
			super();
			//instance     //local variable
			this.b =            b;
		}*/


	//instance Block
	{
		System.out.println("Class1.enclosing_method()---instance block");
//		System.out.println(a+b);
	}//instance block
	
	static
	{
		System.out.println("Class1.enclosing_method()---static block");
//		System.out.println(a+b);
	}//static block
	
}//class