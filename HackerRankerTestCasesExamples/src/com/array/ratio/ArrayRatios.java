package com.array.ratio;

import java.io.IOException;

public class ArrayRatios {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer[] arr1 = new Integer[] {-9,3,-4,0,4,1};
        int len = arr1.length; 
		
        double positive = 0,negative = 0, zero = 0;
		for(int i=0;i<=len-1;i++)
		{
			if(arr1[i]>0)
			{
				positive++;
			}//if
			if(arr1[i]<0)
			{
				negative++;
			}//if
			if(arr1[i]==0)
			{
				zero++;
			}//if
		}//for
		double d1 = positive/len;
		System.out.println("Positive Ratio :: "+String.format("%.6f",d1));
		double d2 = negative/len;
		System.out.println("Negative Ratio :: "+String.format("%.6f",d2));
		double d3 = zero/len;
		System.out.println("Zero's Ratio :: "+String.format("%.6f",d3));
	}// main
}// class