package com.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import com.predicate.EmployeeDetails;

public class FunctionExample {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> biFunction = (x, y) -> {
			if (x > y || y < x) {
				return "x is Greater Value :: " + x;
			} else if (y > x || x < y) {
				return "y is Greater Value ::" + y;
			} else {
				return "Values Are Same";
			}
		};// BiFunction

		System.out.println(biFunction.apply(20, 30));

		EmployeeDetails empDetails1 = new EmployeeDetails("mk123", "madhu", "Hyderabad", 30000d);
		EmployeeDetails empDetails2 = new EmployeeDetails("kk143", "krishna", "Hyderabad", 40000d);
		EmployeeDetails empDetails3 = new EmployeeDetails("lksh163", "lokesh", "Pune", 50000d);
		EmployeeDetails empDetails4 = new EmployeeDetails("nsh123", "naresh", "Banglore", 60000d);

		List<EmployeeDetails> list = Arrays.asList(empDetails1,empDetails2,empDetails3,empDetails4);
		System.out.println("=====Employee Data=====");
		list.stream().filter(emp->emp.geteId().equals("mk123")).map(emp->emp).forEach(System.out::println);
	}//main
}//class