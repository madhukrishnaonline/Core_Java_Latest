package com.compile.polymorphism;

public class StaticPolyExample {
	public void m1() {
		System.out.println("StaticPolyExample.m1()");
	}

	public void m1(int x) {
		System.out.println("StaticPolyExample.m1() " + x);
	}

	public void m1(int x, int y) {
		System.out.println("StaticPolyExample.m1() " + (x + y));

	}

	public static void main(String[] args) {
		StaticPolyExample example = new StaticPolyExample();
		example.m1(1, 2);//early binding, binding method at compile time
	}

}
