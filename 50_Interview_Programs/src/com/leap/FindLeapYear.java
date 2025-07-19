package com.leap;

public class FindLeapYear {
	public static void main(String[] args) {
		int year = 2019;
		System.out.println(isLeapYear(year));

		int count = 0;
		for (int i = 2000; count < 20; i += 4) {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				System.out.println(i);
				count++;
			} // if
		} // for
	}// main

	private static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			return true;
		} // if
		else {
			return false;
		} // else
	}
}// class