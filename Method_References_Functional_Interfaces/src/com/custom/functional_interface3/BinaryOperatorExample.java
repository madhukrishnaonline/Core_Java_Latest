package com.custom.functional_interface3;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorExample {
	public static void main(String[] args) {
		System.out.println("Arithmetic Operations");
		Integer number1 = 6;
		Integer number2 = 10;
		BinaryOperator<Integer> addition = (num1, num2) -> num1 + num2;
		System.out.println("Sum of "+number1+" and "+number2+" is "+addition.apply(number1,number2));

		BinaryOperator<Integer> multiplication = (num1, num2) -> num1 * num2;
		System.out.println("Multiplication of "+number1+" and "+number2+" is "+multiplication.apply(number1,number2));

		System.out.println("String Concatenation");
		BinaryOperator<String> concat = (str1, str2) -> str1.concat(str2);
		System.out.println(concat.apply("Core", "Java"));

		System.out.println("Comparisions");
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(Comparator.comparing(Function.identity()));
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(Comparator.comparing(Function.identity()));

		System.out.println(number1 + " " + number2 + " Min Value :: " + minBy.apply(number1,number2));
		System.out.println(number1 + " " + number2 + " Max Value :: " + maxBy.apply(number1,number2));

	}
}
