package com.exce;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int int1 = Integer.parseInt(str);
		System.out.println(int1);
         try {
        	 System.out.print("Hello"+1/0);
         }//try
         catch(Exception e) {
        	 System.out.print("World");
         }//catch
	}

}
