package com.array.diagonal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		
			System.out.println("Enter size :: ");
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				ArrayList<Integer> ar = new ArrayList<Integer>();
				for(int j=0;j<n;j++)
				{
					ar.add(sc.nextInt());
				}//inner for
				arr.add(ar);
			}//outer for
			System.out.println(arr);
		int leftSum = 0,rightSum = 0;
		for(int i=0;i<n;i++)
		{
			leftSum = leftSum+arr.get(i).get(i);  //0+1*1
			rightSum = rightSum+arr.get(i).get(n-i-1);
		}//for
		System.out.println(Math.abs(leftSum-rightSum));
		sc.close();
	}//main
}//class