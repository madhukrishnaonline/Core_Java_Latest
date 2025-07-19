package com.geometric.shape;

import java.util.Scanner;

public class Square extends GeometricShape {
	private Scanner scanner;

	public Square(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	void area() {
		System.out.println("Enter the length of side");
		int side = scanner.nextInt();
		int cal = side * side;
		System.out.println("Area of a Circle :: " + cal);
	}

	@Override
	void perimeter() {
		System.out.println("Enter the length of side");
		int side = scanner.nextInt();
		int cal = 4 * side;
		System.out.println("Perimeter of a Circle :: " + cal);
	}

}