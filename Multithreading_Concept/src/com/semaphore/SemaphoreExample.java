package com.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample implements Runnable {

	private static Semaphore semaphore = new Semaphore(2,true);

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
             Thread thread = new Thread(new SemaphoreExample());
             thread.start();
		}
	}// main

	@Override
	public void run() {
		System.out.println("SemaphoreExample.run()");
		try {
			System.out.println(Thread.currentThread().getName() + " waiting");
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName() + " Aquired");
			semaphore.release();
			System.out.println(Thread.currentThread().getName() + " Released");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // catch
	}
}
