package com.map.nareshit.hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class HospitalService {
	List<Hospital> listOfHospital = new ArrayList<>();

	public int addHospital(Hospital hospital) {
		Random random = new Random();
		int code = random.nextInt(100, 200);
		
		hospital.setHospitalCode(code);

		listOfHospital.add(hospital);
		return hospital.getHospitalCode();
	}

	public Map<Integer, String> getHospitals() {
		return listOfHospital.stream().collect(Collectors.toMap(Hospital::getHospitalCode, Hospital::getHospitalName));
	}

	public Hospital getHospitalDetails(Integer code) {
		for (Hospital hospital : listOfHospital) {
			if (hospital.getHospitalCode() == code) {
				return hospital;
			}
		}
		return null;
	}
}
