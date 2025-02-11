package com.functional.interfaces;

import java.util.function.Predicate;

public class CalculationLogic {
	public static boolean testPredicate(int number, Predicate<Integer> predicate) {
		return predicate.test(number);
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate1 = num -> num % 2 == 0;

		Predicate<Integer> predicate2 = num -> num > 10;

		Predicate<Integer> predicate3 = num -> {
			for (int i = 3; i < num; i++) {
				if (num % i == 0) {
					return false;
				} // if
			} // for
			return true;
		};
		int num = 5;

		System.out.println("isEven :: " + testPredicate(num, predicate1));
		System.out.println("isPrime :: " + testPredicate(num, predicate3));
		System.out.println("isGreaterThanTen :: " + testPredicate(num, predicate2));
	}

}
