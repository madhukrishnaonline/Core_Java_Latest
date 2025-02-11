package com.streams;

import java.util.List;

record Employee(Integer id, String name, Double salary) {

}

public class GetEmpNamesFromListEmp {

	public static void main(String[] args) {
		List<Employee> listOfEmp = List.of(new Employee(333, "madhu", 35000.00), new Employee(111, "krishna", 55000.00),
				new Employee(000, "ajun", 39000.00));
		
		List<String> names = listOfEmp.stream().filter(emp->emp.salary()>50000.00).map(emp->emp.name()).toList();
		System.out.println(names);
	}

}
