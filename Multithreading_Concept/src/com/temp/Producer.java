package com.temp;

public class Producer implements Runnable {

	@Override
	public void run() {
		consumer();
		producer();
	}

	public synchronized void producer() {
		System.out.println("Producing");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Producer Produced");
		notify();
	}

	public synchronized void consumer() {
		System.out.println("Waiting for the producer to produce");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Consuming from producer");
	}

}