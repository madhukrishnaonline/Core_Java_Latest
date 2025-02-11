package com.string.operations;

public class SortStringArrayBasedOnElementsLength {

	public static void main(String[] args) {
		String[] str = { "madhu", "Allu Arjun", "veera", "krishna", "balu" };// sort the array based on length

		for (int i = 0; i < str.length; i++) {
			String str2 = str[i];
			int len1 = str2.length();
			for (int j = i + 1; j < str.length; j++) {
				String str3 = str[j];
				int len2 = str3.length();
				if (len1 > len2) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				} // if
				else if (len1 == len2) {
					String temp = str[i + 1];
					str[i + 1] = str[j];
					str[j] = temp;
				} // else if
			} // inner
		} // outer
		for (String s : str) {
			System.out.println(s);
		}
	}

}
