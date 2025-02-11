package com.custom.functional_interface5;

@FunctionalInterface
public interface ProductCategoryChecker {
	double applyCategoryDiscount(double totalAmount, String category);
}
