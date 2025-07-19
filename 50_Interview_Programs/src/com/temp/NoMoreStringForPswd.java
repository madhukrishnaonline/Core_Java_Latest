package com.temp;

import java.io.Console;

public class NoMoreStringForPswd {
	public static void main(String[] args) {
		Console console = System.console();

        if (console == null) {
            System.out.println("Console is not available. Use terminal to run this program.");
            return;
        }
        String username = console.readLine("Enter Username");
		char[] password = console.readPassword("Enter Password");
		
		System.out.println(username);
		System.out.println(password);
		
	}
}