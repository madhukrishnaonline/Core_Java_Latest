package com.stringOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOperations2 {
	public static void main(String[] args) {
		String str = "MadhuKrishna Kummari";
		System.out.println("Printing Duplicate Elements Using Java 8");
		List<String> list = Arrays.stream(str.split("")).collect(Collectors.groupingBy(a -> a, Collectors.counting()))
				.entrySet().stream().filter(value -> value.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("Duplicate :: " + list);

		System.out.println("Printing Duplicate Elements Using for loop");
		char[] array = str.toCharArray();
		for(int i=0;i<array.length;i++) {
			 for(int j=1;j<i;j++) {
				 if(array[i]==array[j]) {
					 System.out.println(array[j]);
				 }//if
			 }//for
		}//for
		
		String[] arr = {"MadhuKrishna","Kummari","LakshmiDevi","AlluArjun","Deepika","sirisha"};
		System.out.println("Biggest String");
		String biggestString = Arrays.stream(arr).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		System.out.println(biggestString+"-"+biggestString.length());
		
		System.out.println("Smallest String");
		String smallestString = Arrays.stream(arr).reduce((word1,word2)->word1.length()>word2.length()?word2:word1).get();
		
		System.out.println(smallestString);
	}// main
}// class