package com.io.files;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import com.collectons.Employee;

public class RedirectionalOutput {
	public static void main(String[] args) throws IOException {
		Employee employee = new Employee(2143, "Madhu Krishna", "Male", 30000);

		File file = new File("C:\\Users\\krishna\\Pictures\\PICS\\Employee.txt");
		PrintStream printStream = new PrintStream(file);

		System.setOut(printStream);
		System.out.println(employee);
		
		System.setIn(System.in);
		System.out.println("Back to Console");
		printStream.close();
	}
}