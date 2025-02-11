package com.waitMainThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CoundownLatchExample {
	private static CountDownLatch latch = new CountDownLatch(10);

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (int i = 1; i <= 10; i++) {
			service.execute(new Runnable() {
				public void run() {
					System.out.println("CoundownLatchExample.main(...).new Runnable() {...}.run()");
					latch.countDown();
				}});
		} // for
		latch.await();
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		service.shutdown();
	}

}