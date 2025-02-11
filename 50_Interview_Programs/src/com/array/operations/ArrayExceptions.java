package com.array.operations;

public class ArrayExceptions {
	public static void main(String[] args) {
		// ArrayStoreException
		/* Object[] stringArray = new String[5];
		 stringArray[1] = 76;
		 stringArray[2] = "Krishna";
		 Arrays.spliterator(stringArray).forEachRemaining(System.out::println);*/

		// NegativeArraySizeException
		/*int[] i = new int[-2];
		i[1] = 2;
		i[2] = 4;
		 for(int n:i)
		 {
		 	System.out.println(n);
		 }*/

		int[] a = new int[10];
		int[] b = new int[100];
		a = b;
		System.out.println(a.length+" "+b.length);

//		Arrays.copyOf(, 0);
	}// main
}// class