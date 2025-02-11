package com.accenture.coding;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		/*int in = '0';
		System.out.println(in);
		byte b = '1';
		System.out.println(b);
		char c = '1';
		System.out.println(c == b);
		short s = '3';
		System.out.println(s);
		float f = '4';
		System.out.println(f);
		double d = '5';
		System.out.println(d);
		long l = '6';
		System.out.println(l);
		Integer st = (int) '7';
		System.out.println(st);*/

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scanner.nextInt();
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}//for
		System.out.println("Factorial of "+num+" is "+factorial);
		scanner.close();
		
	}// main

}// class