package com.capgemini.flight.exception;

/**
 * The {@code BookingIdException} class extends Exception is user defined exception used to handle
 * the Booking ID of passengers, exceptions need to be declared in a
 * method or constructor's {@code throws} clause if they can be thrown
 * by the execution of the method or constructor and propagate outside
 * the method or constructor boundary. 
 * 
 * @author Indla Mahesh
 *
 */
public class BookingIdException extends Exception {

	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public BookingIdException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * 
	 * @param message
	 */
	public BookingIdException(String message) {
		super(message);
		
	}
	

}
