package com.functional.interfaces;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestingFunctionalInterfaces {
	public static boolean isEven(int number) {
		Predicate<Integer> isEven = num -> num % 2 == 0;
		return isEven.test(number);
	}

	public static boolean isPrime(int number) {
		if (number <= 2) {
			return false;
		}
		Predicate<Integer> isPrime = num -> {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			} // for
			return true;
		};
		return isPrime.test(number);
	}

	public static void toUpperCase(String str) {
		Consumer<String> consumer = str1 -> System.out.println(str1.toUpperCase());
		consumer.accept(str);
	}

	public static void sqrt(Integer number) {
		Consumer<Integer> consumer = num -> System.out.println(num * num);
		consumer.accept(number);
	}

	public static String supplyRandomString() {
		Supplier<String> supplier = () -> {
			Random random = new Random();
			StringBuilder random1 = new StringBuilder("NIT");
			for (int i = 1; i <= 4; i++) {
				random1.append(random.nextInt(9));
			} // for
			return random1.toString();
		};
		return supplier.get();
	}

	public static Integer supplyRandomInteger() {
		Supplier<Integer> supplier = () -> {
			Random random = new Random();
			StringBuilder random1 = new StringBuilder();
			for (int i = 1; i <= 2; i++) {
				random1.append(random.nextInt(9));
			} // for
			return Integer.parseInt(random1.toString());
		};
		return supplier.get();
	}

	public static Integer getLength(String str) {
		Function<String, Integer> fun = str1 -> str1.length();
		return fun.apply(str);
	}

	public static double divideAndFormat(Integer number) {
		Function<Integer, Double> fun = num -> (double) num % 2.0;
		return fun.apply(number);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scanner.nextLine();
		System.out.println("Enter Number :");
		int number = scanner.nextInt();

		System.out.println("==========Predicate<T>==========");
		System.out.println(number + " IsEven :" + isEven(number));
		System.out.println(number + " IsPrime :" + isPrime(number));

		System.out.println("==========Consumer<T>==========");
		System.out.print(str + ":");
		toUpperCase(str);
		System.out.print("Square Root of " + number + " : ");
		sqrt(number);

		System.out.println("==========Supplier<T>==========");
		System.out.println("Random String : " + supplyRandomString());
		System.out.println("Randome Integer : " + supplyRandomInteger());

		System.out.println("==========Function<T,R>==========");
		System.out.println("Length of \"" + str + "\" : " + getLength(str));
		System.out.println("Divide " + number + " by 2.0 :" + divideAndFormat(number));
		scanner.close();
	}

}
