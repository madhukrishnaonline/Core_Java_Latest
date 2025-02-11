package com.mk;

import java.util.Base64;

public class PasswordEncoder {

	public String encode(String str) {
		return Base64.getEncoder().encodeToString(str.getBytes());
	}// method

}// class