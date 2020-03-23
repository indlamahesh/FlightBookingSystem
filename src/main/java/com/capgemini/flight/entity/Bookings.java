package com.capgemini.flight.entity;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
/**
 * The {@code Bookings} class Represents the Bookings system of Flight management system.
 * 
 * @author Indla Mahesh
 *
 */
public class Bookings {

	private BigInteger bookingId;
	private User userId;
	private List<Passenger> passengerList;
	private LocalDate bookingDate;
	private ScheduledFlight flight;
	private Integer nOfpassengers;
	private double totalCost;
    /**
     * Default Constructor
     */
	public Bookings() {
		super();

	}
	/**
	 * 
	 * @param bookingId
	 *        The booking ID is generated while booking Ticket.
	 *        
	 * @param userId
	 *         login  Userid of User.
	 *         
	 * @param passengerList
	 *        It adds the passenger list to Passenger class
	 *         
	 * @param bookingDate
	 *        It is used to represent the date of booking
	 * @param flight
	 *        It is used to get flight Instance.
	 *        
	 * @param nOfpassengers
	 *        it is used to count the no of passengers.
	 *        
	 * @param totalCost
	 *        It represents the Total cost of ticket.
	 */

	public Bookings(BigInteger bookingId, User userId, List<Passenger> passengerList, LocalDate bookingDate,
			ScheduledFlight flight, Integer nOfpassengers, double totalCost) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.passengerList = passengerList;
		this.bookingDate = bookingDate;
		this.totalCost = totalCost;
		this.flight = flight;
		this.nOfpassengers = nOfpassengers;
	}
 
	/**
     * Getters are used to return its Value.
     * 
     */
	public BigInteger getBookingId() {
		return bookingId;
	}

	public User getUserId() {
		return userId;
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public ScheduledFlight getFlight() {
		return flight;
	}

	public Integer getnOfpassengers() {
		return nOfpassengers;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public double getTotalCost() {
		return totalCost;
	}
    /**
     * Method Name : toString
     *             This is used to override the toString() method.
     *@return String
     */
	@Override
	public String toString() {
		return "\n Booking Id : \t" + bookingId + "\n UserId : \t" + userId + "\n pseernger List : \t" + passengerList
				+ "" + "\nBooking Date : \t" + bookingDate + "\nFlight : " + flight + "\n No of Passengers : "
				+ nOfpassengers + "\nTotal Cost : " + totalCost;
	}

}
