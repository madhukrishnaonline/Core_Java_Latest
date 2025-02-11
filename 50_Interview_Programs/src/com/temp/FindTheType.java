package com.temp;

import java.util.Scanner;

public class FindTheType {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Text");
		String nextLine = scanner.nextLine();
		if (!nextLine.matches("\\d+")) {
			System.out.println("String");
		} // if
		else {
			System.out.println("Number");
		} // else

		scanner.close();
	}// main
}// class