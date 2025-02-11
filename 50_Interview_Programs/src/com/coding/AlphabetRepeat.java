package com.coding;

public class AlphabetRepeat {

	public static String repeatCharWhenNum(String str) {
		// i/p= ab1c2d3
		// o/p=abccddd
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			int asci = (int) current;
			if (asci >= 48 && asci <= 57) {
				int builderLen = builder.length() - 1;
				char last = builder.charAt(builderLen);
				int repeat = Character.getNumericValue(current);
				for (int j = 1; j <repeat; j++) {
					builder.append(last);
				}
			} // if
			else {
				builder.append(current);
			} // else
		} // for
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println(repeatCharWhenNum("sub2u"));
	}// main
}// class