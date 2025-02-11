package com.stringOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOperations {
	public static void main(String[] args) {
		String str = "2,23,2,1,1,23,35";
		
		// ascending order
		System.out.println("Ascending Order with java-8");
		List<String> ascending = Arrays.stream(str.split(",")).sorted().collect(Collectors.toList());
		System.out.println(ascending);
		
		System.out.println("Ascending Order with Typecasting");
		StringTokenizer tokenizer = new StringTokenizer(str, ",");
		int countTokens = tokenizer.countTokens();
		int[] arr = new int[countTokens];
		for (int i = 0; i <= countTokens - 1; i++) {
			Integer token = Integer.valueOf(tokenizer.nextToken());
			arr[i] = new Integer(token);
		} // for
		//		Arrays.stream(arr).sorted().forEach(System.out::println);
		Arrays.sort(arr);
		for (int k : arr) {
			System.out.print(k+" ");
		} // for
		
		System.out.println("\nStarts with 2");
		List<String> nums = Arrays.stream(arr).boxed().map(n->n+" ").filter(n->n.startsWith("2")).collect(Collectors.toList());
		System.out.println(nums);
		
		System.out.println("String Joining");
		 List<String> list = Arrays.asList("3","5","9","7");
		String join = String.join("+",list);
		System.out.println(join);
		
		System.out.println("\nDescending Order with java-8");
		List<String> descending = Arrays.stream(str.split(",")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descending);
		
		System.out.println("Descending Order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}//for
		
			// duplicate numbers
		System.out.println("\nDuplicate Numbers using for loop");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j]+" ");
					break;
				} // if
			} // for
		} // for
		System.out.println("\nDuplicate Numbers Using java-8");
		List<String> duplicate = Arrays.stream(str.split(",")).sorted().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(value->value.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicate);
		
		System.out.println("Remove Duplicate Elements");
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {// 1!=1 false,1!=2 true
				arr[j++] = arr[i];// 1,2,23,35
			} // if
		} // for
		arr[j++] = arr[arr.length - 1];
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i]+" ");
		} // for
		
		System.out.println("\nRemove Duplicate Elements- Java 8");
		List<String> distinct = Arrays.stream(str.split(",")).sorted().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		String str2 = "Madhu Krishna";
		System.out.println("Repetitive Chars");
		Map<String, List<String>> map = Arrays.stream(str2.split("")).collect(Collectors.groupingBy(a->a));
		System.out.println(map);
		System.out.println("Repetitive Chars Count");
		Map<String, Long> map2 = Arrays.stream(str2.split("")).collect(Collectors.groupingBy(a->a,Collectors.counting()));
		System.out.println(map2);    
		
		System.out.println("Most Repetitive Char");
		Entry<String, Long> max = Collections.max(map2.entrySet(),Map.Entry.comparingByValue());
		System.out.println(max);
	    
	}// main
}// class