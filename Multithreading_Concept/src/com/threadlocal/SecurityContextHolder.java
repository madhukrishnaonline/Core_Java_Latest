package com.threadlocal;

import java.util.Date;

@SuppressWarnings("deprecation")
public class SecurityContextHolder {
	private static ThreadLocal<Student> threadLocal = new ThreadLocal<>();

	public void service1() {
		threadLocal.set(new Student(567, "Madhu", new Date(2001 - 1900, 02, 13)));
	}

	public void service2() {
		System.out.println(threadLocal.get());
	}

	public void service3() {
		threadLocal.remove();
	}

	public static void main(String[] args) {
		SecurityContextHolder contextHolder = new SecurityContextHolder();
		contextHolder.service1();
		contextHolder.service2();
		contextHolder.service3();
		contextHolder.service2();
	}
}