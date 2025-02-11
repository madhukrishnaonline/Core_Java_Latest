package com.evenOdd;

public class Even implements Runnable {
	@Override
	public synchronized void run() {
		try {
			System.out.println("Waiting for Even to print");
			for (int i = 0; i <= 11; i++) {
				if (i % 2 == 0) {
					Thread.sleep(3000);
					System.out.println("Even : " + i);
					notify();
				} // if
			} // for
			System.out.println("Printed Even");
		} // try
		catch (Exception i) {
			i.printStackTrace();
		} // catch
	}// run()

}// class