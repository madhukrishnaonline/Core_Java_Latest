package com.completablefuture;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private String employeeId;
	private String firstName;
	private String lastName;
	private double salary;
	private Designation designation;
	private String email;
	private String gender;
	private String city;
	private String state;
	private String country;
}
//id,name,email,mobile,gender,city,state,country