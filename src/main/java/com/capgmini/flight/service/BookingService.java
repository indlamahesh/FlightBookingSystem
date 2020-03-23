package com.capgmini.flight.service;

import java.math.BigInteger;
import java.util.List;

import com.capgemini.flight.entity.Bookings;
import com.capgemini.flight.entity.Passenger;
import com.capgemini.flight.exception.FlightScheduleException;
import com.capgemini.flight.exception.UserIdException;

public interface BookingService {

	public Bookings bookTicket(int userId, List<Passenger> passengerList, int scheduleId)
			throws UserIdException, FlightScheduleException;
	public boolean addPNRToPassengers(List<Passenger> lst, BigInteger pnrNumber);
	public double TicketPriceGenerator(int noOfPassengers, double price);
	public BigInteger generateBookingNo();
	public void getAllscheduleFlight();
	
}
