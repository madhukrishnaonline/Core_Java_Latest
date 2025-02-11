package com.array.distinct;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(4);
		a.add(1);
		a.add(5);
		for(int i=0;i<a.size();i++)//i=0;i<3;
		{
			int count =0;
			for(int j=0;j<a.size();j++)
			{
				if(a.get(i)==a.get(j))
				{
					count++;
				}//if
			}//inner for
			if(count==1)
			{
				System.out.println(a.get(i));
			}//if
		}//for
		
		// XOR
		/*int result = 0;
		for (int i = 0; i < a.size(); i++) {
		      result = result^a.get(i);//0^1=1,1^4=5,5^1=4,4^5=9
		}*/
//		System.out.println(result);
	}// main
}// class