package com.loops;

import static java.lang.Math.*;

public class Armstrong {
	public static boolean isArmstrong(Integer num) {
		int original = num;
		int len = String.valueOf(num).length();
		int sum = 0;
		while(num!=0) {
			int digit = num%10;
			 sum+= pow(digit,len);
			num = num/10;
		}//while
             return original==sum;
	}

	public static void main(String[] args) {
        System.out.println(isArmstrong(153));
	}

}
