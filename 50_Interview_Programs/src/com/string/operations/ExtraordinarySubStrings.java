package com.string.operations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtraordinarySubStrings {
	private static Map<Character, Integer> createMapping(){
		Map<Character,Integer> map = new HashMap<>();
		map.put('a', 1); map.put('b', 1); map.put('c', 2);
        map.put('d', 2); map.put('e', 2); map.put('f', 3);
        map.put('g', 3); map.put('h', 3); map.put('i', 4);
        map.put('j', 4); map.put('k', 4); map.put('l', 5);
        map.put('m', 5); map.put('n', 5); map.put('o', 6);
        map.put('p', 6); map.put('q', 6); map.put('r', 7);
        map.put('s', 7); map.put('t', 7); map.put('u', 8);
        map.put('v', 8); map.put('w', 8); map.put('x', 9);
        map.put('y', 9); map.put('z', 9);    
        return map;
	}
	private static int countSubStrings(String str) {
		Map<Character,Integer> map = createMapping();
		int count=0;
		for(int i=0;i<str.length();i++) {
			int sum = 0;
			for(int j=i;j<str.length();j++) {
				char ch = str.charAt(j);
				sum+=map.get(ch);
				
				//length of the current substring
				int length = j-i+1;
				
				if(sum%length==0) {
					count++;
				}//if
			}//inner
          
		}//for
		return count;
	}
	
	private static List<String> possibleSubStrings(String str){
		List<String> subStrings = new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				 subStrings.add(str.substring(i,j));
			}//inner
		}//outer
		return subStrings;
	}
	public static void main(String[] args) {
            System.out.println(countSubStrings("abcd"));
            String string = possibleSubStrings("abcd").stream().max(Comparator.comparing(String::length)).get();
            System.out.println("Max SubString :: "+string);
	}
}
