package com.inheritance.exception;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try (scanner) {
			System.out.println("Enter the Class to Load");
			String clazz = scanner.nextLine();
			ChildClass child = new ChildClass();
			child.loadingClass(clazz);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error loading class in ChildClass. Converting to unchecked exception.");
			System.out.println("Exception caught: Unchecked Exception: RuntimeException from ChildClass");
		}
	}

}
