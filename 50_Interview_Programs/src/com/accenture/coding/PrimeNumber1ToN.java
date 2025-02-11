package com.accenture.coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class PrimeNumber1ToN {

	public static Boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} // if
		else {
			for (int i = 2; i <n; i++) {
				if (n % i == 0) {
					return false;
				} // if
			} // for
		} // else
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Range To");
		int range = scanner.nextInt();

		for (int i = 1; i <= range; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			} // if
		} // for
		scanner.close();
		int[] arr = new int[2];
		int size = 0;
		System.out.println("Prime Numbers");
		for (int i = 2; i <= 120; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				} // if
			} // for
			if (isPrime) {
				System.out.println(i);
				if(size==arr.length) {
					arr = Arrays.copyOf(arr, arr.length*2);
				}//if
				arr[size] = i;
				size++;
			}//if
		} // for
		System.out.println("Prime Numbers in Array");
		Spliterator<Integer> sp = Arrays.spliterator(arr);
		sp.forEachRemaining(System.out::println);
	}// main
}// class