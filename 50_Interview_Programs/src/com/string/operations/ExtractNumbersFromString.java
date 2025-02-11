package com.string.operations;

import java.util.LinkedList;
import java.util.List;

public class ExtractNumbersFromString {
	public static List<Integer> extractNumerics(String str) {
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = (int) ch;
			if (ascii >= 48 && ascii <= 57) {
				int num = ch-'0';
				list.add(num);
			} // if
		} // for
		return list;
	}

	public static void main(String[] args) {
		extractNumerics("Madhu@143").forEach(System.out::println);
		char ch = '1'; //'1'=49 ascii 
		System.out.println(ch-'0');  //49-48 =1 converts to integer,subtracting the ascii values  of the chars and getting int value of itself
	}

}
