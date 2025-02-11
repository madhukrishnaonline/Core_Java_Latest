package com.predicate;

public class PersonDetails {
	private String name;
	private Integer age;
	private Long phone;

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

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public PersonDetails(String name, Integer age, Long phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "PersonDetails [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}

}// class