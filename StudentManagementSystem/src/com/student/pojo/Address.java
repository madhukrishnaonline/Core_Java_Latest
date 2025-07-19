package com.student.pojo;

public class Address {
	private String city;
	private Integer pinCode;
	private String state;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, Integer pinCode, String state) {
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + ", state=" + state + "]";
	}

}
