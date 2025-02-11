package com.functional.interfaces;

import java.util.function.Consumer;

public class ValueModifier {
	public static void modifyValue(int value, Consumer<Integer> consumer) {
		consumer.accept(value);
	}

	public static void main(String[] args) {
		int number = 5;
		int increment=3;
		Consumer<Integer> doubleValue = num -> System.out.println(num * 2);
		Consumer<Integer> incrementBy = num -> System.out.println(number + num);
		Consumer<Integer> squareValue = num -> System.out.println( num * num);
		
		System.out.println("Original Value :: " + number);
		System.out.print("Double Value :: ");
		modifyValue(number, doubleValue);
		System.out.print("Increment by "+increment+":: ");
		modifyValue(3, incrementBy);
		System.out.print("Square Value :: ");
		modifyValue(number, squareValue);
	}

}
