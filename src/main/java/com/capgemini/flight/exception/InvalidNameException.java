package com.capgemini.flight.exception;

public class InvalidNameException extends Exception{

	public InvalidNameException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InvalidNameException(String message) {
		super(message);
		
	}
	

}
