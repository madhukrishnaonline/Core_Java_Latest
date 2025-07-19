package com.emp.mgmt;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class EmployeeManagement {

	public static void main(String[] args) {
		EmployeeDump dump = new EmployeeDump();
		dump.addEmployees();
		ExecutorService executor = Executors.newFixedThreadPool(5);
		try {
			CompletableFuture<List<Employee>> completableFuture = CompletableFuture
					.supplyAsync(() -> dump.getEmployees());

			CompletableFuture<Void> compositionCompletableFuture = completableFuture.thenAcceptAsync(emps -> {
				System.out.println("==========fetch the employee from in memory AL==========");
				System.out.println("Thread :: "+Thread.currentThread().getName());
				emps.forEach(System.out::println);}, executor)
			.thenComposeAsync(v -> completableFuture).thenApplyAsync(emps -> 
				emps.stream().filter(emp -> emp.getNewJoiner().equalsIgnoreCase("Yes")).toList(), executor)
			.thenAcceptAsync(newJoiners->{
				System.out.println("==========filter who is new joiner==========");
				System.out.println("Thread :: "+Thread.currentThread().getName());
				newJoiners.forEach(System.out::println);
			},executor)
			.thenComposeAsync(v->completableFuture)
			.thenApplyAsync(emps->
				emps.stream().filter(emp -> emp.getLearningPending().equals("YES")).toList(),executor)
			.thenAcceptAsync(pendingLearners->{
				System.out.println("==========filter who's learning is pending==========");
				System.out.println("Thread :: "+Thread.currentThread().getName());
				pendingLearners.forEach(System.out::println);
			},executor)
			.thenComposeAsync(v->completableFuture)
			.thenApplyAsync(emps->{
			//collect data in a map->Map<String,List<Employee>>
				System.out.println("Thread :: "+Thread.currentThread().getName());
				return emps.stream().collect(Collectors.groupingBy(emp -> emp.getGender()));},executor)
			.thenAcceptAsync(toMap->{
				System.out.println("==========print the map -->thenAcceptAsync==========");
				System.out.println("Thread :: "+Thread.currentThread().getName());
				toMap.forEach((k,v)->{
					System.out.println(k+"[");
					v.forEach(System.out::println);
					System.out.println("]");
				});
			},executor)
			.exceptionally(exception->{
				exception.printStackTrace();
				return null;
			});
			
			compositionCompletableFuture.join();
		} finally {
			executor.shutdown();
		}
	}
}