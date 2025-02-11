package com.nareshit.cabcustomer;

public class CabCustomer {
	private int custId;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	private String phone;

	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
			String phone) {
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}

	public CabCustomer() {
	}

	protected int getCustId() {
		return custId;
	}

	protected void setCustId(int custId) {
		this.custId = custId;
	}

	protected String getCustomerName() {
		return customerName;
	}

	protected void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	protected String getPickupLocation() {
		return pickupLocation;
	}

	protected void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	protected String getDropLocation() {
		return dropLocation;
	}

	protected void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	protected int getDistance() {
		return distance;
	}

	protected void setDistance(int distance) {
		this.distance = distance;
	}

	protected String getPhone() {
		return phone;
	}

	protected void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", pickupLocation=" + pickupLocation
				+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phone=" + phone + "]";
	}

}
