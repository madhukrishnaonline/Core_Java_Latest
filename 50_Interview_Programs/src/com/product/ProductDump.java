package com.product;

import java.util.ArrayList;
import java.util.List;

public class ProductDump {
	private static List<Product> products = new ArrayList<>();

	public static void dump() {
		products.add(new Product("Lenovo Laptop", 35999.99, 2000.5, 1000.0));
		products.add(new Product("Realme Adapter", 499.0, 80.5, 90.0));
		products.add(new Product("mouse", 550.75, 55.5, 100.0));
		products.add(new Product("keyboard", 690.05, 150.50, 110.0));
		products.add(new Product("Mouse & Keyboard Combo", 1500.95, 260.5, 150.0));
		products.add(new Product("Realme Mobile", 15999.99, 200.5, 500.0));
	}

	public static List<Product> getProducts() {
		dump();
		return products;
	}
}