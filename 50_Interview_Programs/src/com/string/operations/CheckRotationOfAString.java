package com.string.operations;

public class CheckRotationOfAString {
	public static boolean isRotation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		} // if

		String concatenated = str1 + str1;

		return concatenated.contains(str2);
	}

	public static void main(String[] args) {
		String str1 = "max";
		String str2 = "axm";

		if (isRotation(str1, str2)) {
			System.out.println(str1 + " is a rotation of " + str2);
		} // if
		else {
			System.out.println(str1 + " is not a rotation of " + str2);
		} // else
	}// main
}// class