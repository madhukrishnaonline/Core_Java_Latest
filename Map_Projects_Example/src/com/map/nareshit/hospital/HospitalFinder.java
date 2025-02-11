package com.map.nareshit.hospital;

import java.util.List;

public class HospitalFinder {
	public static void main(String[] args) {
		HospitalService service = new HospitalService();
		int code1=service.addHospital(
				new Hospital("KIMS", List.of("Cardiology", "Gynacology"), "Balu", "0987654321", "Panjagutta"));
       
		int code2=service.addHospital(
				new Hospital("Yashodha", List.of("Cardiology", "Gynacology","Orthopedic"), "Verra", "67865654321", "Madhapur"));
		
		int code3=service.addHospital(
				new Hospital("NIMS", List.of("Gynacology","Nuerology"), "Vamshi", "0987654321", "Irrumanzil"));
		
		int code4=service.addHospital(
				new Hospital("Ramesh", List.of("Cardiology","Denatl","Skin treats"), "Hemakanth", "4321654321", "Vijayawada"));
		
		service.getHospitals().forEach((k,v)->System.out.println(k+"-"+v));
		System.out.println("================");
		
		Hospital hospitalDetails = service.getHospitalDetails(code1);
		System.out.println(code1+" Hospital Details :: "+hospitalDetails);
		
//		System.out.println("================");
		
		
	}
}
