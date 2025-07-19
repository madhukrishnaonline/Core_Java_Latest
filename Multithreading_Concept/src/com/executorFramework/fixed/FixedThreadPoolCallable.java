package com.executorFramework.fixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.executorFramework.model.Citizen;

public class FixedThreadPoolCallable implements Callable<Object> {
	private Citizen citizen;

	public FixedThreadPoolCallable(Citizen citizen) {
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

		List<Citizen> citizenList = new ArrayList<>(Arrays.asList(citizen1, citizen2, citizen3, citizen4, citizen5,
				citizen6, citizen7, citizen8, citizen9, citizen10, citizen11));

		ExecutorService service = Executors.newFixedThreadPool(3);
		List<Future<Object>> futureList = new ArrayList<>();
		for (Citizen citizen : citizenList) {
			Future<Object> future = service.submit(new FixedThreadPoolCallable(citizen));
			futureList.add(future);
		} // for
		for (Future<Object> future : futureList) {
			if (future.isDone()) {
				Object object = future.get();
				System.out.println(object);
			} // if
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
