package com.number.operations;

public class NumberToWords {
	
	// Array of words for digits 0-19
	private static final String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	// Array of words for tens multiples
	private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	// Method to convert a number to words
	public static String convert(int number) {
		if (number < 20) {
			return units[number]; // Direct lookup for numbers less than 20
		} else if (number < 100) {
			return tens[number / 10] + (number % 10 != 0 ? " " + units[number % 10] : ""); // Tens and units
		} else if (number < 1000) {
			return units[number / 100] + " Hundred" + (number % 100 != 0 ? " and " + convert(number % 100) : "");
			// Hundreds,
			// tens,
			// and
			// units
		} else if (number < 1000000) {
			return convert(number / 1000) + " Thousand" + (number % 1000 != 0 ? " " + convert(number % 1000) : ""); // Thousands
		} else if (number < 1000000000) {
			return convert(number / 1000000) + " Million"+ (number % 1000000 != 0 ? " " + convert(number % 1000000) : ""); 
			// Millions
		} else {
			return convert(number / 1000000000) + " Billion"	+ (number % 1000000000 != 0 ? " " + convert(number % 1000000000) : ""); 
			// Billions
		}
	}

	// Main method to test the conversion
	public static void main(String[] args) {
		int number = 100;
		String convert = convert(number);
		System.out.println(convert);
	}
}
