package com.java.loops;

public class EvenOddNumber {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				continue;
			} // if
			if (i % 2 == 1) {
				System.out.print("\n" + i + " ");
				continue;
			} // else
		} // for

		System.out.println("\nEven Numbers using while loop");
		int i = 10;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			} // if
			i++;
		} // while
	}// main
}// class