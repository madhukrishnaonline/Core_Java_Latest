package com.exception.example;

import java.util.Scanner;

public class AreaCalculator {
	public static double calculateArea(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double length = null;
		Double width = null;
		try(scanner){
			System.out.println("Enter the Length of a Rectangle:");
			length = scanner.nextDouble();
			System.out.println("Enter the Width of a Rectangle:");
			width = scanner.nextDouble();
			if(length<0 || width<0) {
				throw new IllegalArgumentException();
			}//if
			System.out.println("Area of rectangle with length "+length+" and width "+width+" is:"+calculateArea(length, width));
		}catch(IllegalArgumentException iae) {
			System.out.print(iae.toString());
			System.out.println(" Dimensions must be positive: length="+length+", width="+width);
		}
	}

}
