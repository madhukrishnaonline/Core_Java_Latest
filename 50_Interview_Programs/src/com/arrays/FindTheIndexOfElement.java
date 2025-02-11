package com.arrays;

public class FindTheIndexOfElement {
	public static Integer getIndex(Integer[] arr, int value) {
		Integer index = null;
		for (int i = 0; i < arr.length; i++) {
           if(arr[i]==value) {
        	   index=i;
        	   break;
           }//if
		} // for
		return index;
	}

	public static void main(String[] args) {
          Integer[] arr = new Integer[] {2,5,41,6};
          System.out.println(getIndex(arr, 41));
	}

}
