package com.ravishankar_84_stream.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class StreamsPrograms40 {
	private static final String RED = "\033[1;31m"; // RED
	private static final String RESET = "\033[0m"; // Text Reset

	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();

//		41. Find the Employee with the Highest Salary in Each Gender:
//		   - Find the employee with the highest salary for each gender (male and female).
		System.out.println(RED
				+ "******Find the employee with the highest salary for each gender (male and female).*****" + RESET);
		Map<String, Optional<Employee>> highestSalByGender = list.stream().collect(Collectors
				.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		highestSalByGender.forEach((gender, highestSalEmp) -> {
			System.out.println("[" + gender + "]");
			highestSalEmp.ifPresent(System.out::println);
		});
		/*System.out.println("------------------------------");
		Map<String, Employee> highestSalByGender2 = list.stream().collect(Collectors.toMap(Employee::getGender,k->k,(e1,e2)->e1.getSalary()==e2.getSalary()?e1:e2));
		highestSalByGender2.forEach((gender, highestSalEmp) -> {
			System.out.println("[" + gender + "]");
			System.out.println(highestSalEmp);
		});*/

//	42. Retrieve Employees with Unique Names:
//		   - Find employees with unique names (no duplicate names in the list).
		System.out
				.println(RED + "*******Find employees with unique names (no duplicate names in the list).****" + RESET);
		Set<String> set = new HashSet<>();
		list.stream().filter(emp -> set.add(emp.getName())).forEach(System.out::println);

//	43. Find the Names of Employees in Uppercase:
//	   - Get a list of employee names in uppercase.
		System.out.println(RED + "*******Get a list of employee names in uppercase.*****" + RESET);
		list.stream().filter(emp -> emp.getName().equals(emp.getName().toUpperCase())).forEach(System.out::println);

//	44. Calculate the Salary Range (Min-Max) for Each Age Group:
//		   - Calculate the salary range (minimum and maximum) for each distinct age group.
		System.out.println(RED
				+ "******Calculate the salary range (minimum and maximum) for each distinct age group.****" + RESET);
		Map<Integer, Map<String, Double>> minMaxSalByEachAgeGroup = list.stream().collect(
				Collectors.groupingBy(Employee::getAge, Collectors.collectingAndThen(Collectors.toList(), empsList -> {
					double maxSal = empsList.stream().mapToDouble(Employee::getSalary).max().orElseThrow();
					double minSal = empsList.stream().mapToDouble(Employee::getSalary).min().orElseThrow();
					Map<String, Double> map = new HashMap<>();
					map.put("max", maxSal);
					map.put("min", minSal);
					return map;
				})));
		minMaxSalByEachAgeGroup.forEach((age, minMaxSal) -> {
			System.out.println("AGE :: " + age);
			minMaxSal.forEach((range, sal) -> {
				System.out.println("[" + range + "-" + sal + "]");
			});
		});

//	45. Filter Employees by First Name Initial:
//	   - Retrieve employees whose first name starts with a specific initial (e.g., 'A').
		System.out.println(
				RED + "********Retrieve employees whose first name starts with a specific initial (e.g., 'E').******"
						+ RESET);
		list.stream().filter(emp -> emp.getName().startsWith("M")).forEach(System.out::println);

//		46. Group Employees by Age and List Only Unique Salaries:
//		   - Group employees by age and display a list of unique salaries for each age group.
		System.out.println(
				RED + "********Group employees by age and display a list of unique salaries for each age group.*****"
						+ RESET);
		Map<Integer, Set<Double>> map = list.stream().collect(
				Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getSalary, Collectors.toSet())));
		map.forEach((k, v) -> System.out.println(k + "-" + v));

		/*System.out.println("----------------------------");
		Set<Double> salarySet = new HashSet<>();
		Map<Integer, List<Employee>> uniqueSalariesByAgeGroup = list.stream().collect(Collectors.groupingBy(
				Employee::getAge, Collectors.filtering(emp -> salarySet.add(emp.getSalary()), Collectors.toList())));
		uniqueSalariesByAgeGroup.forEach((age, emps) -> {
			System.out.println(age);
			emps.forEach(System.out::println);
		});*/

		System.out.println("----------------------------");
		Map<Integer, ArrayList<Employee>> uniqueSalByAgeGroup = list.stream().collect(Collectors.groupingBy(
				Employee::getAge,
				Collectors.collectingAndThen(Collectors.toMap(Employee::getSalary, emp -> emp,
						(existing, replacement) -> existing, LinkedHashMap::new),
						map1 -> new ArrayList<>(map1.values()))));

		uniqueSalByAgeGroup.forEach((age, uniqueSalEmps) -> {
			System.out.println("AGE :: " + age);
			uniqueSalEmps.forEach(emp -> {
				System.out.println(emp);
			});
		});

//		47. Find Employees with the Same Salary:
//			   - Identify and display employees who have the same salary.
		System.out.println(RED + "*****Identify and display employees who have the same salary.****" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream()
				.filter(empSet -> empSet.getValue().size() > 1).flatMap(empSet -> empSet.getValue().stream())
				.forEach(System.out::println);

//		48. Find the Employee with the Shortest Name Among Male Employees:
//		   - Find the male employee with the shortest name.
		System.out.println(RED + "******Find the male employee with the shortest name.******" + RESET);
		Employee shortNameOfMaleEmp = list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("male"))
				.min(Comparator.comparingInt((Employee emp) -> emp.getName().length())
						.thenComparing(Comparator.comparing(Employee::getName)))
				.orElseThrow();
		System.out.println(shortNameOfMaleEmp);

//		49. Find the Most Common Salary Value:
//			   - Determine the salary value that appears most frequently among the employees.
		System.out.println(
				RED + "************Determine the salary value that appears most frequently among the employees.********"
						+ RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting())).entrySet().stream()
				.max(Comparator.comparingLong(set1 -> set1.getValue()))
				.ifPresent(entry -> System.out.println(entry.getKey()));

//		50. Find the Oldest Employee with the Lowest Salary:
//		   - Find the oldest employee with the lowest salary.
		System.out.println(RED + "*******Find the oldest employee with the lowest salary.******" + RESET);
		list.stream()
				.filter(emp -> emp.getAge() == list.stream().max(Comparator.comparingInt(Employee::getAge))
						.orElseThrow().getAge())
				.min(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);

//		51. Filter Employees by Gender:
//		   - Retrieve a list of all female employees.
		System.out.println(RED + "****** Retrieve a list of all female employees.****" + RESET);
		list.stream().filter(k -> k.getGender().equals("Female")).forEach(System.out::println);

//		52. Filter Employees by Age:
//		   - Get a list of employees older than 30 years.
		System.out.println(RED + "*************Get a list of employees older than 30 years.********" + RESET);
		list.stream().filter(k -> k.getAge() > 30).forEach(System.out::println);

//		53. Filter Employees by Salary:
//		   - Find employees with a salary greater than $50,000.
		System.out.println(RED + "******Find employees with a salary greater than $50,000.******" + RESET);
		list.stream().filter(k -> k.getSalary() > 50000).forEach(System.out::println);

//		54. Map Employee Names:
//		   - Create a list of employee names (Strings).
		System.out.println(RED + "******Create a list of employee names (Strings).******" + RESET);
		list.stream().map(k -> k.getName()).toList().forEach(System.out::println);

//		55. Calculate Average Salary:
//		   - Calculate the average salary of all employees.
		System.out.println(RED + "*********Calculate the average salary of all employees.****" + RESET);
		Double collect3 = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(collect3);

//		56. Find Maximum Salary:
//		   - Find the employee with the highest salary.
		System.out.println(RED + "********Find the employee with the highest salary.********" + RESET);
		Employee employee7 = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
				.get();
		System.out.println(employee7);

//		57. Group Employees by Gender:
//		   - Group employees by gender
//		   and return a map with gender as the key and a list of employees as the value.
		System.out.println(RED + "*********return a map with gender as the key and a list of employees*****" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getGender))
				.forEach((k, v) -> System.out.println(k + " - " + v));

//		58. Count Male Employees:
//		   - Count the number of male an female employees.
		System.out.println(RED + "****Count the number of male and female employees.*****" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + " - " + v));

//	59. Sum of All Salaries:
//	   - Calculate the total sum of salaries for all employees.
		System.out.println(RED + "******Calculate the total sum of salaries for all employees.*****" + RESET);
		Double collect4 = list.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println(collect4);

//60. Sort Employees by Name:
//- Sort the employees by their names in alphabetical order.
		System.out.println(RED + "****** Sort the employees by their names in alphabetical order.******" + RESET);
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

//		61. Find the Employee with the Highest Salary in Each Gender:
//		   - Find the employee with the highest salary for each gender (male and female).
		System.out.println(RED
				+ "*******Find the employee with the highest salary for each gender (male and female).*****" + RESET);
		Map<String, Optional<Employee>> highSalByGroup = list.stream().collect(Collectors
				.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		highSalByGroup.forEach((gender, emp) -> {
			System.out.println(gender);
			emp.ifPresent(System.out::println);
		});

//		62. Retrieve Employees with Unique Names:
//		   - Find employees with unique names (no duplicate names in the list).
		System.out.println(
				RED + "*******Find employees with unique names (no duplicate names in the list).******" + RESET);
		Set<String> set2 = new HashSet<>();
		list.stream().filter(emp -> set2.add(emp.getName().toLowerCase())).forEach(System.out::println);

//	63. Find the Names of Employees in Uppercase:
//	   - Get a list of employee names in uppercase.
		System.out.println(RED + "******Get a list of employee names in uppercase.******" + RESET);
		list.stream().filter(emp -> emp.getName().equals(emp.getName().toUpperCase())).forEach(System.out::println);

//		64. Calculate the Salary Range (Min-Max) for Each Age Group:
//		   - Calculate the salary range (minimum and maximum) for each distinct age group.
		System.out.println(RED
				+ "*******Calculate the salary range (minimum and maximum) for each distinct age group.******" + RESET);
		list.stream().collect(
				Collectors.groupingBy(Employee::getAge, Collectors.collectingAndThen(Collectors.toList(), emps -> {
					double minSal = emps.stream().mapToDouble(Employee::getSalary).min().orElseThrow();
					double maxSal = emps.stream().mapToDouble(Employee::getSalary).max().orElseThrow();
					Map<String, Double> hash = new HashMap<>();
					hash.put("minSal", minSal);
					hash.put("maxSal", maxSal);
					return hash;
				}))).forEach((age, minMaxSal) -> {
					System.out.println(age);
					minMaxSal.forEach((salType, sal) -> {
						System.out.println(salType + "-" + sal);
					});
				});

//		65. Filter Employees by First Name Initial:
//		   - Retrieve employees whose first name starts with a specific initial (e.g., 'E').
		System.out.println(
				RED + "**********Retrieve employees whose first name starts with a specific initial *******" + RESET);
		list.stream().filter(k -> k.getName().startsWith("E")).forEach(System.out::println);

//	66. Group Employees by Age and List Only Unique Salaries:
//		   - Group employees by age and display a list of unique salaries for each age group.
		System.out.println(
				RED + "*******Group employees by age and display a list of unique salaries for each age group.******"
						+ RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getAge,
				Collectors.collectingAndThen(Collectors.toMap(Employee::getSalary, emp -> emp,
						(existing, replacement) -> existing, LinkedHashMap::new),
						map2 -> new ArrayList<>(map2.values()))))
				.forEach((age, empsList) -> {
					System.out.println(age);
					empsList.forEach(System.out::println);
				});

//		67. Find Employees with the Same Salary:
//		   - Identify and display employees who have the same salary.
		System.out.println(RED + "********Identify and display employees who have the same salary.****" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream()
				.filter(empSet -> empSet.getValue().size() > 1).flatMap(emps -> emps.getValue().stream())
				.forEach(System.out::println);

//		68. Find the Employee with the Shortest Name Among Male Employees:
//		   - Find the male employee with the shortest name.
		System.out.println(RED + "********Find the male employee with the shortest name.*****" + RESET);
		Employee minLengthNameEmp = list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("male"))
				.min(Comparator.comparingInt(emp -> emp.getName().length())).orElseThrow();
		System.out.println(minLengthNameEmp);

//		69. Find the Most Common Salary Value:
//		   - Determine the salary value that appears most frequently among the employees.
		System.out.println(
				RED + "*******Determine the salary value that appears most frequently among the employees.********"
						+ RESET);
		Double mostCommonSalary = list.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream()
				.max(Comparator.comparingInt(empSet -> empSet.getValue().size())).orElseThrow().getKey();
		System.out.println(mostCommonSalary);

//		70. Find the Oldest Employee with the Lowest Salary:
//		   - Find the oldest employee with the lowest salary.
		System.out.println(RED + "*******Find the oldest employee with the lowest salary.*****" + RESET);
		Employee oldestEmpMinSal = list.stream()
				.filter(emp -> emp.getAge() == list.stream().mapToInt(Employee::getAge).max().orElseThrow())
				.min(Comparator.comparingDouble(Employee::getSalary)).orElseThrow();
		System.out.println(oldestEmpMinSal);

//		71. Find the Most Common Age Among Employees:
//		   - Determine the age that is most common among the employees.
		System.out.println(RED + "*******Determine the age that is most common among the employees.*****" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getAge, LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(ageSet -> ageSet.getKey())
				.ifPresent(System.out::println);

//		72. Find the Employee with the Longest Name:
//		   - Find the employee with the longest name.
		System.out.println(RED + "******Find the employee with the longest name.****" + RESET);
		list.stream().max(Comparator.comparingInt(emp -> emp.getName().length())).ifPresent(System.out::println);

//		73. Find Employees with Palindromic Names:
//		   - Retrieve employees whose names are palindromes (e.g., "Anna" or "Bob").
		System.out.println(RED + "******Retrieve employees whose names are palindromes*****" + RESET);
//        IntStream.range(0, list.stream().mapToInt(emp->emp.getName().length())).allMatch(start->)
		list.stream().filter(emp -> {
			String name = emp.getName().toLowerCase();
			StringBuilder sb = new StringBuilder(name);
			return name.contentEquals(sb.reverse());
		}).forEach(System.out::println);

//		74. Calculate the Sum of Salaries for Employees with Odd Ages:
//		   - Calculate the sum of salaries for employees with odd ages.
		System.out.println(RED + "*********the sum of salaries for employees with odd ages.******" + RESET);
		Double sumSalOfOddAgeEmps = list.stream().filter(emp -> emp.getAge() % 2 != 0)
				.collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println(sumSalOfOddAgeEmps);

//		75. Find the Employee with the Highest Salary Whose Name Contains "Lakshmi":
//		   - Find the employee with the highest salary whose name contains the word "Lakshmi."
		System.out.println(
				RED + "******Find the employee with the highest salary whose name contains the word \"Lakshmi.\"*******"
						+ RESET);
		list.stream().filter(emp -> emp.getName().toLowerCase().contains("lakshmi"))
				.max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);

//		76. Group Employees by the First Letter of Their Names:
//		   - Group employees by the first letter 
//		   of their names and return a map with
//				   the letter as the key and a list of employees as the value.
		System.out.println(RED + "*****Group employees by the first letter of their names****" + RESET);
		Map<Character, List<Employee>> empsByChar = list.stream()
				.collect(Collectors.groupingBy(emp -> emp.getName().charAt(0)));
		empsByChar.forEach((ch, emps) -> {
			System.out.println("[" + ch + "]");
			emps.forEach(System.out::println);
		});

//		77. Find the Employee with the Shortest Name:
//			   - Find the employee with the shortest name.
		System.out.println(RED + "*******Find the employee with the shortest name.*****" + RESET);
		list.stream().min(Comparator.comparingInt(emp -> emp.getName().length())).ifPresent(System.out::println);

//		78. Calculate the Average Salary of Employees Whose Names Start with "E":
//		   - Calculate the average salary of employees whose names start with the letter "E."
		System.out.println(RED
				+ "******Calculate the average salary of employees whose names start with the letter \"K.\"" + RESET);
		Double avgSal = list.stream().filter(emp -> emp.getName().startsWith("K"))
				.collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avgSal);

//		79. Filter Employees by Age Range:
//		   - Filter employees 
//		   based on a custom age range (e.g., between 25 and 35 years old).
		System.out.println(RED + "*******based on a custom age range (e.g., between 25 and 30 years old)*****" + RESET);
		list.stream().filter(emp -> emp.getAge() >= 25 && emp.getAge() <= 30)
				.sorted(Comparator.comparingDouble(Employee::getAge)).forEach(System.out::println);

//		80. Group Employees by the First Two Letters of Their Names:
//		   - Group employees by the first two letters 
//		   of their names and 
//		   return a map with the letters as the key and a list of employees as the value.
		System.out.println(RED + "*****Group employees by the first two letters*****" + RESET);
		list.stream()
				.collect(Collectors.groupingBy(emp -> emp.getName().toLowerCase().substring(0, 2),
						Collectors.collectingAndThen(Collectors.toList(), LinkedHashSet::new)))
				.forEach((chars, empsList) -> {
					System.out.println("[" + chars + "]");
					empsList.forEach(System.out::println);
				});

//		81. Find the Employee with the Longest Name Whose Salary Is Below $53,000:
//		   - Find the employee with the longest name whose salary is below $53,000.
		System.out.println(
				RED + "*******Find the employee with the longest name whose salary is below $53,000.**" + RESET);
		list.stream().filter(emp -> emp.getSalary() < 53000).max(Comparator.comparingInt(emp -> emp.getName().length()))
				.ifPresent(System.out::println);

//		82. Calculate the Average Salary of Employees Whose Names End with "son":
//		   - Calculate the average salary of employees whose names end with the suffix "son."
		System.out.println(RED
				+ "*******Calculate the average salary of employees whose names end with the suffix \"i.\"" + RESET);
		Double avgSalWhoseNameEndsWithI = list.stream().filter(emp -> emp.getName().endsWith("i"))
				.collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avgSalWhoseNameEndsWithI);

//		83. Group employees by the number of 
//		words in their names (e.g., one-word names, two-word names, etc.) 
//		and return a map with the count as the key and a list of employees as the value.
		System.out.println(RED + "********Group employees by the number of words in their names**********" + RESET);
		list.stream().collect(Collectors.groupingBy(emp -> new StringTokenizer(emp.getName(), " ").countTokens()))
				.forEach((count, empsList) -> {
					System.out.println(count);
					empsList.forEach(System.out::println);
				});

//		84. Calculate the Average Salary of Employees Whose Names Contain Both "A" and "E":
//		   - Calculate the average salary of employees whose names contain both the letters "A" and "E."
		System.out.println(RED
				+ "********the average salary of employees whose names contain both the letters \"A\" and \"E.\"**********"
				+ RESET);
		Double avgSalWhosNameContains = list.stream()
				.filter(emp -> emp.getName().toLowerCase().contains("a") && emp.getName().toLowerCase().contains("e"))
				.collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avgSalWhosNameContains);
	}
}