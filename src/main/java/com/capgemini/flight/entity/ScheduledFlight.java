package com.capgemini.flight.entity;
/**
 * The {@code ScheduleFlight} Class specifies the details of Flight and it's Schedule
 * 
 * @author Indla Mahesh
 *
 */
public class ScheduledFlight {
	private Flight flight;
	private Integer availableSeats;
	private Schedule schedule;

	public ScheduledFlight() {
		super();

	}

	/**
	 * 
	 * @param flight
	 * @param availableSeats
	 * @param schedule
	 */
	
	/**
	 * Parameterized Constructor :  It is a code that initializes instance variable.
	 *
	 */
	public ScheduledFlight(Flight flight, Integer availableSeats, Schedule schedule) {
		super();
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}
	/**
	  * 
	  * getters and Setters are used for binding data.
      */
	public Flight getFlight() {
		return flight;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public Schedule getSchedule() {
		return schedule;
	}
	/**
     *Method Name : toString
     *             This is used to override the toString() method.
     *@return String
     *
     */
	@Override
	public String toString() {
		return "\nflight :" + flight + "\navailableSeats :" + availableSeats + "\nschedule :" + schedule;
	}

}
