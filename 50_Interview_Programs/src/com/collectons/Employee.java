package com.collectons;

public class Employee {
	private int eId;
	private String eName;
	private String gender;
	private double salary;

	public Employee(int eId, String eName, String gender, double salary) {
		this.eId = eId;
		this.eName = eName;
		this.gender = gender;
		this.salary = salary;
	}


	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", gender=" + gender + ", salary=" + salary + "]";
	}
}
