package com.array.operations;

public class ConvertNumberToArray {

	public static Integer[] convertNumberToArrayOfIntegers(Integer num) {

		String str = String.valueOf(num);
		Integer[] arr = new Integer[str.length()];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[i] = Character.getNumericValue(ch);
		} // for

		return arr;
	}

	public static void main(String[] args) {
		Integer num = 7679;
		Integer[] arr = convertNumberToArrayOfIntegers(num);
		for (Integer a : arr) {
			System.out.println(a);
		} // for
	}// main
}// class