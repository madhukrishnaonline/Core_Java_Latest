package com.evenOdd;

public class Odd implements Runnable {
	@Override
	public synchronized void run() {
		for (int i = 0; i <= 11; i++) {
			try {
				if (i % 2 != 0) {
//					Thread.sleep(2000);
					wait();
				} // if
			} // try
			catch (InterruptedException e) {
				e.printStackTrace();
			} // catch
			System.out.println("Odd : " + i);
		} // for
	}// run()
}
