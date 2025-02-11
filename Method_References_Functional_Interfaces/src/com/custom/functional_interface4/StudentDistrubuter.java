package com.custom.functional_interface4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class StudentDistrubuter {
	public static String generateStudentId() {
		Supplier<String> supplier = () -> {
			StringBuilder builder = new StringBuilder("student");
			Random random = new Random();
			int ran = random.nextInt(9);
			return builder.append(ran).toString();
		};
		return supplier.get();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Students Enrollments ");
		int count = scanner.nextInt();

		List<Student> list = new ArrayList<>();
		for (int i = 1; i <= count; i++) {
			String id = generateStudentId();
			System.out.print("Enter Student Name :: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Enter Student Grade :: ");
			char grade = scanner.next().charAt(0);
			Student student = new Student(id, name, grade);
			list.add(student);
		} // for
		list.forEach(System.out::println);
		scanner.close();
	}

}
