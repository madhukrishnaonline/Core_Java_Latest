package com.threadlocal;

import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalUsingSimpleDateFormatter {
	private static ExecutorService service = Executors.newFixedThreadPool(10);

	private static ThreadLocal<SimpleDateFormat> local = ThreadLocal
			.withInitial(() -> new SimpleDateFormat("dd-MM-yyyy"));

	public String getStudentBirthDate(Integer id) {
		Student student = StudentDump.findById(id);
		return local.get().format(student.getDob());
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadLocalUsingSimpleDateFormatter example = new ThreadLocalUsingSimpleDateFormatter();

		for (int i = 1; i <= 100; i++) {
			int count = i;
			service.execute(() -> {
				String date = example.getStudentBirthDate(123);
				System.out.println(date + " " + Thread.currentThread().getName() + " " + count);
			});
		}
		Thread.sleep(5000);
		service.shutdown();
	}
}