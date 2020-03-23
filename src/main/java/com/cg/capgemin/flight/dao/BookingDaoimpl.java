package com.cg.capgemin.flight.dao;

import java.math.BigInteger;
import java.util.Map;
import java.util.Set;

import com.capgemini.flight.entity.Bookings;
import com.capgemini.flight.entity.ScheduledFlight;
import com.capgemini.flight.entity.User;
import com.capgemini.flight.exception.BookingIdException;
import com.capgemini.flight.exception.FlightIdException;
import com.capgemini.flight.exception.FlightScheduleException;
import com.capgemini.flight.exception.UserIdException;
import com.capgemini.flight.util.FlightRepository;

/**
 * 
 * @author Indla Mahesh
 * @Discription :This class implements BookingDao Interface and contains methods related to database logic
 * @methods : getUser, addBooking,getBooking
 *
 */
public class BookingDaoimpl implements BookingDao {

	public Map<Integer, User> userdetails = FlightRepository.getUser();

	public Map<Integer, ScheduledFlight> scheduleflightmap = FlightRepository.getScheduledFlight();
	public Map<BigInteger, Bookings> bookingMap = FlightRepository.getBookings();

	@Override
	public User getUser(int userId) throws UserIdException {

		if (!userdetails.containsKey(userId))
			throw new UserIdException("Invalid UserId");

		return userdetails.get(userId);

	}

	@Override
	public ScheduledFlight getScheduledFlight(int scheduleId) throws FlightScheduleException {
		if (!scheduleflightmap.containsKey(scheduleId)) {
			throw new FlightScheduleException("Invalid Scheduled Id");
		} else {
			return scheduleflightmap.get(scheduleId);
		}

	}
	

	@Override
	public boolean addBooking(Integer userId, Bookings booking)
			throws FlightScheduleException, FlightIdException, UserIdException {

		if (!userdetails.containsKey(userId)) {
			throw new UserIdException("Invalid UserId");
		}
		bookingMap.put(BigInteger.valueOf(userId), booking);

		return true;
	}

	public Bookings getBooking(BigInteger bookingID) throws BookingIdException {
		if (!bookingMap.containsKey(bookingID)) {
			throw new BookingIdException("Invalid Booking Id");
		}
		return bookingMap.get(bookingID);
	}

	@Override
	public void getAllScheduledFlight() {
		Set<Integer> set = scheduleflightmap.keySet();
		for (int val : set) {
			System.out.println(val + " " + scheduleflightmap.get(val));
		}

	}

}