package com.equals.operator.method;

import java.util.Objects;

public class DiffBtwEqualsOperatorAndMethod 
{
	public static void main(String[] args) 
	{
          Employee employee1 = new Employee("mk123","Madhu",23,30000.0);
          Employee employee2 = new Employee("mk123","Madhu",23,30000.0);
          
          System.out.println(employee1==employee2);
          System.out.println(employee1.equals(employee2));
	}// main
}// class

class Employee {
	private String eId;
	private String eName;
	private int age;
	private double sal;

	@Override
	public int hashCode() {
		return Objects.hash(age, eId, eName, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(eId, other.eId) && Objects.equals(eName, other.eName)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}

	public Employee(String eId, String eName, int age, double sal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.age = age;
		this.sal = sal;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}// class