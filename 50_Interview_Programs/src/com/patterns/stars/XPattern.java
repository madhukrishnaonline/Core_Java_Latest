package com.patterns.stars;

public class XPattern {

	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int space = 1; space <= i; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= 1; star++) {
				System.out.print("*");
			}
			for (int space = i; space < rows; space++) {
				System.out.print(" ");
			}
			for (int space = i; space < rows; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//second half
		for (int i = 1; i <= rows; i++) {
			for (int space = i; space <= rows; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= 1; star++) {
				System.out.print("*");
			}
			for (int space = 1; space < i; space++) {
				System.out.print(" ");
			}
			for (int space = 1; space < i; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

/*
1.increasing space
2.print star
3.decreasing space
4.decreasing space
5.print star
==========
 X Pattern
*       *
  *   *
    *
  *   *
*       *
===========
*/
