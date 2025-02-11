package com.main;

import com.inherit.Class1;
import com.inherit.Class2;

public class MainClass 
{
	public static void main(String... args) {
		Class1 c2 = new Class2();
//		System.out.println(c2.toString());
//			Class2.calculate(50,50);
			c2.calculate2(23, 35);
		//Class1 c3 = new Class2();
//		System.out.println(Class2.calculate(75, 23));
		//System.out.println(c3.calculate2(13,5));
//		System.out.println(c3);
			
			System.out.println("=====Specializaton Process======");
		Class2 child = (Class2)new Class1();
		child.calculate2(11,11);
		
//		AClass3 ac3 = new AClass3() {};
		
	}//main
}//class