package com.mk.interview;

import java.util.Arrays;

public class MissingNumbersInArray {
	public static void main(String[] args) {
		int arr[] = new int[] {2,1,3,2,3,4,6,8,1};
		int len = arr.length;
		
		int arr2[] = new int[len];
		Arrays.sort(arr);
		for(int i:arr)
		{
			arr2[i]=1;
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]==0)
			{
				System.out.println(i);
			}
		}//for
		
        
       
        
	}// main
}
