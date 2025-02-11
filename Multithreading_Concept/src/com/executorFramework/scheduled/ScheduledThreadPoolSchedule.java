package com.executorFramework.scheduled;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolSchedule implements Callable<Object> {
	private Citizen citizen;

	public ScheduledThreadPoolSchedule(Citizen citizen) {
		this.citizen = citizen;
	}

	@Override
	public Object call() throws Exception {
		triggerMessage(citizen);
		return "Mail Sent";
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
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
		Citizen citizen12 = new Citizen(123467, "madhavi", "MEDICARE");
		Citizen citizen13 = new Citizen(123468, "Yogitha", "MEDICAID");

		List<Citizen> citizenList = new ArrayList<>(Arrays.asList(citizen1, citizen2, citizen3, citizen4, citizen5,
				citizen6, citizen7, citizen8, citizen9, citizen10, citizen11, citizen12, citizen13));

		ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
		for (Iterator<Citizen> iterator = citizenList.iterator(); iterator.hasNext();) {
			Citizen citizen = (Citizen) iterator.next();
			ScheduledThreadPoolSchedule pool = new ScheduledThreadPoolSchedule(citizen);
//			ScheduledFuture<Object> scheduledFuture = service.schedule(pool, 1, TimeUnit.MINUTES);
			ScheduledFuture<Object> scheduledFuture = service.schedule(pool, 1, TimeUnit.MINUTES);
			
			System.out.println(LocalTime.now());
			if (scheduledFuture.isDone()) {
				System.out.println(scheduledFuture.get());
				System.out.println("Done "+LocalTime.now());
			}
		} // for
		service.shutdown();

	}// main

	public void triggerMessage(Citizen citizen) {
		System.out.println("FixedThreadPool.triggerMessage()" + Thread.currentThread().getName());
		String msg = "Hi " + citizen.getName() + " based on your SSN " + citizen.getSsn() + " regarding the Plan "
				+ citizen.getPlanName() + " has been onboarded";
		System.out.println(msg);
	}

}