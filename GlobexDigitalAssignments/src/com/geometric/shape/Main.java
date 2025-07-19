package com.geometric.shape;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GeometricShape shape = new Triangle(scanner);
		shape.area();
		shape.perimeter();
		GeometricShape shape2 = new Square(scanner);
		shape2.area();
		shape2.perimeter();
	}
}