package main;

import java.util.Scanner;

public class PrimeRange {
	static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				} // if
			} // Inner Loop
		} // else
		return true;
	}// isPrime

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number :: ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number :: ");
		int n2 = sc.nextInt();
		for (int i = n1; i <= n2; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			} // if
		} // for
		sc.close();
	}// main
}// class