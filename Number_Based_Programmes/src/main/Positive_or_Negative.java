package main;

import java.util.Scanner;

public class Positive_or_Negative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number :: ");
		int num = sc.nextInt();
		if (num == 0) {
			System.out.println("You Entered Zero....");
		} else {
			String result = num > 0 ? "Positive Number" : "Negative Number";
			System.out.println(result);
		}
		sc.close();
	}// main
}// class