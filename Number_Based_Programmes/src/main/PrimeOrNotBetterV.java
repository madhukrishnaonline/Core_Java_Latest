package main;

import java.util.Scanner;

public class PrimeOrNotBetterV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number :: ");
		int n = sc.nextInt();

		boolean isPrime = true;
		if (n < 2) {
			isPrime = false;
		} // if
		else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				} // if
			} // for
		} // else
		String result = isPrime ? "Prime Number" : "Not a Prime Number";
		System.out.println(result);
		sc.close();
		
		/*Object object = new Object();
		Integer integer = (Integer) object ;*/
	}// main
}// class
