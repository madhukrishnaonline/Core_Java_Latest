package main;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number :: ");
		int num = sc.nextInt();
		int sum = 0;
		System.out.println("=====Using For Loop=====");
		if (num == 0) {
			System.out.println("It's a Whole Number....");
		} // if
		else if (num < 0) {
			System.out.println("Not a Natural Number...");
		} // else if
		else {
			for (int n = 1; n <= num; n++) {
				sum = sum + n;
			} // for
			System.out.println("Sum OF " + num + " Natural Number is :: " + sum);
		} // else
		System.out.println("======Using Formula======");
		int result = num * (num + 1) / 2;
		System.out.println(result);
		sc.close();
	}
}
