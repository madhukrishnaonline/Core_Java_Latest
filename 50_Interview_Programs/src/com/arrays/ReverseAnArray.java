package com.arrays;

public class ReverseAnArray {
	public static Integer[] reverseArray(Integer[] arr) {
		Integer[] reverse = new Integer[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--) {
			reverse[j] = arr[i];
			j++;
		} // for
		return reverse;
	}
	
	public static void reverseArr(Integer arr[]) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			 int temp = arr[start];
			 arr[start] = arr[end];
			 arr[end] = temp;
			 
			 start++;
			 end--;
		}//while
	}

	public static void main(String[] args) {
		Integer[] array = reverseArray(new Integer[] { 1, 2, 3, 4, 5, 6 });
		for(Integer a:array) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		reverseArr(array);
		for(int a:array) {
			System.out.print(a+" ");
		}
	}

}
