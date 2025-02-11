package com.accenture.coding;

import java.util.Scanner;

public class PrintWovels {
	public static String printWovels(String str) {
		String wovels = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a' -> wovels += ch;
			case 'e' -> wovels += ch;
			case 'i' -> wovels += ch;
			case 'o' -> wovels += ch;
			case 'u' -> wovels += ch;
			}// switch
		} // for
		return wovels;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Word");
		String str = scanner.nextLine();
		System.out.print("Wovels Are :: " + printWovels(str));
		scanner.close();
	}
}