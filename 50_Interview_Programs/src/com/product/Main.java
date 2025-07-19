package com.product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Product> products = ProductDump.getProducts();

		Collections.sort(products, Comparator.comparingDouble(Product::getWeight));
		products.forEach(System.out::println);
	}
}