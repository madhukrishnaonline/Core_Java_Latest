package com.exception.example;

import java.util.Scanner;

public class ArithmeticExceptionExample {
	public static int performDivision(int v1, int v2) {
		return v1 / v2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try (scanner) {
			System.out.println("Enter DIvidend :");
			int dividend = scanner.nextInt();
			System.out.println("Enter DIvidend :");
			int divisor = scanner.nextInt();

			System.out.println("Result of Division : " + performDivision(dividend, divisor));
		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
		}
	}

}
