package com.exception.example;

import java.util.Scanner;

public class ClassNotFoundExpDemo {

	public ClassNotFoundExpDemo(String className) throws ClassNotFoundException {
		Class<?> clazz = Class.forName(className);
		System.out.println("Class " + clazz.getClass().getName() + " Found : " + clazz.getClass().getName());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String clazz = null;
		try (scanner) {
			System.out.println("Enter the Class Name to load at runtime");
			clazz = scanner.nextLine();
			ClassNotFoundExpDemo demo = new ClassNotFoundExpDemo(clazz);
		} catch (ClassNotFoundException e) {
			System.out.println("Class " + clazz.getClass().getName() + " Not Found : " + clazz.getClass().getName());
			e.printStackTrace();
		}
	}

}
