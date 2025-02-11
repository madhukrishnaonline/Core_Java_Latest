package com.reference;

import java.util.function.Function;
import java.util.function.Supplier;

public class InstanceMethodReference 
{
	public String mk()
	{
         return "Madhu Krishna";
	}
	
	public static void main(String[] args) 
	{
		InstanceMethodReference imr = new InstanceMethodReference();
		
		Supplier<String> supplier = imr::mk;
		System.out.println(supplier.get());
		
		Function<String, String> toUpperCase = String::toUpperCase;
		System.out.println(toUpperCase.apply("madhu"));
		
	}//main
}//class