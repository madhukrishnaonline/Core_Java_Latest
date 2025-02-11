package com.string.operations;

public class PrintCharsAtEvenOddPositions {

	public static void main(String[] args) {
		                  // 123456789101112
		String str = "MadhuKrishna";

		System.out.println("===Forward Direction===");
		System.out.println("==Even Position==");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((i + 1) % 2 == 0) {
				System.out.print(ch);
			} // if
		} // for
		System.out.println("\n==Odd Position==");
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if ((j + 1) % 2 == 1) {
				System.out.print(ch);
			} // if
		} // for
		System.out.println("\n===Backward Direction===");
		System.out.println("==Even Position==");
		for (int i = str.length()-1; i >=0;i--) {
			char ch = str.charAt(i);
			int position = str.length()-i;
			if (position % 2 == 0) {
				System.out.print(ch);
			} // if
		} // for
		System.out.println("\n==Odd Position==");
		for (int j = str.length()-1; j >=0; j--) {
			int position = str.length()-j;
			char ch = str.charAt(j);
			if (position % 2 == 1) {
				System.out.print(ch);
			} // if
		} // for
		
	}// main
}// class
