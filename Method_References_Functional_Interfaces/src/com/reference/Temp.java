package com.reference;

import java.util.Scanner;
import java.util.function.Predicate;

public class Temp {
	public static boolean isContainDigit(String str) {
		Predicate<Character> predicate = Character::isDigit;
		boolean isDigit = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (predicate.test(ch)) {
				isDigit = true;
				break;
			}
		}
		return isDigit;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scanner.nextLine();
        System.out.println(isContainDigit(str));
		scanner.close();
	}

}
