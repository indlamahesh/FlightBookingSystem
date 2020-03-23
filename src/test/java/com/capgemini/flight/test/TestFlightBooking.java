package com.capgemini.flight.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capgemini.flight.entity.Passenger;
import com.capgemini.flight.exception.FlightScheduleException;
import com.capgemini.flight.exception.UserIdException;
import com.capgmini.flight.service.BookingService;
import com.capgmini.flight.service.BookingServiceImpl;

public class TestFlightBooking {
	public static BookingService ser;
	public static Passenger passenger;
	public static List<Passenger> lst;
	
	@BeforeAll
	public static void init() {
		ser=new BookingServiceImpl();
		passenger=new Passenger("Indla mahesh",21,13.0);
		lst=new ArrayList<Passenger>();
	}
	@Test
	@DisplayName("checking user Id in Booking system")
	public void testaddBooking()throws UserIdException{
		assertThrows(UserIdException.class,()->ser.bookTicket(110111,lst,1110),"Invalid UserId");
		
	}
	
	@Test
	@DisplayName("checking scheduleId in Booking system")
	public void testaddBooking2()throws FlightScheduleException{
		assertThrows(FlightScheduleException.class,()->ser.bookTicket(110001,lst,1101),"Invalid Scheduled Id");
		
	}
	
	@Test
	@DisplayName("checking AddBooking")
	public void testaddBooking3()throws UserIdException, FlightScheduleException{
		assertNotNull(ser.bookTicket(110001, lst, 1110));	
		
	}
	
	@Test
	@DisplayName("Cheking pnr number is ")
	public void testaddBooking4() {
		assertTrue(ser.addPNRToPassengers(lst,BigInteger.valueOf(486134)));
	}
	
	
	

}
