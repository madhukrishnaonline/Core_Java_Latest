package com.thread.ways;

public class ThreadCreationUsingThread extends Thread {
	
	@Override
	public void run() {// Runnable State
		// Running State
		System.out.println("ThreadCreations.run()");
		System.out.println(Thread.currentThread().getName());
	}// Dead State

	public static void main(String[] args) {
		ThreadCreationUsingThread thread1 = new ThreadCreationUsingThread();// New State
		ThreadCreationUsingThread thread2 = new ThreadCreationUsingThread();
		thread1.start(); /*Initially threadStatus will be 0,Thread created whenever start0() (=> native method (thread logic implemented in OS)) method is executed and threadStatus will be greater than 0*/
		thread1.run(); /* calling override run() method of child class cannot create a new thread, it'll be like normal thread only*/
//		thread1.start();  /*Dead Thread //when threadStatus will be like !=0 IllegalThreadStateException occur. We cannot re-use the thread*/  
		thread2.start();

		// The main disadvantage of Multi-threading is we cannot re-use the threads
	}// main

}//class