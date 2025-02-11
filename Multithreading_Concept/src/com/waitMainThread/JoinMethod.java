package com.waitMainThread;

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
                System.out.println("Performing Calculations");
			}});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Creating File to write the Salary Result");
			}});
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		
	}

}
