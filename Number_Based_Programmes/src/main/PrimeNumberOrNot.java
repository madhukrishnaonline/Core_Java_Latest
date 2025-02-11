package main;

import java.util.Scanner;

public class PrimeNumberOrNot {
	static void checkPrime(int n) {
		if (n < 2) {
			System.out.println("The Given Number " + n + " is Not a Prime Number....");
			System.exit(0);
		} // if
		int count = 0;
		for (int i = 1; i <n; i++) {
			if (n % i == 0) {
				count += 1;
			} // if
		} // loop
		if (count > 2) {
			System.out.println("The Given Number " + n + " is Not a Prime Number....");
		} // if
		else {
			System.out.println("The Given Number " + n + " is Prime Number....");
		} // else
	}// checkPrime

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number :: ");
		int n = sc.nextInt();
		checkPrime(n);
		sc.close();
	}
}// class