package com.string.operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringChars {
	public static String sortByUsingToCharArray(String str) {
		char[] chArr = str.toCharArray();
		Arrays.sort(chArr);
		return String.valueOf(chArr);
	}

	/*public static String sortByUsingToCharArrayAndCaseInSensitive(String str) {
		char[] chArr = str.toCharArray();
		Arrays.sort(chArr,String.CASE_INSENSITIVE_ORDER);
		return String.valueOf(chArr);
	}*/
	
	public static String sortByUsingIntStream(String str) {
		return str.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
	}
	public static String sortByUsingStream(String str) {
		return Stream.of(str.split("")).sorted().collect(Collectors.joining());
	}
	public static String sortByUsingTreeSet(String str) {
	return new TreeSet<>(str.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.toList())).stream().collect(Collectors.joining());
	}
	public static String sortByToCharArray(String str) {
		char[] chArr = str.toCharArray();
		Arrays.sort(chArr);
		return String.valueOf(chArr);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = scanner.nextLine();
		System.out.println(sortByUsingToCharArray(str));
		
		
		scanner.close();
	}

}
