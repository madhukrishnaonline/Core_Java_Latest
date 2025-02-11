package com.user;

import java.util.Optional;

public class User {

	public Optional<String> getName(int id) {
		String name = null;
		if (id == 101) {
			return Optional.ofNullable("Madhu");
		} // if
		else if (id == 103) {
			return Optional.ofNullable("Krishna");
		} // else if
		else if (id == 105) {
			return Optional.ofNullable("Madhu Krishna");
		} // else if
		return Optional.ofNullable(name);
	}// getName
}// class