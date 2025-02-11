package com.naresh.list.mcqs;

import java.util.*;

public class ArrayDemo {
	public static void main(String args[]) {
		int array[] = new int[5];
		for (int i = 5; i > 0; i--)
			array[5 - i] = i;
		Arrays.fill(array, 1, 3, 8);
		for (int i = 0; i < 5; i++)
			System.out.print(array[i]);
	}
}
