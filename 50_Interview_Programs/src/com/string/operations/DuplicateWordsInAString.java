package com.string.operations;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DuplicateWordsInAString {

	public static void main(String[] args) {
		String str = """
				I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn't really happy
				""";

		String[] arr = str.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i+1; j < arr.length; j++) {
				String firstWord = arr[i];
				String secondWord = arr[j];
				if (firstWord.equals(secondWord)) {
					count++;
					arr[j]="0";
				} // if
			} // inner for
			if (count > 1 && arr[i]!="0") {
				System.out.println(arr[i]);
			} // if
		} // for
		System.out.println("=====Using Stream====");
		Arrays.stream(str.split(" ")).filter(word -> word.matches(word.replaceAll("[^a-zA-Z]", "")))
				.collect(Collectors.groupingBy(word -> word, Collectors.counting())).entrySet().stream()
				.filter(word -> word.getValue() > 1).map(word -> word.getKey()).collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);
	}// main

}