package com.array.operations;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayEvenOddPositions 
{
	public static void main(String[] args) 
	{
		                                                  //1, 2, 3, 4, 5, 6, 7, 8
		Integer[] i = new Integer[] { 2, 1, 3, 4, 2, 3, 5, 3 };
		System.out.println(i.length);
		System.out.println("Elements at Even Position are :: ");
		for (int n = 1; n <i.length; n+=2) 
		{
			    System.out.println("position :: "+(n+1));
				System.out.println("Value :: "+i[n]);
		} // for
		System.out.println("Elements at Odd Position are :: ");
		for(int n=0;n<i.length;n+=2)
		{
			System.out.println("position :: "+(n+1));
			System.out.println(i[n]);
		}//for
		System.out.println("Repetitive Element");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer n:i)
		{
			map.merge(n, 1, Integer::sum);
		}//for
		System.out.println(map.entrySet());
		Entry<Integer, Integer> max = Collections.max(map.entrySet(),Map.Entry.comparingByValue());
		System.out.println(max.getKey()+"-"+max.getValue());
	}//main
}//class