package com.functional.interfaces;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class NumberGenerator {
	public static int generateRandomNumber(int min, int max) {
		Random random = new Random();
		Supplier<Integer> randomNumber = () ->random.nextInt(min,max);
		return randomNumber.get();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the minimum value :: ");
		int min = scanner.nextInt();
		System.out.println("Enter the maximum value :: ");
		int max = scanner.nextInt();

		System.out.println(generateRandomNumber(min, max));
		scanner.close();
	}

}
