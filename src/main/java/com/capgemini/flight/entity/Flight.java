package com.capgemini.flight.entity;

import java.math.BigInteger;

/**
 * The {@code Flight} class repents the flight details and its seatCapacity
 * 
 * @author Indla Mahesh
 *
 */
public class Flight {
	private BigInteger flightNumber;
	private String flightName;
	private Integer seatCapacity;

	public Flight() {
		super();

	}

	/**
	 * 
	 * @param flightNumber
	 * @param flightName
	 * @param seatCapacity
	 */
	
	/**
	 * Parameterized Constructor :  It is a code that initializes instance variable.
	 *
	 */
	public Flight(BigInteger flightNumber, String flightName, Integer seatCapacity) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.seatCapacity = seatCapacity;
	}

	/**
     * Getters are used to return its Value.
     * 
     */
	public BigInteger getFlightNumber() {
		return flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public Integer getSeatCapacity() {
		return seatCapacity;
	}

	/**
     *Method Name : toString
     *             This is used to override the toString() method.
     *@return String
     *
     */
	@Override
	public String toString() {
		return "\nflightNumber : " + flightNumber + "\nflightName : " + flightName + "\nseatCapacity : " + seatCapacity;
	}

}
