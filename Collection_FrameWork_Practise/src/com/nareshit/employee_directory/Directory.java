package com.nareshit.employee_directory;

import java.util.List;

public class Directory {
	private List<Employee> list;

	public Directory(List<Employee> list) {
		this.list = list;
	}

	public Employee addEmployee(Employee employee) {
		return new Employee(employee.getName(), employee.getPosition(), employee.getSalary());
	}

	public List<Employee> displayAllEmployees() {
		return list;
	}

	public Employee updateEmployee(int index, String position, Double salary) {
		if (index < 0 || index > list.size()) {
			System.err.println("Invalid Index");
		}
		Employee employee = list.get(index);
		employee.setPosition(position);
		employee.setSalary(salary);

		return employee;
	}

	public Employee removeEmployee(int index) {
		if (index < 0 || index > list.size()) {
			System.err.println("Invalid Index");
		}
		return list.remove(index);
	}

}
