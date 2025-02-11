package com.runtime;

import java.util.Date;

public class GarbageCollection {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());
		for (int i = 1; i <= 10000; i++) {
			Date date = new Date();
			date = null;
		} // for
		System.out.println(runtime.freeMemory());
		runtime.gc();
		
		System.out.println(runtime.freeMemory());
	}// main
}
