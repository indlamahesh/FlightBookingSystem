package com.capgemini.flight.entity;



/**
 * 
 * The {@code Airport} class represents airport name ,airport location, airport code as {@code "abc"} String.
 * This class represents to get the details of airport regarding booking in Flight Management System
 * 
 * @author Indla Mahesh
 * 
 * 
 * 
 *
 */
public class Airport {
	
	private String airportName;
	private String airportLocation;
	private String airportCode;
    /**
     * Default constructor
     */
	public Airport() {
		super();

	}
    /**
     * 
     * @param airportName
     *        It is used to represents the airport Name.
     *        
     * @param airportLocation
     *        It is used to represents the details of airport Location.
     * 
     * @param airportCode
     *        It is used to represents the Airport Code.
     * 
     */
	
	/**
	 * Parameterized Constructor :  It is a code that initializes instance variable.
	 *
	 */
	public Airport(String airportName, String airportLocation, String airportCode) {
		super();
		this.airportName = airportName;
		this.airportLocation = airportLocation;
		this.airportCode = airportCode;
	}
    /**
     * Getters are used to return its Value.
     * 
     */
	public String getAirportName() {
		return airportName;
	}

	public String getAirportLocation() {
		return airportLocation;
	}

	public String getAirportCode() {
		return airportCode;
	}
    /**
     *Method Name : toString
     *             This is used to override the toString() method.
     *@return String
     *
     */
	@Override
	public String toString() {
		return "\n airportName : " + airportName + "\n airportLocation : " + airportLocation + "\n airportCode : "
				+ airportCode;
	}

}
