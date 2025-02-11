package com.arrays;

public class CopyArrayToAnother {
	public static Integer[] copyof(Integer[] sourceArr) {
		Integer[] destArr = new Integer[sourceArr.length];
		
		for (int i = 0; i < sourceArr.length; i++) {
           destArr[i] = sourceArr[i];
		} // for
		return destArr;
	}

	public static void main(String[] args) {
		Integer[] arr = copyof(new Integer[] { 2, 3, 4, 5, 6 });
		for (Integer a : arr) {
			System.out.println(a);
		}
	}// main
}
