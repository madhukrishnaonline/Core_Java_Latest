package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class FindMaxMinNumbers {
	public static void sortAsc(Integer[] arr) {
		if (arr == null) {
			throw new IllegalArgumentException("Array Cannot be Null");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} // if
			} // inner
		} // outer
	}

	public static void sortDesc(Integer[] arr) {
		if (arr == null) {
			throw new IllegalArgumentException("Array Cannot be Null");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} // if
			} // inner
		} // outer
	}

	public static void reverseOrder(Integer[] arr) {
		if (arr == null) {
			throw new IllegalArgumentException("Array Cannot be Null");
		}
		int len = arr.length;
		int mid = len / 2;
		int rev = arr.length - 1;
		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[rev];
			arr[rev] = temp;
			rev--;
		}
	}

	public static int max(Integer[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} // if
		} // outer
		return max;
	}

	public static int secondMax(Integer[] arr) {
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements");
		}
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} // if
			else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		} // outer
		return secondMax;
	}

	public static List<Integer> findFirstLimitMaxNums(Integer[] arr, int limit) {
		if (arr == null || arr.length < limit) {
			throw new IllegalArgumentException("Array must contain at least "+limit+" elements");
		}
         TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
         for(Integer i:arr) {
        	 set.add(i);
        	 
        	 if(set.size()>limit) {
        		 set.pollLast();
        	 }//if
         }
         if (set.size() < limit) {
             throw new IllegalArgumentException("Array must contain at least five distinct elements");
         }
         
		return new ArrayList<Integer>(set);
	}
	public static List<Integer> findFirstLimitMinNums(Integer[] arr, int limit) {
		if (arr == null || arr.length < limit) {
			throw new IllegalArgumentException("Array must contain at least "+limit+" elements");
		}
		TreeSet<Integer> set = new TreeSet<>();
		for(Integer i:arr) {
			set.add(i);
			
			if(set.size()>limit) {
				set.pollLast();
			}//if
		}
		if (set.size() < limit) {
			throw new IllegalArgumentException("Array must contain at least five distinct elements");
		}
		
		return new ArrayList<Integer>(set);
	}

	public static int min(Integer[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} // if
		} // outer
		return min;
	}

	public static int secondMin(Integer[] arr) {
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements");
		}
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secondMin = min;
				min = arr[i];
			} // if
			else if (arr[i] < secondMin && arr[i] != min) {
				secondMin = arr[i];
			}
		} // outer
		return secondMin;
	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 4, 1, 3, 56, 8, 0 };

		/*sortAsc(arr);
		System.out.println("After Sorting Ascending");
		for (Integer a : arr) {
			System.out.print(a + " ");
		}*/

		/*sortDesc(arr);
		System.out.println("\nAfter Sorting Descending");
		for (Integer a : arr) {
			System.out.print(a + " ");
		}*/

		/*reverseOrder(arr);
		System.out.println("\nReverse Order");
		for (Integer a : arr) {
			System.out.print(a + " ");
		}*/

		System.out.println("Max Number :: " + max(arr));
		System.out.println("Second Max Number :: " + secondMax(arr));
		System.out.println("Min Number :: " + min(arr));
		System.out.println("Second Min Number :: " + secondMin(arr));
		System.out.println("First max Numbers");
		List<Integer> max = findFirstLimitMaxNums(arr,5);
		System.out.println(max);
		System.out.println("First min Numbers");
		List<Integer> min = findFirstLimitMinNums(arr,5);
		System.out.println(min);
	}// main
}
