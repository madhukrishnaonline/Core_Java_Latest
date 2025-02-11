package com.array.countSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountingSort {
//	@SuppressWarnings({"removal"})
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         List<Integer> arr = new ArrayList<Integer>();
         System.out.println("Enter the Elements ::");
         for(int i=0;i<10;i++)
         {
        	 arr.add(sc.nextInt());
         }//for
         
         Integer[] n = new Integer[10];
//         Arrays.fill(n,new Integer(0));
         for(int i=0;i<arr.size();i++)
         {
        	 n[arr.get(i)]++; //n[0]++
         }//for
         Arrays.asList(n).forEach(System.out::println);
         sc.close();
	}//main
}//class