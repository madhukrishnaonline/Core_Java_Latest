package main;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int n = sc.nextInt();
		System.out.println("Enter Power :: ");
		int p = sc.nextInt();
		int d = (int) Math.pow(n, p);
		System.out.println("The Power of " + n + "," + p + " is " + d);
		sc.close();
	}// main
}// class