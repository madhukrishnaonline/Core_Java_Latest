package com.lcm;

import java.util.Scanner;

public class LCM_Of_Two_Numbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Number :: ");
		int n1 = scanner.nextInt();
		System.out.println("Enter Second Number :: ");
		int n2 = scanner.nextInt();

		int lcm = (n1 > n2) ? n1 : n2;
		System.out.println(lcm);
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.println("LCM :: " + lcm);
				break;
			} // if
			++lcm;
		} // while
		scanner.close();
	}
}