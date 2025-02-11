package com.nareshit.cabcustomer;

import java.util.ArrayList;

public class CabCustomerServiceTester {

	public static void main(String[] args) {

		CabCustomerService service = new CabCustomerService(new ArrayList<>());

		CabCustomer krishna= new CabCustomer(1, "krishna", "Ameerpet", "Madhapur", 11, "0987654321");
		CabCustomer madhu = new CabCustomer(3, "madhu", "Ameerpet", "kacheguda", 12, "1234567890");
		CabCustomer lokesh = new CabCustomer(2, "lokesh", "Ameerpet", "SR Nagar", 2, "0987654322");
		CabCustomer naresh = new CabCustomer(5, "naresh", "Ameerpet", "Musapet", 4, "0987654323");
		CabCustomer subbu = new CabCustomer(4, "subbu", "Ameerpet", "Hitech city", 13, "0987654324");

		service.addCustomer(krishna);
		service.addCustomer(madhu);
		service.addCustomer(lokesh);
		service.addCustomer(naresh);
		service.addCustomer(subbu);
		
//		service.printBill(krishna);
//		service.printBill(new CabCustomer(1, "scott", "hitech city", "Gachibowli", 6, "0987634321"));
		service.printBill(naresh);
	}

}
