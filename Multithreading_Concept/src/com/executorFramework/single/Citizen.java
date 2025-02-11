package com.executorFramework.single;

public class Citizen {
	Integer ssn;
	String name;
	String planName;
	String eligiblityStatus;
	
	static int count=0;

	public Citizen(Integer ssn, String name, String planName) {
		this.ssn = ssn;
		this.name = name;
		this.planName = planName;
		count++;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

}
