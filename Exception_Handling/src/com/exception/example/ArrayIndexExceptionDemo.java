package com.exception.example;

import java.util.Scanner;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)){
//			int[] arr = new int[2];
			System.out.println("Enter the Size of Array");
			int size = scanner.nextInt();
			int[] arr = new int[size];
			
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An ArrayIndexOutOfBoundsException occurred.");
			System.out.println("Message:" + e.getMessage());
			System.out.println("String representation: " + e.toString());
			System.out.println("Stack trace");
			e.printStackTrace();
		}
	}

}
