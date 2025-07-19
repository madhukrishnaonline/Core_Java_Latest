package com.geometric.shape;

import java.util.Scanner;

public class Triangle extends GeometricShape {
	private Scanner scanner;

	public Triangle(Scanner scanner) {
		this.scanner = scanner;
	}

	int area;

	@Override
	void area() {
		System.out.println("Enter the length of base");
		int base = scanner.nextInt();
		System.out.println("Enter the height");
		int height = scanner.nextInt();
		area = (base * height) / 2;
		System.out.println("Area of Triangle " + area);
	}

	@Override
	void perimeter() {
		System.out.println("Enter the lengths of the three sides");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int perimeter = a + b + c;
		System.out.println("Perimeter of Triangle " + perimeter);
	}
}