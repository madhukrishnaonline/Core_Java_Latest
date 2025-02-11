package com.custom.functional_interface5;

@FunctionalInterface
public interface PricingStrategy {
	double calculatePrice(double totalAmount, boolean isFrequentShopper);
}
