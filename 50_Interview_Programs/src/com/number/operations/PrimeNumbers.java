package com.number.operations;

import java.util.Scanner;

public class PrimeNumbers {
	public static Boolean isPrime(int n) {
		if (n <2) {
			return false;
		} // if
		else {
			for (int i = 2; i <=n/2; i++) {
				if (n % i == 0) {
					return false;
				} // if
			} // for
		}//else
		return true;
	}//

	public static void main(String[] args) {
		/*	Boolean prime = PrimeNumbers.isPrime(13);
			if (prime) {
				System.out.println("Prime Number");
			} // if
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Num");
		int start = sc.nextInt();
		System.out.println("Enter the End Num");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			} // if
		} // for

		sc.close();
	}// main
}// class