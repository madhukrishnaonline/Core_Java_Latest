package com.temp;

public class Temp {
	public static void main(String[] args) throws InterruptedException {
		/*Thread thread2 = new Thread(new Consumer());
		thread2.start();*/

		Thread thread1 = new Thread(new Producer());
		thread1.start();

	}
}