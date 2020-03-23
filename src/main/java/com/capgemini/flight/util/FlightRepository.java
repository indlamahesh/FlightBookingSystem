package com.capgemini.flight.util;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.flight.entity.Airport;
import com.capgemini.flight.entity.Bookings;
import com.capgemini.flight.entity.Flight;
import com.capgemini.flight.entity.Passenger;
import com.capgemini.flight.entity.Schedule;
import com.capgemini.flight.entity.ScheduledFlight;
import com.capgemini.flight.entity.User;

public class FlightRepository {

	public static Map<Integer, ScheduledFlight> scheduleflight = new HashMap<>();
	public static Map<BigInteger, Bookings> bookingmap = new HashMap<>();
	public static List<Passenger> lst = new ArrayList<>();
	public static Map<Integer, User> userdetails = new HashMap<>();

	static {

		User user1 = new User("User ", BigInteger.valueOf(110001), "Mahesh", "@Mahe23");
		User user2 = new User("User ", BigInteger.valueOf(110002), "himanshu", "$RAI21");
		User user3 = new User("User ", BigInteger.valueOf(110003), "Nishant", "@$NIShant");
		User user4 = new User("Admin ", BigInteger.valueOf(110004), "Dipesh", "dip123");
		User user5 = new User("User ", BigInteger.valueOf(110005), "Aman", "#aman");
		userdetails.put(110001, user1);
		userdetails.put(110002, user2);
		userdetails.put(110003, user3);
		userdetails.put(110004, user4);
		userdetails.put(110005, user5);

		Flight flight1 = new Flight(BigInteger.valueOf(1001), "Air India ", 310);
		Flight flight2 = new Flight(BigInteger.valueOf(1002), " Spice jet ", 250);
		Flight flight3 = new Flight(BigInteger.valueOf(1003), "IndiGo ", 200);
		Flight flight4 = new Flight(BigInteger.valueOf(1004), "vistra ", 310);
		Flight flight5 = new Flight(BigInteger.valueOf(1005), "Air India ", 230);
		Flight flight6 = new Flight(BigInteger.valueOf(1005), "IndiGo ", 230);

		Airport airport1 = new Airport("Chandigarh Airport ", "Chandigarh ", "IXC ");
		Airport airport2 = new Airport("Bengaluru International Airport ", "Bengaluru", "BLR");
		Airport airport3 = new Airport("Bhopal Airport", "Bhopal", "BHO");
		Airport airport4 = new Airport("chennai International Airport", "Chennai", "MAA");
		Airport airport5 = new Airport("indira Gandhi International Airport", " New Delhi", "DEL");
		Airport airport6 = new Airport("Patna Airport", "Patna", "PAT");

		Schedule schedule1 = new Schedule(airport1, airport2, LocalDateTime.of(2020, 03, 10, 01, 30),
				LocalDateTime.of(2020, 03, 10, 03, 30), 1500);
		Schedule schedule2 = new Schedule(airport2, airport5, LocalDateTime.of(2020, 02, 20, 01, 30),
				LocalDateTime.of(2020, 02, 20, 02, 30), 2000);
		Schedule schedule3 = new Schedule(airport5, airport2, LocalDateTime.of(2020, 02, 19, 01, 30),
				LocalDateTime.of(2020, 02, 19, 02, 30), 3000);
		Schedule schedule4 = new Schedule(airport5, airport6, LocalDateTime.of(2020, 02, 23, 01, 30),
				LocalDateTime.of(2020, 02, 23, 03, 30), 1000);
		Schedule schedule5 = new Schedule(airport3, airport4, LocalDateTime.of(2020, 02, 24, 01, 30),
				LocalDateTime.of(2020, 02, 24, 04, 30), 2000);
		Schedule schedule6 = new Schedule(airport4, airport5, LocalDateTime.of(2020, 02, 23, 03, 30),
				LocalDateTime.of(2020, 02, 23, 06, 30), 3000);

		ScheduledFlight sflight1 = new ScheduledFlight(flight1, 50, schedule1);
		ScheduledFlight sflight2 = new ScheduledFlight(flight2, 50, schedule2);
		ScheduledFlight sflight3 = new ScheduledFlight(flight3, 50, schedule4);
		ScheduledFlight sflight4 = new ScheduledFlight(flight4, 50, schedule6);
		ScheduledFlight sflight5 = new ScheduledFlight(flight5, 50, schedule5);
		ScheduledFlight sflight6 = new ScheduledFlight(flight6, 50, schedule3);
		scheduleflight.put(1110, sflight1);
		scheduleflight.put(1111, sflight2);
		scheduleflight.put(1112, sflight3);
		scheduleflight.put(1113, sflight4);
		scheduleflight.put(1114, sflight5);
		scheduleflight.put(1115, sflight6);

		Bookings book = new Bookings(BigInteger.valueOf(4861341), user1, lst, LocalDate.now(), sflight1, 3, 1500);
		Bookings book1 = new Bookings(BigInteger.valueOf(4861341), user2, lst, LocalDate.now(), sflight2, 4, 2000);
		Bookings book2 = new Bookings(BigInteger.valueOf(4861341), user3, lst, LocalDate.now(), sflight3, 2, 3000);

		bookingmap.put(book.getBookingId(), book);
		bookingmap.put(book1.getBookingId(), book1);
		bookingmap.put(book2.getBookingId(), book2);

	}

	public static Map<BigInteger, Bookings> getBookings() {
		return bookingmap;
	}

	public static Map<Integer, User> getUser() {
		return userdetails;

	}

	public static Map<Integer, ScheduledFlight> getScheduledFlight() {
		return scheduleflight;
	}

}
