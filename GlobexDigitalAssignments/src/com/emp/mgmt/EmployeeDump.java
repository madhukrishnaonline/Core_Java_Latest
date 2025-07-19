package com.emp.mgmt;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDump {
	Employee employee1 = new Employee("TXP1", "Madhu", "Krishna", "madhukrishna@gmail.com","Male","YES", "NO", 35000, 4);
	Employee employee2 = new Employee("TXP2", "Rama", "Krishna", "ramakrishna@gmail.com","Male","NO", "YES", 35000, 3);
	Employee employee3 = new Employee("TXP3", "Raja", "Rao", "rajarao@gmail.com","Male","YES", "YES", 30000, 3);
	Employee employee4 = new Employee("TXP4", "Madhu", "Krishna", "madhukrishna@gmail.com","Male","NO", "YES", 25000, 2);
	Employee employee5 = new Employee("TXP5", "Madhu", "Latha", "madhulatha@gmail.com","FeMale","YES", "NO", 45000, 5);
	Employee employee6 = new Employee("TXP6", "Krishna", "Priya", "krishnapriya@gmail.com","FeMale","NO", "NO", 45000, 5);
	Employee employee7 = new Employee("TXP7", "Prasanna", "Lakshmi", "prasannalakshmi@gmail.com","FeMale","YES", "YES", 25000, 3);
	Employee employee8 = new Employee("TXP8", "Priya", "Darshini", "priyadarshini@gmail.com","FeMale","YES", "NO", 35000, 4);
	Employee employee9 = new Employee("TXP9", "Venkata", "Ramana", "venkataramana@gmail.com","Male","YES", "YES", 35000, 4);
	
	List<Employee> employees;
	public void addEmployees() {
		employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee7);
		employees.add(employee8);
		employees.add(employee9);
	}
	
	public List<Employee> getEmployees(){
		return employees;
	}
}