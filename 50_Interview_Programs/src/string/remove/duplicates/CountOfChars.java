package string.remove.duplicates;

import java.util.ArrayList;
import java.util.List;

public class CountOfChars {
	public static void main(String[] args) {
		String str = "Madhu Krishna";
		Integer codes = null;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			codes = str.codePointAt(i);
			list.add(codes);
		}//for
		Integer reduce = list.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		long count = str.strip().chars().sum();
		System.out.println("Count :: " + count);
		
		long count2 = str.chars().count();
		System.out.println(count2);
	}//main
}//class