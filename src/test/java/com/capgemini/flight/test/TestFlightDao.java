package com.capgemini.flight.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capgemini.flight.dao.BookingDao;
import com.capgemini.flight.dao.BookingDaoimpl;
import com.capgemini.flight.exception.BookingIdException;
import com.capgemini.flight.exception.FlightScheduleException;
import com.capgemini.flight.exception.UserIdException;

public class TestFlightDao {

	BookingDao dao=new BookingDaoimpl();
	
	@Test
	@DisplayName("User Test Case 1")
	public void testUserId()throws UserIdException{
		assertThrows(UserIdException.class,()->{dao.getUser(111001);},"Invalid UserId");
		
	}
	
	@Test
	@DisplayName("User Test Case 2")
	public void testSchedId() throws FlightScheduleException{
		assertThrows(FlightScheduleException.class,()->{dao.getScheduledFlight(11101);},"Invalid Scheduled Id");
		
	}
	@Test
	@DisplayName("User Test Case 3")
	public void testBookingId() throws BookingIdException{
		assertThrows(BookingIdException.class,()->{dao.getBooking(BigInteger.valueOf(486134));},"Invalid Booking Id");
	}
}
