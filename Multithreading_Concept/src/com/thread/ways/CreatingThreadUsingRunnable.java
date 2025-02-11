package com.thread.ways;

public class CreatingThreadUsingRunnable implements Runnable {

	public static void main(String[] args) {
		CreatingThreadUsingRunnable runnable1 = new CreatingThreadUsingRunnable();
		CreatingThreadUsingRunnable runnable2 = new CreatingThreadUsingRunnable();
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();

	}// main

	@Override
	public void run() {
		System.out.println("CreatingThreadUsingRunnable.run()");
		System.out.println(Thread.currentThread().getName());
	}
}
