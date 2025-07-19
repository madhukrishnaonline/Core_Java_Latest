package com.patterns.stars;

public class RectanglePattern {
	public static void rectanglePattern(int rows,int columns) {
		for(int row=1;row<=rows;row++) {
			for(int col=1;col<=columns;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void hollowRectanglePattern(int rows,int columns) {
		for(int row=1;row<=rows;row++) {
			for(int col=1;col<=columns;col++) {
				if(row==1||row==rows||col==1||col==columns) {
					System.out.print("* ");					
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int rows = 3;
		int columns = 6;
		rectanglePattern(rows, columns);
		System.out.println("================");
		hollowRectanglePattern(rows, columns);
		
	}
}
/*

* * * * * *
* * * * * *
* * * * * *
* * * * * *

*/