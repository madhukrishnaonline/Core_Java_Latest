package main;

import java.util.Scanner;

public class Even_Odd_Ternary_Bitwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		String result = num % 2 == 1 ? "Odd Number" : "Even Number";
		System.out.println(result);

		System.out.println("====Bitwise Operator====");
		// Returns true if n is even, else odd
		// boolean isEven (int num)
		{
			// n & 1 is 1, then odd, else even
			// return (!(num & 1));
		}

		// if (isEven (num))
		{
			System.out.println("Even");
		}
		// else
		{
			System.out.println("Odd");
		}
		sc.close();
	}// main
}// class