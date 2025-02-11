package com.loops;

public class Print1To10While {

	public static void main(String[] args) {
         int i= 1;
         boolean loop = true;
         while(true) {
        	 System.out.println(i);
        	 if(i==20) {
//        		 loop= false;
        		 break;
        	 }//if
        	 i++;
         }//while
	}

}
