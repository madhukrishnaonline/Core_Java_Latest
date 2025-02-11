package com.string.operations;

public class ChangeTheCaseOfAlternateCharacterInEven {

	public static void main(String[] args) {
		String[] str = { "madhu", "Allu Arjun", "veera", "krishna" };//
		for (int i = 0; i < str.length; i++) {
			String str1 = str[i];
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < str1.length(); j++) {
				char ch = str1.charAt(j);
				if ((j + 1) % 2 == 0) {
					if (ch >= 'a' && ch <= 'z') {
						ch = (char) (ch - 32);
						builder.append(ch);
					} // inner if
					else {
						builder.append(ch);
					}//inner else
				} // outer if
				else {
					builder.append(ch);
				} // else
			} // inner
			str[i] = builder.toString();
		} // outer
		for (String s : str) {
			System.out.println(s);
		}
		/*String str1 = "madhu";
		for (int j = 0; j < str1.length(); j++) {
			char ch = str1.charAt(j);
			if ((j + 1) % 2 == 0) {
				System.out.println(ch);
			}
		}*/
	}

}
