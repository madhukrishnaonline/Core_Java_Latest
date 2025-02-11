package com.io.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the File Path");
		String source = scanner.nextLine();
		FileReader fileReader = new FileReader(source);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while((line=bufferedReader.readLine())!=null) {
			System.out.println(line);
		}
		/*bufferedReader.lines().forEach(line->{
			System.out.println(line);			
		});*/
		
		bufferedReader.close();
		fileReader.close();
		scanner.close();
	}// main
}// class