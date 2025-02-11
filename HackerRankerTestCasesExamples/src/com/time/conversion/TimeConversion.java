package com.time.conversion;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Time :: ");
        String clock = scanner.nextLine();
        System.out.println(clock.charAt(0));

        if(clock.toLowerCase().charAt(8)=='p')
        {
        	if(clock.charAt(0)=='1' && clock.charAt(1)=='2')
        	{
        		System.out.println(clock.substring(0,8));
        	}//inner if
        	else
        	{
        		String time = clock.substring(2,8);
        		int t = 12+Integer.parseInt(clock.substring(0,2));
        		String result = t+time;
        		System.out.println(result);
        	}//inner else
        }//if
        else
        {
        	if(clock.charAt(0)=='1' && clock.charAt(1)=='2')
        	{
        		String am = clock.substring(2,8);
        		String time = "00"+am;
        		System.out.println(time);
        	}//inner if
        	else
        	{
        		System.out.println(clock.substring(0,8));
        	}//inner else
        }//else
        scanner.close();
	}// main
}// class