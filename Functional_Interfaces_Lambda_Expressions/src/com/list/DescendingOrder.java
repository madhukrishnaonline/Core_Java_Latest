package com.list;

import java.util.ArrayList;

public class DescendingOrder 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(0);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(1);
		arrayList.add(5);
		
		System.out.println("====Before Sort====");
		arrayList.forEach(System.out::println);
		System.out.println("=====After Sort=====");
		arrayList.sort((i,j)->i.compareTo(j));
        arrayList.forEach(System.out::println);
        System.out.println("=====Descending Order=====");
        arrayList.sort((i,j)->i>j?-1:1);
        arrayList.forEach(System.out::println);
        
	}
	
}//class