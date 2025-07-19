package com.io.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputOutput {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the File Path ::");
		String filePath = scanner.nextLine();
		File file = new File(filePath);
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		File dest =new File("C:\\Users\\krishna\\Pictures\\PICS\\mk.jpg");
		FileOutputStream fileOutputStream = new FileOutputStream(dest);
		System.out.println("Writing Data..."+file.getName()+" To "+dest.getName());
		/*int i;
		while((i=fileInputStream.read())!=-1) {
			fileOutputStream.write(i);
		}*/
		//or
		byte[] bytes = fileInputStream.readAllBytes();
		fileOutputStream.write(bytes);
		System.out.println("Completed");
		fileInputStream.close();
		fileOutputStream.close();
		scanner.close();
	}//main
}// class