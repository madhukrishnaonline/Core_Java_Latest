package com.java8;

import java.util.function.Predicate;

public class Temp {
	public static void main(String[] args) {
		MyFunction<Integer> fun = new MyFunction<>() {
			@Override
			public boolean filter(Predicate<Integer> predicate) {
				return predicate.test(4);
			};
		};
		System.out.println(fun.filter((t) -> t.equals(5)));
	}
}