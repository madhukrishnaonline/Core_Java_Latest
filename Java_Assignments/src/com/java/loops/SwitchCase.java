package com.java.loops;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int x = scanner.nextInt();
		switch (x % 2) {
		case 0:
			System.out.println("This is a Even Number");
			break;

		case 1:
			System.out.println("This is a Odd Number");
			break;
		}// switch

		char gender;

		System.out.println("Enter gender");
		gender = scanner.next().toLowerCase().charAt(0);

		switch (gender) {
		case 'm':
			System.out.println("Male");
			break;
		case 'f':
			System.out.println("Female");
			break;
		default:
			System.out.println("Unspecified Gender");
		}// switch
		scanner.close();
	}// main
}// class