package com.patterns.stars;

public class SandHourGlassPattern {
	public static void main(String[] args) {
		int rows = 5;
        for(int i=1;i<rows;i++) {
        	for(int space=1;space<=i;space++) {
        		System.out.print("  ");
        	}
        	for(int star=i;star<rows;star++) {
        		System.out.print("* ");
        	}
        	for(int star=i;star<=rows;star++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        //second half
        for(int i=1;i<=rows;i++) {
        	for(int space=i;space<=rows;space++) {
        		System.out.print("  ");
        	}
        	for(int star=1;star<i;star++) {
        		System.out.print("* ");
        	}
        	for(int star=1;star<=i;star++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}
}
/*
1.increasing space
2.decreasing star
3.decreasing star
4.decreasing space
5.increasing star
6.increasing star
===========
Hour Glass|
Sand Glass
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
==========
*/