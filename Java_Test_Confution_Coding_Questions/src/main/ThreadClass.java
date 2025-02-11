package main;

public class ThreadClass {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Runnable.run()");
			}

			@SuppressWarnings("unused")
			public void start() {
				System.out.println("Runnable.start()");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}//main
}//class