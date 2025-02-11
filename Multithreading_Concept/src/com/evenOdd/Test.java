package com.evenOdd;

public class Test {

	public static void main(String[] args) {
        Thread thread = new Thread(new Even());
        Thread thread1 = new Thread(new Odd());
        
        thread.start();
        thread1.start();
        
	}//main
}//class