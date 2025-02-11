package com.array.minimaxsum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {
	public static void main(String[] args) {
         List<Integer> arr = new ArrayList<Integer>();
         arr.add(1);arr.add(5);arr.add(3);arr.add(4);arr.add(6);
         Integer minSum = arr.stream().sorted().limit(4).reduce(0,Integer::sum);
         Integer maxSum = arr.stream().sorted().skip(1).reduce(0,Integer::sum);
         System.out.println(minSum+" "+maxSum);
         
         arr.sort(Comparator.comparing(num->num));
         long miniSum=0,maxiSum=0;
         for(int i=0;i<arr.size();i++)
         {
        	 if(i>=0&&i<=3)
        	 {
        		 miniSum = miniSum+arr.get(i);
        	 }//if
        	 if(i>=1&&i<=4)
        	 {
        		 maxiSum = maxiSum+arr.get(i);
        	 }//if
         }//for
         System.out.println(miniSum+" "+maxiSum);
	}// main
}// class