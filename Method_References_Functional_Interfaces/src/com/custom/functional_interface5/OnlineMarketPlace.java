package com.custom.functional_interface5;

import java.util.Scanner;

public class OnlineMarketPlace {

	public static void main(String[] args) {
		System.out.println("Welcome to the Online Marketplace!");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the total order amount in rupees:");
		double totalAmount = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Are you a frequent shopper? (yes/no):");
		String isFrequentShopper = scanner.nextLine();

		System.out.print("Enter the product category:");
		String category = scanner.nextLine();

		boolean isFrequentShoper = false;
		if (isFrequentShopper.equalsIgnoreCase("Yes")) {
			isFrequentShoper = true;
		}

		ProductCategoryChecker categoryChecker = (total, categry) -> {
			if (category.equalsIgnoreCase("Electronics")) {
				return total * 0.10;
			} else if (category.equalsIgnoreCase("Clothing")) {
				return total * 0.05;
			}
			return 0;
		};
		
		PricingStrategy pricingStrategy = (total, isFrequent) -> {
			double amount = categoryChecker.applyCategoryDiscount(totalAmount, category);
			if (isFrequent) {
				total -= total * 0.05;
			} // if
			return total - amount;
		};

		double totalPrice = pricingStrategy.calculatePrice(totalAmount, isFrequentShoper);
		System.out.println("Total cost after pricing strategy:"+totalPrice);
		
		scanner.close();
	}

}
