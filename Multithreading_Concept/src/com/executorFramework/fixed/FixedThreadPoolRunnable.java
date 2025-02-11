package com.executorFramework.fixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class FixedThreadPoolRunnable implements Runnable {
	private Citizen citizen;

	public FixedThreadPoolRunnable(Citizen citizen) {
		this.citizen = citizen;
	}

	@Override
	public void run() {
		triggerMessage(citizen);
	}

	public static void main(String[] args) {
		Citizen citizen1 = new Citizen(123456, "krishna", "CCAP");
		Citizen citizen2 = new Citizen(123457, "madhu", "SNAP");
		Citizen citizen3 = new Citizen(123458, "balu", "QHP");
		Citizen citizen4 = new Citizen(123459, "lokesh", "SNAP");
		Citizen citizen5 = new Citizen(123450, "subbu", "QHP");
		Citizen citizen6 = new Citizen(123461, "naresh", "CCAP");
		Citizen citizen7 = new Citizen(123462, "vamshi", "CCAP");
		Citizen citizen8 = new Citizen(123463, "veera", "MEDICARE");
		Citizen citizen9 = new Citizen(123464, "asrar", "SNAP");
		Citizen citizen10 = new Citizen(123465, "jaswanth", "QHP");
		Citizen citizen11 = new Citizen(123466, "jyothirmai", "MEDICAID");

		List<Citizen> citizenList = new ArrayList<>(Arrays.asList(citizen1, citizen2, citizen3, citizen4, citizen5,
				citizen6, citizen7, citizen8, citizen9, citizen10, citizen11));

//		ExecutorService service = Executors.newFixedThreadPool(3);
		ExecutorService service = Executors.newFixedThreadPool(3,new ThreadFactory() {
			@Override
			public Thread newThread(Runnable r) {
                Thread t = new Thread();
                t.setName("ThreadPool");
				return t;
			}//newThread
		});
		
		for (Iterator<Citizen> iterator = citizenList.iterator(); iterator.hasNext();) {
			Citizen citizen = (Citizen) iterator.next();
			FixedThreadPoolRunnable pool = new FixedThreadPoolRunnable(citizen);
			service.execute(pool);
		} // for

	}// main

	public void triggerMessage(Citizen citizen) {
		System.out.println("FixedThreadPool.triggerMessage()"+Thread.currentThread().getName());
		String msg = "Hi " + citizen.getName() + " based on your SSN " + citizen.getSsn() + " regarding the Plan "
				+ citizen.getPlanName() + " has been onboarded";
		System.out.println(msg);
	}

}
