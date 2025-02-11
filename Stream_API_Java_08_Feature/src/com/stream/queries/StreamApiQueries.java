package com.stream.queries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiQueries {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		emps.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		emps.add(new Employee(12, "Nithin", 25, "Male ", "Development", 2016, 28200.0));
		emps.add(new Employee(13, "Swathi ", 27, "Female", "Finance", 2013, 21300.0));
		emps.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		emps.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		System.out.println("1. How many male and female employees are there in the organization?");
		Map<String, Long> map = emps.stream().collect(Collectors.groupingBy(emp -> emp.gender, Collectors.counting()));
		map.forEach((gender, count) -> System.out.println(gender + "-" + count));

		System.out.println("=========================");
		System.out.println("2. Print the name of all departments in the organization?");
		emps.stream().map(emp -> emp.dept).distinct().forEach(System.out::println);

		System.out.println("=========================");
		System.out.println("3. What is the average age of male and female employees?");
		Map<String, Double> map2 = emps.stream()
				.collect(Collectors.groupingBy(emp -> emp.gender, Collectors.averagingInt(emp -> emp.age)));
		map2.forEach((gender, age) -> System.out.println(gender + "-" + age));

		System.out.println("=========================");
		System.out.println("4. Get the details of highest paid employee in the organization ?");
		Optional<Employee> maxSal = emps.stream().collect(Collectors.maxBy(Comparator.comparingDouble(emp -> emp.sal)));
		if (maxSal.isPresent()) {
			System.out.println(maxSal.get());
		} // if
		
		System.out.println("=========================");
		System.out.println("5. Get the names of all employees who have joined after 2015?");
		emps.stream().filter(emp -> emp.joinedDate > 2015).map(emp -> emp.eName + "-" + emp.joinedDate)
				.forEach(System.out::println);
		System.out.println("=========================");
		System.out.println("6. Count the number of employees in each department?");
		Map<String, Long> map3 = emps.stream().collect(Collectors.groupingBy(emp -> emp.dept, Collectors.counting()));
		map3.forEach((dept, count) -> System.out.println(dept + "-" + count));
		System.out.println("=========================");
		System.out.println("7. What is the average salary of each department?");
		emps.stream().collect(Collectors.groupingBy(emp -> emp.dept, Collectors.averagingDouble(emp -> emp.sal)))
				.forEach((dept, sal) -> System.out.println(dept + "-" + sal));

		System.out.println("=========================");
		System.out.println("8. Get the details of youngest male employee in the product development department?");
		Optional<Employee> minAge = emps.stream().filter(emp -> emp.dept.equals("Development"))
				.collect(Collectors.minBy(Comparator.comparing(emp -> emp.age)));
		if (minAge.isPresent()) {
			System.out.println(minAge.get());
		} // if

		System.out.println("=========================");
		System.out.println("9. Who has the most working experience in the organization?");
		Optional<Employee> senior = emps.stream()
				.collect(Collectors.minBy(Comparator.comparing(emp -> emp.joinedDate)));
		if (senior.isPresent()) {
			System.out.println(senior.get());
		} // if

		System.out.println("=========================");
		System.out.println("10. How many male and female employees are there in the sales team?");
		emps.stream().filter(emp -> emp.dept.equalsIgnoreCase("sales"))
				.collect(Collectors.groupingBy(emp -> emp.gender, Collectors.counting()))
				.forEach((gender, count) -> System.out.println(gender + "-" + count));

		System.out.println("=========================");
		System.out.println("11. What is the average salary of male and female employees ?");
		Map<String, Double> avgSal = emps.parallelStream()
				.collect(Collectors.groupingBy(emp -> emp.gender, Collectors.averagingDouble(emp -> emp.sal)));
		avgSal.forEach(
				(gender, avg) -> System.out.println(gender + "-" + avg + " Thread :: " + Thread.currentThread()));

		System.out.println("=========================");
		System.out.println("12. List down the names of all employees in each department?");
		emps.parallelStream().collect(Collectors.groupingBy(emp->emp.dept)).entrySet().forEach(emp->{
			System.out.println("-----------------------------------------");
			System.out.println("Employees In "+emp.getKey() + " : ");
			System.out.println("-----------------------------------------");
			emp.getValue().forEach(name->System.out.println("Name :: "+name.eName));
		});

		System.out.println("=========================");
		System.out.println("13. What is the average salary and total salary of the whole organization ?");
        DoubleSummaryStatistics sal = emps.stream().collect(Collectors.summarizingDouble(Employee::getSal));
		System.out.println("Average Salary :: "+sal.getAverage()+"\nTotal Salary :: "+sal.getSum());
        
		System.out.println("=========================");
        System.out.println("14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?");
        emps.stream().collect(Collectors.partitioningBy(emp->emp.age>25)).entrySet().forEach(emp->{
        	System.out.println("-----------------------------------------");
        	if(emp.getKey())
        	{
        		System.out.println("Employees older than 25 years :");
        	}//if
        	else
        	{
        		System.out.println("Employees younger than or equal to 25 years :");
        	}//else
        	System.out.println("-----------------------------------------");
        	emp.getValue().forEach(name->System.out.println(name.eName+"-"+name.age));
        });
       
        System.out.println("=========================");
        System.out.println("15. Who is the oldest employee in the organization? "
        		                           + " What is his age and which department he belongs to ?");
        Optional<Employee> old = emps.stream().collect(Collectors.maxBy(Comparator.comparing(emp->emp.age)));
        if(old.isPresent())
        {
        	System.out.println("Name :: "+old.get().eName+"\nAge :: "+old.get().age+"\nDepartment :: "+old.get().dept);
        }//if
        
        System.out.println("=========================");
		System.out.println("16. Get the details of Second highest paid employee in the organization ?");
		Optional<Employee> findFirst = emps.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).skip(1).findFirst();
	    if(findFirst.isPresent())
	    {
	    	System.out.println(findFirst.get());
	    }//if
	    
	    System.out.println("=========================");
		System.out.println("16. Get the details of first two highest paid employees in the organization ?");
		emps.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).limit(2).forEach(System.out::println);
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