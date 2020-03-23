package com.capgemini.flight.entity;

import java.math.BigInteger;

/**
 * The {@code Passenger} class use to represent passenger details of Flight.
 * 
 * @author Indla Mahesh
 *
 */
public class Passenger {

	private BigInteger pnrNumber;
	private String passengerName;
	private Integer passengerAge;
	private Double luggage;

	/**
	 * 
	 * @param passengerName
	 * @param passengerAge
	 * @param luggage
	 */
	public Passenger(String passengerName, Integer passengerAge, Double luggage) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.luggage = luggage;
	}

	public Passenger() {
		super();

	}
    
	/**
	 * Parameterized Constructor :  It is a code that initializes instance variable.
	 *
	 */
	public Passenger(BigInteger pnrNumber, String passengerName, Integer passengerAge, Double luggage) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.luggage = luggage;
	}
   /**
    * 
    * getters and Setters are used for binding data.
    */
	public BigInteger getPnrNumber() {
		return pnrNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public Integer getPassengerAge() {
		return passengerAge;
	}

	public Double getLuggage() {
		return luggage;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}

	public void setLuggage(Double luggage) {
		this.luggage = luggage;
	}

	public void setPnrNumber(BigInteger pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	/**
     *Method Name : toString
     *             This is used to override the toString() method.
     *@return String
     *
     */
	@Override
	public String toString() {
		return "\npnrNumber : " + pnrNumber + "\npassengerName : " + passengerName + "\npassengerAge : " + passengerAge
				+ "\nluggage : " + luggage;
	}

}
