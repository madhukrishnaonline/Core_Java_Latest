package com.shapes;

public class Cylinder extends Shape {
	@Override
	public void draw() {
		System.out.println("Cylinder Shape");
	}

	@Override
	public void calculateArea(int height, int radius) {
		double val = 2 * 3.14 * radius * (radius + height);
		System.out.println("Area of Cylinder :: " + val);
	}
}
