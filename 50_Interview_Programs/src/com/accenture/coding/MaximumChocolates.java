package com.accenture.coding;

public class MaximumChocolates {

	public static void main(String[] args) {
		/*		You are given an array of chocolate prices. 
		 * If the price is divisible by 5, it’s free. 
		 * Find the maximum number of chocolates a person can buy(remaining chocolates which are not free).
		*/
		int[] arr = new int[] { 10, 20, 48, 59, 77, 34, 25 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				count++;
			} // if
		} // for
		System.out.println("Person can buy " + (arr.length - count) + " Chocolates");
	}// main
}// class