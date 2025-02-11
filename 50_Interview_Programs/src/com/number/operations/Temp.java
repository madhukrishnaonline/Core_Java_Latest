package com.number.operations;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine();

//		String str2 = str.replace(str.charAt(len), '*');
//		StringBuilder builder = new StringBuilder();
		/*builder.append(str);
		int len = builder.length();	
		System.out.println(builder.replace(len-1, len, "*").toString());*/

		int count = 0;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = (int) ch;
			if (ascii >= 65 && ascii <= 90) {
				count = 0;
				builder.append(ch);
			} else if (ascii >= 97 && ascii <= 122) {
				count = 0;
				builder.append(ch);
			} else if (ascii >= 48 && ascii <= 57) {
				count += Character.getNumericValue(ch);
				String temp = String.valueOf(count);
				builder.append(ch);
				int len = builder.length();
				builder.replace(len - 1, len, temp);
			} // else if
			else {
				count = 0;
				builder.append(ch);
			} // else
		} // for
		System.out.println(builder);
		scanner.close();
	}// main
}// class