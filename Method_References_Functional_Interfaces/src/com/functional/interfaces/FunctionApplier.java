package com.functional.interfaces;

import java.util.function.Function;

public class FunctionApplier {
	public static int applyFunction(int value, Function<Integer, Integer> function) {
		return function.apply(value);
	}

	public static void main(String[] args) {
		int originalNumber = 5;

		Function<Integer, Integer> add = num -> originalNumber + num;
		Function<Integer, Integer> multiply = num -> originalNumber * num;
		Function<Integer, Integer> subtract = num -> originalNumber - num;
		int number = 3;
		System.out.println("Original Number :: "+originalNumber);
		System.out.println("After Adding "+number+":: "+applyFunction(number, add));
		System.out.println("After Multiplying by "+number+":: "+applyFunction(number, multiply));
		System.out.println("After Substracting by "+number+":: "+applyFunction(number, subtract));
	}

}
