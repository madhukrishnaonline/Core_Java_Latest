package com.accenture.coding;

import java.util.Scanner;

public class FloydsTriangle {
	public static void floydsTriangle(int n) {
		int number=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			} // for
			System.out.println();
		} // for
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No. of rows");
		int rows = scanner.nextInt();
        System.out.println("Floyds Triangle");
		floydsTriangle(rows);
		scanner.close();
	}

}
