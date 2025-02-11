package com.array.operations;

import java.util.Arrays;

public class ZigZagSequence {
    
    public static void findZigZagSequence(int[] arr) {
        int n = arr.length;
        int k = (n + 1) / 2;
        
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Swap arr[k-1] with arr[n-1]
        int temp = arr[k-1];
        arr[k-1] = arr[n-1];
        arr[n-1] = temp;

        // Step 3: Reverse the elements after k-1 index to make them decreasing
        int left = k;
        int right = n - 2; // n-1 is already swapped
        
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Output the zigzag sequence
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4, 6};
        findZigZagSequence(arr);
    }
}
