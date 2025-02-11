package main;

import java.util.Scanner;

public class SumOfNumbersInGivenRange
{
   public static void main(String[] args) 
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter First Number :: ");
	   int num1 = sc.nextInt();
	   System.out.println("Enter Second Number :: ");
	   int num2 = sc.nextInt();
	   
	   int sum = 0;
	   System.out.println("===Using For Loop===");
	   for(int i=num1;i<=num2;i++)
	   {
		   sum = sum+i;
	   }
	   System.out.println("The Sum Of given Range of "+num1+" & "+num2+" is "+sum);
	   System.out.println("===Using Formula===");
	                            //formula
	    int summ = num2*(num2+1)/2 - num1*(num1+1)/2+num1;
	    System.out.println(summ);
	    sc.close();
  }//main
}
