package com.array.operations;

public class Temp {

	public static void main(String[] args) {
		Long num1 = 100l;
		Long num2 = 100l;
		Long num4 = 127l;
		Long num5 = 127l;

		if (num1 == num2) {
			System.out.println("num1==num2");
			System.out.println(System.identityHashCode(num1)+"-"+System.identityHashCode(num2));
		} // if
		else {
			System.out.println("num1!=num2");
			System.out.println(System.identityHashCode(num1)+"-"+System.identityHashCode(num2));
		} // else

		if (num4 == num5) {
			System.out.println("num4==num5");
			System.out.println(System.identityHashCode(num4)+"-"+System.identityHashCode(num5));
		} // if
		else {
			System.out.println("num4!=num5");
			System.out.println(System.identityHashCode(num4)+"-"+System.identityHashCode(num5));
		} // else
	}// main
}// class