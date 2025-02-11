package main;

import java.util.Scanner;

public class SumOfNumbers 
{
   public static void main(String[] args) 
   {
	        Scanner sc = new Scanner(System.in);
	 		System.out.println("Enter Number :: ");
	 		String n = sc.nextLine();
	 		int str = n.length();
	 		int sum =0;
	 		for(int i=0;i<=str-1;i++)
	 		{
	 			char ch = n.charAt(i);
	 			int num = (int)ch;
	 			//char ch2 = n.
	 			//System.out.print(num);
	 			sum = sum+num - 48;
	 		}//for
	 		System.out.println("Sum of "+n +" is "+ sum);
	 		StringBuffer sb = new StringBuffer(sum);
	 		System.out.println(sb.reverse());
	 		sc.close();
   }//main
}
