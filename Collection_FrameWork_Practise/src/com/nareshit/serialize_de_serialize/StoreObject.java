package com.nareshit.serialize_de_serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreObject {
	public static void main(String[] args) throws IOException {
		ArrayList<Student> students = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Student student = new Student(scanner);

		System.out.println("Enter the Student Size of data to Enter");
		int size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
			try {
				Student studentData = student.getStudentObject();
				students.add(studentData);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		File file = new File("M:\\Student.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try (fileOutputStream; objectOutputStream; scanner) {
			objectOutputStream.writeObject(students);
			System.out.println("Object Stored in this :: " + file.getAbsolutePath() + " Location");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
