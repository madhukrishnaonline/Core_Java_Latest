package com.java.basics;

public class PrintYourName {
	public void printName(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		PrintYourName name = new PrintYourName();
		name.printName("Madhu Krishna");
	}//main
}//class