package com.array.operations;

import java.util.Scanner;

public class NumberToWords1 {
	public static final String[] belowTwenty = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static final String[] belowHundred = { "","", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
			"Eighty", "Ninty" };

	public static String convert(int number) {
		if (number < 20) {
			return belowTwenty[number];
		} // if
		else if (number < 100) {
			return belowHundred[number/10]+((number%10!=0)?" "+belowTwenty[number%10]:"");
		} // else if
		else if(number<1000) {
			return belowTwenty[number/100]+" Hundred"+(number%100!=0?" and "+convert(number%100):"");
		}//else if
		else if(number<1000000) {
			return convert(number/1000)+" Thousand"+(number%1000!=0?" and "+convert(number%1000):"");
		}//else if
		else if(number<1000000000) {
			return convert(number/1000000)+" Million"+(number%1000000!=0?" and "+convert(number%1000000):"");
		}//else if
		else{
			return convert(number/1000000000)+" Billion"+(number%1000000000!=0?" and "+convert(number%1000000000):"");
		}//else
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		String word = convert(num);
		System.out.println(word);

		scanner.close();
	}// main
}// class