package com.exception.example;

import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void handleExceptions(String str) {
		try {
			int value = Integer.parseInt(str);
			System.out.println("Enter a string to convert to an integer:" + value);
			System.out.println("Length of the input string: " + str.length());

		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			System.out.println(nfe.toString());
			nfe.printStackTrace();
		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
			System.out.println(npe.toString());
			npe.printStackTrace();

		}
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a string to convert to an integer");
			String str = scanner.next();
			ExceptionHandlingDemo.handleExceptions(str);
		}
	}
}
