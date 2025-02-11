package com.atomicity;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomicity {
//	private static int count = 0;
	private static AtomicInteger count = new AtomicInteger(0);

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
//					count++;
					count.getAndIncrement();
				} // for
			}// run()
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
//					count++;
					count.getAndIncrement();
				} // for
			}// run()
		});
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		System.out.println(count.get());
	}
}
