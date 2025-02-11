package com.array.operations;

public class ArrayCopyToAnotherArray {
	public static void main(String[] args) {
		System.out.println("Using System arrayCopy method");
		int[] a1 = new int[] { 1, 2, 3, 4 };
		int[] a2 = new int[a1.length];
		
		System.arraycopy(a1, 1, a2, 1, 3);
		for(int arr:a2) {
			System.out.println(arr);
		}//for
		
		/*int[] a = new int[] { 1, 2, 3, 4 };
		int[] b = a; // Copying a Array to b Array
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		} // for
		System.out.println("Changing Array element in a Array = reflecting in b Array");
		a[2] = 5;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		} // for
		System.out.println("Changing Array element in b Array = reflecting in a Array");
		b[2] = 3;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		} // for
		*/
		
		// second approach using for loop copy
		/* int[] c = {1,2,3,4,5,6};
		 int[] d = new int[c.length];
		
		 for(int i=0;i<c.length;i++)
		 {
			 d[i] = c[i];   //Copying a Array to b Array through loop
			 System.out.println(d[i]);
		 }//for
		 System.out.println("Changing Array element in c Array =will not reflecting in d Array");
		 c[5] = 7;
		 System.out.println(d[5]);
		 System.out.println("Changing Array element in d Array =will not reflecting in c Array");
		 d[5] = 8;
		 System.out.println(c[5]);*/

		// 3rd Approach using Arrays.copyOf() method
		/* int[] c = {1,2,3,4,5,6};
		 int[] d = Arrays.copyOf(c, c.length); //Copying a Array to b Array through loop
		
		 for(int i=0;i<d.length;i++)
		 {
			 System.out.println(d[i]);
		 }//for
		 System.out.println("Changing Array element in c Array =will not reflecting in d Array");
		 c[5] = 7;
		 System.out.println(d[5]);
		 System.out.println("Changing Array element in d Array =will not reflecting in c Array");
		 d[5] = 8;
		 System.out.println(c[5]);*/

		/*	System.out.println(" Copying An Array Using clone() Method");
			int[] c = { 1, 2, 3, 4, 5, 6 };
			int[] d = c.clone(); // Copying an Array through clone() method
		
			for (int i = 0; i < d.length; i++) {
				System.out.println(d[i]);
			} // for
			System.out.println("Changing Array element in c Array =will not reflecting in d Array");
			c[5] = 7;
			System.out.println(d[5]);
			System.out.println("Changing Array element in d Array =will not reflecting in c Array");
			d[5] = 8;
			System.out.println(c[5]);*/

	}// main
}// class