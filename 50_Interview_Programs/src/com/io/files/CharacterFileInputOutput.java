package com.io.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterFileInputOutput {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the File Path");
		String path = scanner.nextLine();
		File source = new File(path);
		FileReader fileReader = new FileReader(source);
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\krishna\\Pictures\\PICS\\Angular_Routes.txt");
		int i;
		while((i=fileReader.read())!=-1){
			//System.out.println((char)i);
			fileOutputStream.write((char)i);
		}//while
		System.out.println("Completed");
		fileOutputStream.close();
		fileReader.close();
		scanner.close();
	}// main
}