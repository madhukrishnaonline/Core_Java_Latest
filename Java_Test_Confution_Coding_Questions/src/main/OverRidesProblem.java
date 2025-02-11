package main;

@SuppressWarnings("removal")
public class OverRidesProblem extends Object {
	static String str = "Madhu KRishna";
	static Double dbl = 5555.055;
	static StringBuffer sb = new StringBuffer();
	static Character ch = new Character('m');

	public static void main(String[] args) {
		System.out.println(str.hashCode());
		System.out.println(dbl.hashCode());
		System.out.println(sb.hashCode());
		System.out.println(ch.hashCode());
	}

}
