package com.student.controller;

import java.util.Scanner;

import com.student.pojo.Student;
import com.student.repository.StudentRepositoryImpl;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			StudentController controller = new StudentController(
					new StudentServiceImpl(scanner, new StudentRepositoryImpl<>(Student::getId)));
			while (true) {
				try {
					System.out.println("1.Add Student\n2.Display All Students\n3.Remove Student\n4.Exit");
					System.out.println("Select the operation to perform");
					String option = scanner.nextLine();
					int operation = Integer.parseInt(option);

					switch (operation) {
					case 1:
						boolean isAdded = controller.service.addStudent();
						if (isAdded) {
							System.out.println("Student Data Added");
						} else {
							System.out.println("Student Data is Not Added");
						}
						break;
					case 2:
						controller.service.viewAllStudents().forEach(System.out::println);
						break;
					case 3:
						System.out.println("Enter the Student Id to remove");
						String input = scanner.nextLine();
						int id = Integer.parseInt(input);
						controller.service.removeStudent(id);
						System.out.println("Student Removed");
						break;
					case 4:
						System.exit(0);
						break;
					default:
						System.err.println("Invalid Operation");
					}// outer switch
				} // try
				catch (Exception e) {
					System.out.println(e.getMessage());
				} // catch
			} // outerLoop
		} // try-with-resource
	}
}