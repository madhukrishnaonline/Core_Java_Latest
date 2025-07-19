package com.arrays;

import org.openjdk.jol.info.GraphLayout;

public class SizeOfAnArrayInJVM {
	public static void main(String[] args) {
		int arr[] = { 9, 1, 0, 5, 10, 12, 2, 7 };
		System.out.println("Size Occupied by An Array in JVM");
		System.out.println(GraphLayout.parseInstance(arr).totalSize());
	}
}
