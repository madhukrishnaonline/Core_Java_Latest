package com.slice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SlicingOperations 
{
	public static void main(String[] args) 
	{
	    //distinct()   //limit()  //skip()   //Intermediate Operations
		List<String> list = Arrays.asList("madhu","krishna","madhu","krishna","rama");
		list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("==========");
		list.stream().limit(2).forEach(System.out::println);
		System.out.println("===========");
		list.stream().skip(2).forEach(System.out::println);
		
		
	}//main
}//class