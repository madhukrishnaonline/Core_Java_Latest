package com.stream.parallel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		emps.add(new Employee(6, "Cathy", 43, "Female", "Sales", 2016, 10500.0));

		System.out.println("1. How many male and female employees are there in the organization?");
		Map<String, Long> map = emps.parallelStream().collect(Collectors.groupingBy(emp->emp.gender,Collectors.counting()));
		map.forEach((gender,count)->System.out.println(gender+"-"+count+" Thread :: "+Thread.currentThread()));
		
		System.out.println("===========================");
		emps.parallelStream().map(emp->emp.dept).distinct().forEach(count->System.out.println(count+" Thread ::"+Thread.currentThread()));
		
		System.out.println("=========Second Highest Salary=============");
		emps.stream().sorted(Comparator.comparing(Employee::getSal).reversed())
		           .skip(1).limit(1).forEach(System.out::println);
		
		System.out.println("===========================");
		Stream<Integer> stream = Stream.of(2,1,3,4,0,5,6);
		stream.parallel().map(numbers->numbers)
		      .forEach(number->System.out.println(number+" Thread :: "+Thread.currentThread()));
		
		
	}// main
}// class

//#Employee Class
class Employee {
	int eId;
	String eName;
	int age;
	String gender;
	String dept;
	int joinedDate;
	double sal;

	public Employee(int eId, String eName, int age, String gender, String dept, int joinedDate, double sal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.joinedDate = joinedDate;
		this.sal = sal;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(int joinedDate) {
		this.joinedDate = joinedDate;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", joinedDate=" + joinedDate + ", sal=" + sal + "]";
	}

}// class