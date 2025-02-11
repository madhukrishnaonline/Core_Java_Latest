package com.volatilee;

public class VolatileExample extends Thread {
    // Shared volatile variable
    private volatile boolean running = true;

    public void run() {
        System.out.println("Thread started...");
        while (running) {
            System.out.println("Busy-waiting for the flag to become false");
        }//while
        System.out.println("Thread stopped...");
    }//run()

    // Method to stop the thread
    public void stopRunning() {
        running = false;  // This change will be immediately visible to all threads
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();  // Start the thread

        Thread.sleep(1000);  // Main thread sleeps for 1 second

        System.out.println("Main thread stopping child thread...");
        thread.stopRunning();  // Set running to false to stop the child thread
    }
}
