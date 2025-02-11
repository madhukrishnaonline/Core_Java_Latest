package com.nareshit.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

public class StreamAPIDemo1 {
	public static void main(String[] args) {
		String strArr[] = { "apples", "banana", "octopus", "apricot", "elephant", "orange", "subbu" };
		System.out.println(Arrays.toString(strArr));
		System.out.println("===============");

		// get the first letter from every string obj
		List<Character> list = Stream.of(strArr).flatMap(str1 -> Arrays.asList(str1.charAt(0)).stream())
				.collect(Collectors.toList());
		System.out.println(list);

		System.out.println("===============");
		/*Write a program to process a list of strings.
		Use a custom predicate to filter strings that start with a vowel and have a length greater than 5.*/
		Predicate<String> predicate = (str) -> str.length() > 5 && str.matches("(?i)^[aeiou].*");

		List<String> list2 = Arrays.asList(strArr).stream().filter(predicate).collect(Collectors.toList());
		System.out.println(list2);

		System.out.println("===============");
		/*Use Stream.iterate or Stream.generate to create an infinite stream. 
		Then filter and map the data to produce the first 10 odd squares.*/
		List<Integer> list3 = Stream.iterate(1, n -> n + 1).map(num -> num * num).filter(num -> num % 2 != 0).limit(10)
				.collect(Collectors.toList());
		System.out.println(list3);

		System.out.println("===============");
		/*Given a list of strings, sort them by length.*/
		List<String> list4 = Arrays.asList(strArr).stream().sorted((a, b) -> Integer.compare(a.length(), b.length()))
				.collect(Collectors.toList());
		System.out.println(list4);

		System.out.println("===============");
		/*Given a list of strings, sort them by length first and lexicographically second.
		Implement this using sorted.*/
		List<String> list5 = Arrays.asList(strArr).stream().sorted((a, b) -> {
			int compare = Integer.compare(a.length(), b.length());
			return compare != 0 ? compare : a.compareTo(b);
		}).collect(Collectors.toList());
		System.out.println(list5);

		System.out.println("===============");
		/*Given a list of sentences (Strings), 
		*use flatMap to create a list of all unique words in lowercase.*/
		List<String> sentences = new ArrayList<>();
		sentences.add("The quick brown fox jumps over the lazy dog. The dog was lazy.");
		sentences.add("Java is a powerful programming language. Java is widely used.");
		sentences.add(
				"Functional programming is gaining popularity. Functional programming helps in parallel computing.");

		List<String> list6 = sentences.stream().flatMap(sentense -> Stream.of(sentense.split(" ")))
				.map(String::toLowerCase).map(str -> str.replaceAll("[^a-zA-Z ]", "")).distinct()
				.collect(Collectors.toList());
		System.out.println(list6);

		System.out.println("===============");
		
		
		System.out.println("===============");
		/*Implement a method using streams to convert a list of objects (e.g., Employee) 
		 * into another list containing only one property of the object (e.g., Employee.name).*/
		List<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee(444, "Madhu"));
		listOfEmployees.add(new Employee(555, "Krishna"));
		listOfEmployees.add(new Employee(666, "Madhu Krishna"));
		listOfEmployees.add(new Employee(111, "Subbu"));
		
		List<String> names = listOfEmployees.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(names);
		
	}
}
