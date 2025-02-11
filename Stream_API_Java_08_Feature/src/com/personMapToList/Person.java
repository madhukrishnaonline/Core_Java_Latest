package com.personMapToList;

public class Person {
	private Long aadhar;
	private String name;
	private Integer age;
	public Long getAadhar() {
		return aadhar;
	}
	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
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
		return "Person [aadhar=" + aadhar + ", name=" + name + ", age=" + age + "]";
	}
	
}//class