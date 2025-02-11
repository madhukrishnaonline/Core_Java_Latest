package com.reference;

import java.util.Scanner;
import java.util.function.Supplier;

public class FunMethodRef {
	
	public static String supply()
	{
		return "krishna";
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
		Supplier<String> supplier = FunMethodRef::supply;
		System.out.println(supplier.get());
		}//try
	}//main

}
