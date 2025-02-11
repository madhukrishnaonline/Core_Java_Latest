package com.streams;

public class FindDuplicates {

	public static void main(String[] args) {
		int f = 0;
		int s = 1;
		int n = 5;
		System.out.print(f + " " + s+" ");
		for (int i = 2; i <= n; i++) {
			int sum = f+s;
			System.out.print(sum+" ");
            f = s;
            s=sum;
		} // for
	}

}
