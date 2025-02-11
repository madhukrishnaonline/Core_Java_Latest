package com.io.redirect;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class OutputRedirection {

	public static void main(String[] args) throws FileNotFoundException {
           File file = new File("M:\\OutputRedirection.txt");
           
           PrintStream printStream = new PrintStream(file);
           
           System.setOut(printStream);
           
           System.out.println("Madhu Krishna's Laptop Details");
           System.getenv().forEach((k,v)->System.out.println(k+"--"+v));
         
           System.out.println("=====================");
           FileDescriptor fileDescriptor = new FileDescriptor();
           FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
           PrintStream printStream2 = new PrintStream(fileOutputStream);
           System.setOut(printStream2);
           System.out.println("Completed");
	}//main
}//class