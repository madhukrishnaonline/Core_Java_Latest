package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Temp {
	int x = 10;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Temp temp = new Temp();

		ArrayList list = new ArrayList();
		list.add("m");
		list.add(36);
		String str = (String) list.get(0);
		System.out.println(str.toUpperCase());
		scanner.close();
	}// main
}// class