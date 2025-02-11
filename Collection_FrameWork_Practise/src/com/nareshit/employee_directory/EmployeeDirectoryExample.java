package com.nareshit.employee_directory;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		Employee alice = new Employee("Alice", "Analyst", 35000.0);
		Employee bob = new Employee("Bob", "Developer", 45000.0);

		List<Employee> list = new ArrayList<>();
		Directory directory = new Directory(list);

		list.add(directory.addEmployee(alice));
		list.add(directory.addEmployee(bob));
		
		System.out.println("=====All Employees=====");
		directory.displayAllEmployees().forEach(System.out::println);
		
		Employee updateEmployee = directory.updateEmployee(1,"Sr. Developer", 60000.00);
		System.out.println("=====Updated Employee=====\n"+updateEmployee);
		
		Employee removeEmployee = directory.removeEmployee(0);
		System.out.println("=====Removed Employee=====\n"+removeEmployee);
		
		System.out.println("=====All Employees=====");
		directory.displayAllEmployees().forEach(System.out::println);
		
	}

}
