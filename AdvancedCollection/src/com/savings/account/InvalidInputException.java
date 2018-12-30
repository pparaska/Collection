package com.savings.account;

public class InvalidInputException extends RuntimeException {

	public InvalidInputException(String message) {
		super(message);
	}

	public InvalidInputException() {

	}

}