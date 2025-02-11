package com.array.operations;

public class MissingNumber 
{
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] {4,1,2,5};
		
		int sum = 0;
		int len = arr.length;
		System.out.println("Length :: "+len);
		int totalSum = (len+1)*(len+2)/2;
		System.out.println("Total Sum :: "+totalSum);
		
		/*for(int i=0;i<len;i++)
		{
			sum=sum+arr[i];
		}*/
		for(Integer i:arr)
		{
			sum = sum+i;
		}
		System.out.println("Missing Number :: "+(totalSum-sum));
	}
}
