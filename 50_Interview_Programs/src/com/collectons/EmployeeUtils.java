package com.collectons;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeUtils {
	public static Map<String, List<Employee>> categorizeEmployeesByGender(List<Employee> employees) {
		return employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.toList()));
	}
	
	public static Map<String, List<Employee>> sortByMaleEmployeesToMap(Map<String, List<Employee>> employees){
		return employees.entrySet().stream().filter(k->k.getKey().equalsIgnoreCase("male")).collect(Collectors.toMap(emp->emp.getKey(), emp->emp.getValue()));
	}
	
	public static List<Employee> sortByMaleEmployeesToList(Map<String, List<Employee>> employees){
		return employees.values().stream().flatMap(Collection::stream).filter(emp->emp.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Alice", "Female", 55000.00);
		Employee emp2 = new Employee(102, "Bob", "Male", 60000.00);
		Employee emp3 = new Employee(103, "Charlie", "Male", 70000.00);
		Employee emp4 = new Employee(104, "Diana", "Female", 58000.00);
		Employee emp5 = new Employee(105, "Eve", "Female", 62000.00);
		Employee emp6 = new Employee(106, "Frank", "Male", 56000.00);
		Employee emp7 = new Employee(107, "Grace", "Female", 75000.00);
		Employee emp8 = new Employee(108, "Harry", "Male", 68000.00);
		Employee emp9 = new Employee(109, "Ivy", "Female", 59000.00);
		Employee emp10 = new Employee(110, "Jack", "Male", 64000.00);
		
		List<Employee> employees = List.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);
		
		Map<String,List<Employee>> employeesByGender = categorizeEmployeesByGender(employees);
		employeesByGender.forEach((k,v)->{
			System.out.println(k+"-"+v);
		});
		System.out.println("==================");
		Map<String,List<Employee>> sortByMaleEmployeesToMap = sortByMaleEmployeesToMap(employeesByGender);
		sortByMaleEmployeesToMap.forEach((k,v)->{
			System.out.println(k+"-"+v);
		});
		System.out.println("==================");
		List<Employee> sortByMaleEmployeesToList = sortByMaleEmployeesToList(sortByMaleEmployeesToMap);
		sortByMaleEmployeesToList.forEach(System.out::println);
	}// main
}
