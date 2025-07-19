package com.patterns.stars;

public class AlphabeticPatterns {
	private static void incrementSecondAlphaStep(int rows) {
		for (int i = 1; i <= rows; i++) {
			char ch = (char) ('A' + i - 1);
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++);
			} // inner
			System.out.println();
		} // for
	}

	private static void decrementSecondAlphaStep(int rows) {
		for (int i = 1; i <= rows; i++) {
			char ch = (char) (rows  +65-i);
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++);
			} // inner
			System.out.println();
		} // for

	}

	public static void main(String[] args) {
		incrementSecondAlphaStep(4);
		System.out.println("==============");
		decrementSecondAlphaStep(6);
	}// class

}
