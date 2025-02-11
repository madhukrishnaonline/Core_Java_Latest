package com.number.operations;

import java.util.Scanner;

public class DecimalToBinary {
	public static String convertToBinary(int n) {
        return Integer.toBinaryString(n);
	}

	public static String conevrtToBinary(Integer n) {
		StringBuilder builder = new StringBuilder();
		while(n>0) {
			builder.insert(0,n%2);
			n = n/2;
		}//while
		return builder.toString();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int num1 = scanner.nextInt();
        System.out.println(convertToBinary(num1));
        
        System.out.println("Enter Number");
        Integer num2 = scanner.nextInt();
        System.out.println(conevrtToBinary(num2));
        
        scanner.close();
	}// main
}// class