package com.nareshit.employee_directory;

public class Employee {
	private String name;
	private String position;
	private Double salary;

	public Employee() {
	}

	public Employee(String name, String position, Double salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getPosition() {
		return position;
	}

	protected void setPosition(String position) {
		this.position = position;
	}

	protected Double getSalary() {
		return salary;
	}

	protected void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}

}
