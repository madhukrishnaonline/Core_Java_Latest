package com.exception.example;

public class ArrayStoreExceptionExample {
	public static void storeObjects() {
		Object[] strings = new String[3];
		strings[0] = "Hello";
		strings[1] = "World";
		strings[2] = 5;

		System.out.println("Objects Stored Successfully");
	}

	public static void main(String[] args) {
		try {
			storeObjects();
		} catch (ArrayStoreException ase) {
			System.out.println(ase.toString());
		}
	}

}
