package com.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<Integer> queue = null;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(queue.take());
			} // for
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // catch
	}
}
