package string.remove.duplicates;

import java.util.LinkedHashSet;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Remove_Duplicate 
{
	/*
	 * @Override public int hashCode() { return 897654321; }
	 */
	public static void main(String[] args) {
		String str = "Madhu Krishna";

		System.out.println("===Removing Duplicate Elements===");
		System.out.println("Approach-1===Stream");
		StringBuffer buffer = new StringBuffer();
		str.chars().distinct().forEach(c -> buffer.append((char) c));
		System.out.println(buffer);
		System.out.println(buffer.length());
		
		System.out.println("Approach-2===indexOf(int ch,int startIndx)");
		StringBuffer buffer2 = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int indx = str.indexOf(ch, i + 1);
//	    System.out.println(indx);
			if (indx == -1) {
				buffer2.append(ch);
			} // if
		} // for
		System.out.println(buffer2);
		System.out.println(buffer2.length());
		
		System.out.println("Approach-3===toCharArray[]");
		StringBuffer buffer3 = new StringBuffer();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					repeated = true;
					break;
				} // if
			} // inner for
			if (!repeated) {
				buffer3.append(ch[i]);
			} // if
		} // outer for
		System.out.println(buffer3);
		System.out.println(buffer3.length());
		
		System.out.println("Approach-4===Set");
		StringBuffer buffer4 = new StringBuffer();
		LinkedHashSet<Character> hashSet = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) 
		{
			hashSet.add(str.charAt(i));
		}//for
		for(Character c:hashSet)
		{
			buffer4.append(c);
		}
		System.out.println(buffer4);
		System.out.println("length :: "+buffer4.length());
		
		for(int i=0;i<str.length();i++)
		{
			int ascii = str.codePointAt(i);
			System.out.println(ascii);
		}
		System.out.println(str.chars().distinct().sum());
	}//main
}
