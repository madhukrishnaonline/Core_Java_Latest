package main;

import java.util.Scanner;

public class Fibonaccii 
{
	@SuppressWarnings({ "removal" })
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int range,a=0,b=1,c;
		System.out.println("Enter the Fibonacci Rage :: ");
		 range = new Integer(sc.nextInt());
        for(int i=0;i<=range;i++) //
        {
        	System.out.print(a+"\t"); //0,
             c = a+b; //c = 0+1=1,
             a=b; //0=1
             b=c; //1=1
        }//for
        sc.close();
	}//main
}//OuterClass