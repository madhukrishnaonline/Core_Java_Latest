package com.nareshit.cabcustomer;

import java.util.ArrayList;

public class CabCustomerService {
	private ArrayList<CabCustomer> cabCustomers;

	public CabCustomerService(ArrayList<CabCustomer> cabCustomers) {
		this.cabCustomers = cabCustomers;
	}

	public void addCustomer(CabCustomer customer) {
		cabCustomers.add(customer);
	}

	public boolean isCustomer(CabCustomer customer) {
		for (CabCustomer cabCustomer : cabCustomers) {
			if (cabCustomer.getPhone().equals(customer.getPhone())) {
				return true;
			}
		}
		return false;
	}

	public double calculateBill(CabCustomer customer) {
		if (!isCustomer(customer)) {
			return 0;
		} else if (customer.getDistance() <= 4) {
			return 80;
		} else {
			return 80 + (6*(customer.getDistance() - 4));
		}
	}

	public void printBill(CabCustomer customer) {
		double bill = calculateBill(customer);
		System.out.println(customer.getCustomerName() + " Please pay your bill of Rs." + bill);
	}
}
