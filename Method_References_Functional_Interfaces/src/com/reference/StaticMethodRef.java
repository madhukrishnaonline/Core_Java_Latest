package com.reference;

import java.util.function.Function;
import java.util.function.Supplier;

public class StaticMethodRef
{
	public static  int mk(int s)
	{
		System.out.println("StaticMethodRef.mk()");
		return s;
	}
	
	public static String name()
	{
		return "Madhu Krishna";
	}
	
	public static void main(String[] args) 
	{
		  System.out.println("====================");
		  Function<Integer, Integer> function = StaticMethodRef::mk;
		  System.out.println(function.apply(20));
		  
		  System.out.println("===========Lambda=============");
		  Function<String, Integer> function2 =  (s)-> Integer.parseInt(s);
		  System.out.println(function2.apply("30"));
		  System.out.println("===========Reference=============");
		  function2 = Integer::parseInt;
		  System.out.println(function2.apply("40"));
		  
		  System.out.println("====================");
		  Supplier<String> supplier = StaticMethodRef::name;
		  System.out.println(supplier.get());
		  
		  
		  
	}//main
}//class