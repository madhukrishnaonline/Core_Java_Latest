package com.ravishankar_84_stream.programs;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPrograms40 {
	private static final String RED = "\033[1;31m"; // RED
	private static final String RESET = "\033[0m"; // Text Reset

	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();
//		 1. Filter Employees by Gender:
//		 - Retrieve a list of all female employees.
		System.out.println(RED + "*****Retrieve a list of all female employees********" + RESET);
		List<Employee> femaleEmps = list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.toList());
		femaleEmps.forEach(System.out::println);

		System.out.println(RED + "*****Get a list of employees older than 30 years.********" + RESET);
//		2. Filter Employees by Age:
//			   - Get a list of employees older than 30 years.
		List<Employee> olderThan30Emps = list.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());
		olderThan30Emps.forEach(System.out::println);

		System.out.println(RED + "*****Find employees with a salary greater than $50,000.********" + RESET);
//		3. Filter Employees by Salary:
//		   - Find employees with a salary greater than $50,000.
		List<Employee> greater50ThousanSalaryEmps = list.stream().filter(emp -> emp.getSalary() > 50000)
				.collect(Collectors.toList());
		greater50ThousanSalaryEmps.forEach(System.out::println);

//		4. Map Employee Names:
//			   - Create a list of employee names (Strings).
		System.out.println(RED + "*************Create a list of employee names (Strings)*************" + RESET);
		List<String> empNames = list.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		empNames.forEach(System.out::println);

//		5. Calculate Average Salary:
//			   - Calculate the average salary of all employees.
		System.out.println(RED + "*********Calculate the average salary of all employees.*******" + RESET);
		Double averageSalaryOfEmps = list.stream().mapToDouble(Employee::getSalary).average().orElseThrow();
		System.out.println("Average Salary of Emps :: " + averageSalaryOfEmps);

//		6. Find Maximum Salary:
//		   - Find the employee with the highest salary.
		System.out.println(RED + "*********Find the employee with the highest salary.********" + RESET);
		Employee maxSalary = list.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElseThrow();
		System.out.println(maxSalary);

//		7.Group Employees by Gender:
//		   - Group employees by gender and return
//		   a map with gender as the key and a list of employees as the value.
		System.out.println(RED + "******Group employees by gender and return a map******" + RESET);
		Map<String, List<Employee>> groupByGender = list.stream().collect(Collectors.groupingBy(Employee::getGender));
		groupByGender.forEach((gender, listOfEmp) -> {
			System.out.println("[" + gender + "]");
			listOfEmp.forEach(System.out::println);
		});

//		8. Count Male Employees:
//			   - Count the number of male employees.
		System.out.println(RED + "**********Count the number of male employees.*********" + RESET);
		long countofMaleEmps = list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("male")).count();
		System.out.println(countofMaleEmps);

//		9. Sum of All Salaries:
//		   - Calculate the total sum of salaries for all employees.
		System.out.println(RED + "*********Calculate the total sum of salaries for all employees.**********" + RESET);
		double sumofEmps = list.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println(sumofEmps);

//		10. Sort Employees by Name:
//	    - Sort the employees by their names in alphabetical order.
		System.out.println(RED + "*******Sort the employees by their names in alphabetical order.*****" + RESET);
		List<Employee> alphaOrderOfEmps = list.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		alphaOrderOfEmps.forEach(System.out::println);

//		11. Sort Employees by Age:
//		    - Sort the employees by age in ascending order.
		System.out.println(RED + "**********Sort the employees by age in ascending order.********" + RESET);
		List<Employee> ageOrderEmps = list.stream().sorted(Comparator.comparingInt(Employee::getAge))
				.collect(Collectors.toList());
		ageOrderEmps.forEach(System.out::println);

//		12. Sort Employees by Salary:
//	    - Sort the employees by salary in descending order.
		System.out.println(RED + "*********Sort the employees by salary in descending order.******" + RESET);
		List<Employee> salaryOrderEmps = list.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		salaryOrderEmps.forEach(System.out::println);

//		13. Find Oldest Employee:
//	    - Find the oldest employee.
		System.out.println(RED + "*********Find the oldest employee.*********" + RESET);
		Employee oldestEmp = list.stream().max(Comparator.comparingInt(Employee::getAge)).orElseThrow();
		System.out.println(oldestEmp);

//		14. Group Employees by Age:
//	    - Group employees into age groups (e.g., 20-30, 31-40, etc.)
//	    and return a map with age group as the key and a list of employees as the value.
		System.out.println(RED + "****Group employees into age groups (e.g., 20-30, 31-40, etc.)*****" + RESET);
		Map<String, List<Employee>> empsByAgeGroup = list.stream().collect(Collectors.groupingBy((emp) -> {
			int age = emp.getAge();
			if (age >= 20 && age <= 30) {
				return "20-30";
			} else if (age >= 31 && age <= 40) {
				return "31-40";
			} else {
				return "40+";
			}
		}));
		empsByAgeGroup.forEach((group, emps) -> {
			System.out.println("[" + group + "]");
			emps.forEach(System.out::println);
		});

//		15. Find Employees with a Specific Age:
//	    - Find all employees who are exactly 35 years old.
		System.out.println(RED + "************ Find all employees who are exactly 35 years old.***********" + RESET);
		List<Employee> empsWithAge35 = list.stream().filter(emp -> emp.getAge() == 35).collect(Collectors.toList());
		empsWithAge35.forEach(System.out::println);

//		16. Calculate the Sum of Salaries by Gender:
//		    - Calculate the sum of salaries for each gender (i.e., male and female)
//		    and return a map with gender as the key and the sum of salaries as the value.
		System.out.println(RED + "********* Calculate the sum of salaries for each gender**********" + RESET);
		Map<String, Double> sumOfSalariesByGender = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.summingDouble(Employee::getSalary)));
		sumOfSalariesByGender.forEach((gender, sumSal) -> {
			System.out.println("[" + gender + "-" + sumSal + "]");
		});

//		17. Find Employees with Names Starting with "J":
//		    - Find all employees whose names start with the letter "E."
		System.out.println(RED + "*********Find all employees whose names start with the letter K******" + RESET);
		List<Employee> empsListStartsWithK = list.stream().filter(emp -> emp.getName().startsWith("K"))
				.collect(Collectors.toList());
		empsListStartsWithK.forEach(System.out::println);

//		18. Calculate the Average Salary for Male and Female Employees:
//	    - Calculate the average salary separately for male
//	    and female employees and return a map with gender
//	    		as the key and the average salary as the value.
		System.out.println(
				RED + "**********Calculate the average salary separately for male and female*********" + RESET);
		Map<String, Double> averageSalByGender = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		averageSalByGender.forEach((gender, avgSal) -> {
			System.out.println(gender + "-" + avgSal);
		});

//		19. Find the Top N Highest Paid Employees:
//	    - Find the top N employees with the highest salaries.
		System.out.println(RED + "*******Find the top N employees with the highest salaries.********" + RESET);
		List<Employee> topNHighestSalEmps = list.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(5)
				.collect(Collectors.toList());
		topNHighestSalEmps.forEach(System.out::println);

//		20. Retrieve Distinct Age Values:
//	    - Get a list of distinct ages of all employees.
		System.out.println(RED + "*********Get a list of distinct ages of all employees.*********" + RESET);
		List<Integer> distinctAges = list.stream()
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.counting())).entrySet().stream()
				.map(age -> age.getKey()).sorted().collect(Collectors.toList());
		distinctAges.forEach(System.out::println);
		System.out.println("========================");
		Set<Integer> set = new HashSet<>();

		List<Employee> empsDistinctAges = list.stream().filter(emp -> set.add(emp.getAge()))
				.collect(Collectors.toList());
		empsDistinctAges.forEach(System.out::println);

//		21. Find the Three Lowest-Paid Employees:
//		   - Find and display the names of the three employees with the lowest salaries.
		System.out.println(RED
				+ "*******Find and display the names of the three employees with the lowest salaries.********" + RESET);
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).limit(3).forEach(System.out::println);

//	22. Sort Employees by Name Length:
//	   - Sort employees by the length of their names (shortest to longest).
		System.out.println(
				RED + "***********Sort employees by the length of their names (shortest to longest).*******" + RESET);
		list.stream().sorted((e1, e2) -> e1.getName().length() - e2.getName().length()).forEach(System.out::println);
		System.out.println("========================");
		list.stream().sorted(Comparator.comparingInt(emp -> emp.getName().length())).forEach(System.out::println);

//	23. Group Employees by Age Range:
//	   - Group employees into custom
//	   age ranges (e.g., 20-29, 30-39, etc.) and
//	   return a map with the age range as the key and a list of employees as the value.
		System.out.println(
				RED + "*********Group employees into custom age ranges (e.g., 20-29, 30-39, etc.)*********" + RESET);
		list.stream().collect(Collectors.groupingBy(emp -> {
			int age = emp.getAge();
			if (age >= 20 && age <= 29) {
				return "20-29";
			} else if (age >= 30 && age <= 39) {
				return "30-39";
			} else {
				return "40+";
			}
		})).forEach((genderRange, empsList) -> {
			System.out.println("[" + genderRange + "]");
			empsList.forEach(System.out::println);
		});

//		24. Find the Average Salary of Employees Aged 30 or Younger:
//		   - Calculate the average salary of employees aged 30 or younger.

		System.out.println(RED + "********Calculate the average salary of employees aged 30 or younger.******" + RESET);
		double avgSalOfEmp30OrBelow = list.stream().filter(emp -> emp.getAge() <= 30).mapToDouble(Employee::getSalary)
				.average().orElseThrow();
		System.out.println(avgSalOfEmp30OrBelow);

//	25. Find the Names of Male Employees with Salaries Over $60,000:
//	   - Retrieve the names of male employees with salaries over $60,000.
		System.out.println(
				RED + "**********Retrieve the names of male employees with salaries over $53,000.***********" + RESET);
		list.stream().filter(emp -> emp.getSalary() >= 53000 && emp.getGender().equalsIgnoreCase("male"))
				.map(Employee::getName).forEach(System.out::println);

//		26. Find the Youngest Female Employee:
//			   - Find the youngest female employee.
		System.out.println(RED + "**********Find the youngest female employee.**********" + RESET);
		Employee youngGirlEmp = list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("female"))
				.min(Comparator.comparingInt(Employee::getAge)).orElseThrow();
		System.out.println(youngGirlEmp);

//		27. Retrieve the Names of Employees in Reverse Order:
//			   - Get a list of employee names in reverse order (from the last employee to the first).
		System.out.println(RED + "******Get a list of employee names in reverse order*******" + RESET);
		list.stream().sorted((e1, e2) -> e2.getName().compareTo(e1.getName())).forEach(System.out::println);

//		28. Find the Highest Salary Among Female Employees:
//		   - Find the highest salary among female employees.
		System.out.println(RED + "******Find the highest salary among female employees." + RESET);
		Employee maxSalaryFemaleEmp = list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("female"))
				.max(Comparator.comparingDouble(Employee::getSalary)).orElseThrow();
		System.out.println(maxSalaryFemaleEmp);

//		29. Group Employees by Age and Gender:
//		   - Group employees by both age and gender and return a multi-level map.
		System.out.println(
				RED + "********Group employees by both age and gender and return a multi-level map.*****" + RESET);
		Map<Integer, Map<String, List<Employee>>> groupByAgeAndGender = list.stream()
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.groupingBy(Employee::getGender)));
		groupByAgeAndGender.forEach((age, empGroupByGender) -> {
			empGroupByGender.forEach((gender, empsList) -> {
				System.out.println("[" + age + " " + gender + "]");
				empsList.forEach(System.out::println);
			});
		});

//		30. Find the Sum of Salaries for Employees with Names Starts With 'K':
//			   - Calculate the sum of salaries for employees whose names contain the substring "Smith."
		System.out.println(
				RED + "******* Calculate the sum of salaries for employees whose names contain the substring Smith***"
						+ RESET);
		double sumOfSalariesOfEmpWhichStartsWithK = list.stream().filter(emp -> emp.getName().startsWith("K"))
				.mapToDouble(Employee::getSalary).reduce((a, b) -> a + b).orElseThrow();
		System.out.println(sumOfSalariesOfEmpWhichStartsWithK);

//		31. Find the Names of Employees Aged 30-40 with Salaries Between $50,000 and $60,000:
//		   - Retrieve the names of employees aged 30-40 with salaries between $50,000 and $60,000.
		System.out.println(RED
				+ "******Retrieve the names of employees aged 30-40 with salaries between $55,000 and $60,000.*******"
				+ RESET);
		list.stream().filter(
				emp -> emp.getAge() >= 30 && emp.getAge() <= 40 && emp.getSalary() >= 55000 && emp.getSalary() <= 60000)
				.forEach(System.out::println);

//		32. Calculate the Total Number of Employees:
//		   - Determine the total count of employees.
		System.out.println(RED + "******** Determine the total count of employees.*******" + RESET);
		long count = list.stream().count();
		System.out.println(count);

//	33. Find the Most Common Age Among Employees:
//	   - Determine the age that is most common among the employees.
		System.out.println(RED + "******Determine the age that is most common among the employees.***" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).ifPresent(System.out::println);

//		34. Find the Median Salary:
//		   - Calculate the median salary of all employees.
		System.out.println(RED + "********Calculate the median salary of all employees.******" + RESET);
		List<Employee> list2 = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
				.collect(Collectors.toList());
		int size = list2.size();
		if (size % 2 == 0) {
			double salary1 = list2.get(size / 2 - 1).getSalary();
			double salary2 = list2.get(size / 2).getSalary();
			System.out.println((salary1 + salary2) / 2.0);
		} else {
			double salary = list2.get(size / 2).getSalary();
			System.out.println(salary);
		}

//		35. Group Employees by Age and Count:
//		   - Group employees by age and count the number of employees in each age group.
		System.out.println(RED + "*******Group employees by age and count******" + RESET);
		Map<Integer, Long> groupByAgeAndCount = list.stream()
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));
		groupByAgeAndCount.forEach((age, countOfEmps) -> {
			System.out.println(age + " - " + countOfEmps);
		});

//		36. Find the Employee with the Longest Name:
//			   - Find the employee with the longest name.
		System.out.println(RED + "********Find the employee with the longest name.****" + RESET);
		Employee longestName = list.stream().max(Comparator.comparingInt(emp -> emp.getName().length())).orElseThrow();
		System.out.println(longestName);

//		37. Calculate the Sum of Salaries for Each Age:
//		   - Calculate the sum of salaries for each distinct age in a map.
		System.out.println(
				RED + "***********Calculate the sum of salaries for each distinct age in a map*******" + RESET);
		Map<Integer, Double> sumOfSalariesGroupByAge = list.stream()
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.summingDouble(Employee::getSalary)));
		sumOfSalariesGroupByAge.forEach((age, sum) -> {
			System.out.println(age + "-" + sum);
		});

//		38. Sort Employees by Age, Then by Salary:
//		   - Sort employees first by age in ascending order, and then by salary in descending order.
		System.out.println(RED
				+ "**********Sort employees first by age in ascending order, and then by salary in descending order*******"
				+ RESET);
		list.stream()
				.sorted(Comparator.comparingInt(Employee::getAge)
						.thenComparing(Comparator.comparingDouble(Employee::getSalary)).reversed())
				.forEach(System.out::println);

//		39. Find Employees Whose Names Contain More Than One Word:
//		   - Retrieve employees whose names consist of more than one word.
		System.out
				.println(RED + "***********Retrieve employees whose names consist of more than one word.*****" + RESET);
		list.stream().filter(emp -> emp.getName().contains(" ")).forEach(System.out::println);
		System.out.println("------------------------------");
		list.stream().filter(emp -> emp.getName().split(" ").length > 1).forEach(System.out::println);

//	40. Find the Two Highest Paid Female Employees:
//	   - Find and display the names of the two highest-paid female employees.
		System.out.println(
				RED + "**********Find and display the names of the two highest-paid female employees.*****" + RESET);
		list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("female"))
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2)
				.forEach(System.out::println);
	}
}