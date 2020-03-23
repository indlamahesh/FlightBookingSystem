package com.capgmini.flight.service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.capgemini.flight.entity.Bookings;
import com.capgemini.flight.entity.Passenger;
import com.capgemini.flight.entity.ScheduledFlight;
import com.capgemini.flight.entity.User;
import com.capgemini.flight.exception.BookingIdException;
import com.capgemini.flight.exception.FlightScheduleException;
import com.capgemini.flight.exception.UserIdException;
import com.capgemini.flight.util.FlightRepository;
import com.cg.capgemin.flight.dao.BookingDao;
import com.cg.capgemin.flight.dao.BookingDaoimpl;

/**
 * @author Indla Mahesh
 * 
 * @Discription : This class implements service interface methods and logic
 *              related to application
 * 
 * 
 */
public class BookingServiceImpl implements BookingService {
	private BookingDao dao = new BookingDaoimpl();
	public static Map<BigInteger, Bookings> bookingMap = FlightRepository.getBookings();
    
	@Override
	public Bookings bookTicket(int userId, List<Passenger> passengerList, int scheduleId)
			throws UserIdException, FlightScheduleException {
        
		User user = dao.getUser(userId);
		ScheduledFlight schedule = dao.getScheduledFlight(scheduleId);
		BigInteger bookingId = generateBookingNo();

		double totalCost = TicketPriceGenerator(passengerList.size(), schedule.getSchedule().getTicketCost());
		LocalDate localdate = LocalDate.now();
		Integer numOfPassengers = passengerList.size();
		addPNRToPassengers(passengerList, bookingId);
		Bookings booking = new Bookings(bookingId, user, passengerList, localdate, schedule, numOfPassengers,
				totalCost);
		bookingMap.put(booking.getBookingId(), booking);
		return booking;

	}

	@Override
	public boolean addPNRToPassengers(List<Passenger> lst, BigInteger pnrNumber) {
		lst.forEach(passenger -> passenger.setPnrNumber(pnrNumber));
		return true;
	}

	@Override
	public BigInteger generateBookingNo() {
		Random rand = new Random();
		boolean flag = true;
		long bookingId = 0;
		int num = 0;
		do {
			num = 100000;
			bookingId = rand.nextInt(num);
			try {
				dao.getBooking(BigInteger.valueOf(num));
			} catch (BookingIdException e) {
				flag = false;
			}

		} while (flag);
		return BigInteger.valueOf(bookingId);
	}

	public double TicketPriceGenerator(int noOfPassengers, double price) {

		double totalCost = 0.0;
		totalCost = noOfPassengers * price;
		return totalCost;

	}

	@Override
	public void getAllscheduleFlight() {
		dao.getAllScheduledFlight();

	}

	public Passenger getBookingId(BigInteger bookingId) {

		return null;
	}
}
