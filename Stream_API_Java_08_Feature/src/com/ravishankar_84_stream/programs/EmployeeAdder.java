package com.ravishankar_84_stream.programs;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdder {
	public static List<Employee> addDetails() {
		List<Employee> list = new ArrayList<>();
		Employee employee0 = new Employee("Bob", 25, 45000.0, "Male");
		Employee employee1 = new Employee("Mohan ", 27, 50000.0, "Male");
		Employee employee2 = new Employee("Kalyani", 27, 51000.0, "Female");
		Employee employee3 = new Employee("Yashwanth", 27, 50000.0, "Male");
		Employee employee4 = new Employee("Ruhi Firdose", 28, 53000.0, "Female");
		Employee employee5 = new Employee("RAMANA", 29, 53000.0, "Male");
		Employee employee6 = new Employee("Sajidha", 30, 55000.0, "Female");
		Employee employee7 = new Employee("Rudraiah", 31, 56000.0, "Male");
		Employee employee8 = new Employee("LAKSHMI", 32, 57000.0, "Female");
		Employee employee9 = new Employee("Krishna", 35, 58000.0, "Male");
		Employee employee10 = new Employee("Mubeena", 35, 59000.0, "Female");
		Employee employee11 = new Employee("Lakshmi", 28, 49000.0, "Female");
		Employee employee12 = new Employee("Hymavathi", 29, 53000.0, "Female");
		Employee employee13 = new Employee("Gnana Deepika", 35, 55000.0, "Female");
		Employee employee14 = new Employee("Samyuktha", 33, 59500.0, "Female");
		Employee employee15 = new Employee("Manjula Venqckata Ramana", 25, 53000.0, "Male");

		list.add(employee0);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee7);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee11);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);
		list.add(employee12);
		list.add(employee13);
		list.add(employee14);
		list.add(employee15);
		return list;
	}
}