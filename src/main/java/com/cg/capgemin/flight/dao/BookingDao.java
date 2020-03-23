package com.cg.capgemin.flight.dao;

import java.math.BigInteger;

import com.capgemini.flight.entity.Bookings;
import com.capgemini.flight.entity.ScheduledFlight;
import com.capgemini.flight.entity.User;
import com.capgemini.flight.exception.BookingIdException;
import com.capgemini.flight.exception.FlightIdException;
import com.capgemini.flight.exception.FlightScheduleException;
import com.capgemini.flight.exception.UserIdException;

public interface BookingDao {

	public User getUser(int userId) throws UserIdException;

	public boolean addBooking(Integer userId, Bookings booking)
			throws FlightScheduleException, FlightIdException, UserIdException;

	public ScheduledFlight getScheduledFlight(int ScheduleId) throws FlightScheduleException;

	public Bookings getBooking(BigInteger bookingID) throws BookingIdException;

	public void getAllScheduledFlight();

}
