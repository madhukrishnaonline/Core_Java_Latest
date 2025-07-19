package com.completablefuture;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDump {
	Employee employee1 = new Employee("TXP1", "Madhu", "Krishna",35000,Designation.DESIGNER, "madhukrishna@gmail.com", "Male","Kurnool","AP","India");
	Employee employee2 = new Employee("TXP2", "Rama", "Krishna",35000,Designation.ENGINEER, "ramakrishna@gmail.com", "Male","Hyderabad","TG","India");
	Employee employee3 = new Employee("TXP3", "Raja", "Rao",30000,Designation.ARCHITECT, "rajarao@gmail.com", "Male","Bengalore","KA","India" );
	Employee employee4 = new Employee("TXP4", "Madhu", "Krishna",45000,Designation.DEVELOPER, "madhukrishna@gmail.com", "Male","Austin","Texas","USA" );
	Employee employee5 = new Employee("TXP5", "Madhu", "Latha",45000,Designation.CLOUD_COMPUTING, "madhulatha@gmail.com", "FeMale","Columbus","Ohio","USA" );
	Employee employee6 = new Employee("TXP6", "Krishna", "Priya",45000,Designation.TESTER, "krishnapriya@gmail.com", "FeMale","Chennai","TN","India" );
	Employee employee7 = new Employee("TXP7", "Prasanna", "Lakshmi",25000,Designation.ENGINEER, "prasannalakshmi@gmail.com", "FeMale","Kurnool","AP","India" );
	Employee employee8 = new Employee("TXP8", "Priya", "Darshini",35000,Designation.DEVELOPER, "priyadarshini@gmail.com", "FeMale","Sydney","Sydney","Australia" );
	Employee employee9 = new Employee("TXP9", "Venkata", "Ramana",38000,Designation.ARCHITECT, "venkataramana@gmail.com", "Male","Kochi", "Kerala", "India");
	Employee employee10 = new Employee("TXP10", "Sri", "Hari",39000,Designation.DEVELOPER, "srihari@gmail.com", "Male","Hyderabad", "TG", "India");
	Employee employee11 = new Employee("TXP11", "David", "Warner",25000,Designation.ENGINEER, "prasannalakshmi@gmail.com", "Male","Paddington","Sydney","Australia" );

	private static List<Employee> employees;

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
		employees.add(employee10);
		employees.add(employee11);
	}

	public static List<Employee> getEmployees() {
		new EmployeeDump().addEmployees();
		return employees;
	}
}