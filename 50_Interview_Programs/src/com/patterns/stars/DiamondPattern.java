package com.patterns.stars;

public class DiamondPattern {
	public static void main(String[] args) {
		int rows= 5;
		for (int i = 1; i < rows; i++) {
			for (int space = i; space <= rows; space++) {
				System.out.print("  ");
			}
			for (int star = 1; star <= i; star++) {
				System.out.print("* ");
			}
			for (int star = 1; star < i; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//second half
		for (int i = 1; i <= rows; i++) {
			for (int space = 1; space <= i; space++) {
				System.out.print("  ");
			}
			for (int star = i; star <= rows; star++) {
				System.out.print("* ");
			}
			for (int star = i; star < rows; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
/*
//first half
1.decreasing space
2.increasing star
3.increasing star
//second half
opposite of 1,2,3
===================
Diamond Pattern
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        *
====================
*/