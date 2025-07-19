package com.java8;

import java.util.function.Predicate;

@FunctionalInterface
interface MyFunction<T> {
	boolean filter(Predicate<T> predicate);
}