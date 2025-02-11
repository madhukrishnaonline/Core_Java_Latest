package com.exception.example;

public class ClassCastExceptionDemo {
	public static void handleClassCastException() {
		try {
			Object[] arr = { "Hello", 2, true };
			
			String str = (String) arr[0];
			System.out.println("Casting Successful :" + str);
			String str1 = (String) arr[1];
			System.out.println("Casting Successful :" + str1);
			String str2 = (String) arr[2];
			System.out.println("Casting Successful :" + str2);
		} catch (ClassCastException e) {
			System.out.println(e.toString());
			System.out.println("Stack Trace :");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		handleClassCastException();
	}

}
