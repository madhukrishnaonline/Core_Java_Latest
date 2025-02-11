package com.number.operations;

import java.util.Scanner;

public class FibonacciSeries  {
//Fibonacci Series is a Series of numbers where each number is the sum of two preceding numbers
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = scanner.nextInt();
		int first = 0, second = 1;
		System.out.print(first + " " + second + " ");
		for (int i = 2; i <= size; i++) {
			int sum = first + second;
			System.out.print(sum + " ");
			first = second;
			second = sum;
		} // for

		scanner.close();
	}// main
}// class