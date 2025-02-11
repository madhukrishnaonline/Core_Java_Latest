package com.predicate;

public class EmployeeDetails {
	private String eId;
	private String ename;
	private String locations;
	private Double sal;

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public EmployeeDetails(String eId, String ename, String locations, Double sal) {
		super();
		this.eId = eId;
		this.ename = ename;
		this.locations = locations;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [eId=" + eId + ", ename=" + ename + ", locations=" + locations + ", sal=" + sal + "]";
	}
	
}//class