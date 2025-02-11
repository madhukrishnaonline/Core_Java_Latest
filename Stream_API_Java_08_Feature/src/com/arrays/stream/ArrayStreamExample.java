package com.arrays.stream;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayStreamExample {
	public static void main(String[] args) {
		Integer[] i = new Integer[] { 2, 3, 1, 4, 6 };

		System.out.println("=====Using Arrays -Sum=====");
		int sum = 0;
		for (Integer n : i) {
			sum = sum + n;
		} // for
		System.out.println(sum);

		System.out.println("=====Using Stream -Sum=====");
		Integer sum2 = Arrays.asList(i).stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum2);

		System.out.println("=====find missing Number======");
		System.out.println("=====Using Arrays=====");
		int sum3 = 0;
		int len = i.length;
		int totalSum = (len + 1) * (len + 2) / 2;
		System.out.println("Total Sum :: " + totalSum);
		for (Integer m : i) {
			sum3 = sum3 + m;
		} // for
		System.out.println("Missing Number :: " + (totalSum - sum3));

		System.out.println("=====Using Stream=====");
		System.out.println("Missing Number :: " + (totalSum - sum2));

		System.out.println("After Sorting");
		System.out.println("=====Using Stream Descending Order -0=====");
		Arrays.asList(i).stream().sorted().forEach(System.out::print);
		System.out.println("\n=====Using Stream Descending Order -1=====");
		Arrays.asList(i).stream().sorted((a, b) -> a > b ? -1 : 1).forEach(System.out::print);
		System.out.println("\n=====Using Stream Descending Order -2=====");
		Arrays.asList(i).stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println("\n=====Using Stream Descending Order -3=====");
		Arrays.asList(i).stream().sorted(Comparator.comparing(Integer::intValue).reversed()).forEach(System.out::print);
		System.out.println("\n=====Using Arrays=====");
		Arrays.sort(i);
		for (Integer a : i) {
			System.out.print(a);
		} // for
	}// main
}// class