package com.capgemini.flight.entity;

import java.time.LocalDateTime;

/**
 * the {@code Schedule} class Specifies the schedules of flight ,Timings and it's Cost.
 * 
 * @author Indla Mahesh
 *
 */
public class Schedule {

	private Airport sourceAirport;
	private Airport destinationAirport;
	private LocalDateTime arrivalTime;
	private LocalDateTime departureTime;
	private double ticketCost;

	public Schedule() {
		super();

	}
	/**
	 * 
	 * @param sourceAirport
	 * @param destinationAirport
	 * @param arrivalTime
	 * @param departureTime
	 * @param ticketCost
	 */

	
	/**
	 * Parameterized Constructor :  It is a code that initializes instance variable.
	 *
	 */
	public Schedule(Airport sourceAirport, Airport destinationAirport, LocalDateTime arrivalTime,
			LocalDateTime departureTime, double ticketCost) {
		super();
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.ticketCost = ticketCost;
	}



	  /**
	    * 
	    * getters and Setters are used for binding data.
	    */

	public Airport getSourceAirport() {
		return sourceAirport;
	}

	public Airport getDestinationAirport() {
		return destinationAirport;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;

	}

	public double getTicketCost() {
		return ticketCost;
	}

	/**
     *Method Name : toString
     *             This is used to override the toString() method.
     *@return String
     *
     */
	@Override
	public String toString() {
		return "\nsourceAirport :" + sourceAirport + "\ndestinationAirport :" + destinationAirport + "\narrivalTime "
				+ arrivalTime + "\ndepartureTime :" + departureTime + "\n Ticket cost : " + ticketCost;
	}

}
