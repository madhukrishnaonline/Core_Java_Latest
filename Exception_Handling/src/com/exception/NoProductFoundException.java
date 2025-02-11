package com.exception;

@SuppressWarnings("serial")
public class NoProductFoundException extends RuntimeException {
	public NoProductFoundException() {
	}

	public NoProductFoundException(String msg) {
		super(msg);
	}

}//class