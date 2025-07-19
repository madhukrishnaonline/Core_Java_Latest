package com.shapes;

public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle Shape");
	}

	@Override
	public void calculateArea(int height, int radius) {
		double val = 3.14 * radius * 2;
		System.out.println("Area of Circle :: " + val);
	}
}
