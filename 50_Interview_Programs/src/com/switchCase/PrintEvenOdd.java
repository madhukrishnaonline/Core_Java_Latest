package com.switchCase;

public class PrintEvenOdd {
	private static String isEvenOdd(int num) {
		return switch (num % 2) {
		case 0 -> "Even Number";
		case 1 -> "Odd Number";
		default -> "Unknown";
		};
	}

	public static void main(String[] args) {
		System.out.println(isEvenOdd(2));
	}

}
