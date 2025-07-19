package com.object;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
	private static final long serialVersionUID = -254154574895810496L;

	private final Integer id = 123;
	private final String name = "Madhu";
	private Address address;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		cloned.address = new Address();
		return cloned;
	}
}
