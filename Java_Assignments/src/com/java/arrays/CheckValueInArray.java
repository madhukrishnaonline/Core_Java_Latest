package com.java.arrays;

public class CheckValueInArray {
	private static void check(int[] arr, int toCheckValue)
    {
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }//if
        }//for
        System.out.println("Is " + toCheckValue+ " present in the array: " + test);
    }
	public static void main(String[] args) {
		int arr[] = new int[] {5,3,4,2,6,1,0};
		check(arr, 5);
	}//main
}//class