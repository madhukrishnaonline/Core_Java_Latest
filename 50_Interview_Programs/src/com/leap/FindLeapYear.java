package com.leap;

public class FindLeapYear {
	public static void main(String[] args) {
        int year = 2019;
        System.out.println(isLeapYear(year));
        
        int count = 0;
		 for(int i=2000;count!=20;i+=4) {
			if(i%4==0 && i%100!=0) {
				System.out.println(i);
			}//if
			count++;
		}//for
		
		/* while(count!=20) {
		//        	year = year+4;
			if((year%400==0) || (year%4==0 && year%100!=0)) {
				System.out.println(year);
			}//if
			count++;
		}//while
		*/	
	}//main
	private static boolean isLeapYear(int year) {
		if(year%4==0) {
			return true;
		}//if
		/*else if(year%24==0) {
			return true;
		}//else if
		*/		else {
			return false;
		}//else
	}
}//class