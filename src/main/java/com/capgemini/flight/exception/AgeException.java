package com.capgemini.flight.exception;
/**
 * The {@code AgeException} class extends Exception is user defined exception used to handle
 * the Age of passenger,exceptions need to be declared in a
 * method or constructor's {@code throws} clause if they can be thrown
 * by the execution of the method or constructor and propagate outside
 * the method or constructor boundary. 
 * 
 * @author Indla Mahesh
 *
 */
public class AgeException extends Exception{
	/**
	 * 
	 * @param message
	 * @param cause
	 */

	public AgeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * 
	 * @param message
	 */
	public AgeException(String message) {
		super(message);
		
	}
	
	

}
