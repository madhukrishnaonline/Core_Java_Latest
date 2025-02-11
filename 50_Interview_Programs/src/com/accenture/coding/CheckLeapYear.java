package com.accenture.coding;

import java.util.Scanner;

public class CheckLeapYear {
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} // if
				else {
					return false;
				} // else
			} // if
			else {
				return true;
			} // else
		} // if
		else {
			return false;
		} // else
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = scanner.nextInt();
		System.out.println(isLeapYear(year));
		scanner.close();
	}// main

}
