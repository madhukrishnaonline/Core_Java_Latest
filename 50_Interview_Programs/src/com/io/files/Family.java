package com.io.files;

import java.io.Serializable;

public class Family implements Serializable {

	
	private static final long serialVersionUID = 1303902155170779941L;
	private String name;
	private Integer age;

	public Family(String name,Integer age) {
		this.name = name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Family [name=" + name + ", age=" + age + "]";
	}

	

}