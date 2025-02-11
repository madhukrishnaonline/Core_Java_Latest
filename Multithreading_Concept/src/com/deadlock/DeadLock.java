package com.deadlock;

public class DeadLock {

	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Object();
		Thread1 thread1 = new Thread1(object1, object2);
		Thread2 thread2 = new Thread2(object1, object2);

		Thread threadR1 = new Thread(thread1);
		Thread threadR2 = new Thread(thread2);

		threadR1.start();
		threadR2.start();
	}// main

}

class Thread1 implements Runnable {
	Object object1 = null;
	Object object2 = null;

	public Thread1(Object object1, Object object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	@Override
	public void run() {
		System.out.println("Thread1.run()");
		synchronized (object1) {
			System.out.println("Object 1");
			synchronized (object2) {
				System.out.println("Object 2");
			}
		}
	}
}

class Thread2 implements Runnable {
	Object object1 = null;
	Object object2 = null;

	public Thread2(Object object1, Object object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	@Override
	public void run() {
		System.out.println("Thread2.run()");
		synchronized (object2) {
			System.out.println("Object 2");
			synchronized (object1) {
				System.out.println("Object 1");
			}
		}
	}
}