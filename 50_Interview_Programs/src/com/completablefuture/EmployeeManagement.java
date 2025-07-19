package com.completablefuture;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class EmployeeManagement {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Employee> employees = EmployeeDump.getEmployees();
		System.out.println("===============1.Print all employees data===============");
		CompletableFuture.runAsync(() -> employees.forEach(System.out::println)).get();

		System.out.println("===============2.Sort the employees in ascending order based on name===============");
		CompletableFuture.supplyAsync(() ->employees.stream().sorted(Comparator.comparing(emp -> emp.getFirstName())))
		.thenAccept(emps->emps.forEach(System.out::println)).get();

		System.out.println("===============3. print all the data in reverse order based on name===============");
		CompletableFuture.supplyAsync(() ->employees.stream().sorted((e1,e2)->e2.getFirstName().compareTo(e1.getFirstName())))
		.thenAccept(emps->emps.forEach(System.out::println)).get();
		
		System.out.println("===============4. find the employee who earns more salary(highest)===============");
		Employee employee = CompletableFuture.supplyAsync(()->Collections.max(employees,Comparator.comparingDouble(Employee::getSalary))).get();
		System.out.println(employee);
		
		System.out.println("===============4.1 find the employees who earns more salary(highest) in ascending order by name===============");
		CompletableFuture.supplyAsync(()->employees.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet())
		.thenApply(entries->entries.stream().max(Map.Entry.comparingByKey()).map(Map.Entry::getValue).orElse(Collections.emptyList()))
		.thenApply(emps->emps.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors.toList()))
		.thenAccept(emps->emps.forEach(System.out::println)).get();
		
		System.out.println("===============5 print only female employees in ascending order by name===============");
		CompletableFuture.supplyAsync(()->employees.stream().filter(emp->emp.getGender().equalsIgnoreCase("Female")).collect(Collectors.toList()))
		.thenApply(emps->emps.stream().sorted(Comparator.comparing(Employee::getFirstName)))
		.thenAccept(emps->emps.forEach(System.out::println)).get();
		
        System.out.println("===============6.find the female employee with highest salary===============");		
		Employee employee2 = CompletableFuture.supplyAsync(()->employees.stream().filter(emp->emp.getGender().equalsIgnoreCase("Female")).collect(Collectors.toList()))
		.thenApply(emps->emps.stream().max(Comparator.comparingDouble(Employee::getSalary)).get()).get();
		System.out.println(employee2);
		
		System.out.println("===============7.find the male employees with lowest salary===============");
		CompletableFuture.supplyAsync(()->employees.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet())
		.thenApply(entries->entries.stream().min(Map.Entry.comparingByKey()).map(Map.Entry::getValue).orElse(Collections.emptyList()))
		.thenAccept(emps->emps.forEach(System.out::println)).get();
		
		System.out.println("===============8.find the employees who are out of India===============");
		CompletableFuture.supplyAsync(()->employees.stream().filter(emp->!emp.getCountry().equalsIgnoreCase("india")).collect(Collectors.toList()))
		.thenAccept(emps->emps.forEach(System.out::println)).get();
		
	    System.out.println("===============11.Find the second highest salary of an employee===============");
	    Employee employee3 = CompletableFuture.supplyAsync(()->employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get())
	    .thenApply(maxSalEmp->employees.stream().filter(emp->emp.getSalary()!=maxSalEmp.getSalary()).max(Comparator.comparingDouble(Employee::getSalary)).get()).get();
	    System.out.println(employee3);
	    
	}
}
/*1.Print all employees data
2.Sort the employees in ascending order based on name
3.print all the data in reverse order based on name
4.find the employee who earns more salary(highest)
4.1 find the employees who earns more salary(highest) in ascending Order by first name
5.print only female employees
6.find the female employee with highest salary
7.find the male employee with lowest salary
8.find the employees who are out of India
9.find the employees who are from Hyderabad
10.find the male employees who are from Andhra Pradesh
11. Find the second highest salary of an employee*/