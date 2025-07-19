package com.reflect.api;

public class User {
	private int id;
	private String name;
	private Long mobile;

	@SuppressWarnings("unused")
	private User() {
		System.out.println("Private Constructor :: User.User()");
	}

	public User(int id, String name, Long mobile) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}

	@SuppressWarnings("unused")
	private void m1() {
		System.out.println("private Method :: User.m1()");
	}
}
