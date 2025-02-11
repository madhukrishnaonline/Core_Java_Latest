package com.intstream_examples;

import java.util.Arrays;
import java.util.OptionalDouble;

public class IntStreamExample1 {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 4, 3, 0 };

		System.out.println("====================");
		long count = Arrays.stream(arr).filter(num -> num % 2 == 0).count();
		System.out.println(count);

		System.out.println("====================");
		OptionalDouble average = Arrays.stream(arr).filter(num -> num % 2 == 0).average();
		average.ifPresent(System.out::println);

		System.out.println("====================");
		int[] even = { 0, 8, 2, 4, 6, 10 };
		int[] odd = { 1, 9, 5, 7, 3 };
		int[] prime = { 3, 5, 7, 11 };

		int[] allNumbers = Arrays.asList(even, odd, prime).stream().flatMapToInt(num -> Arrays.stream(num)).distinct().sorted().toArray();
		System.out.println(Arrays.toString(allNumbers));
	}

}
