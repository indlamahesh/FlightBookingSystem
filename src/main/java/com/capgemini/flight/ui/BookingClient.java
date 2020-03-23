package com.capgemini.flight.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.naming.InvalidNameException;

import com.capgemini.flight.entity.Passenger;
import com.capgemini.flight.exception.AgeException;
import com.capgemini.flight.exception.FlightScheduleException;
import com.capgemini.flight.exception.LuggageException;
import com.capgemini.flight.exception.UserIdException;
import com.capgmini.flight.service.BookingService;
import com.capgmini.flight.service.BookingServiceImpl;

public class BookingClient {
	public static void main(String[] args)
			throws UserIdException, FlightScheduleException, InvalidNameException, AgeException, LuggageException {
		BookingService ser = new BookingServiceImpl();
		List<Passenger> lst = new ArrayList<Passenger>();
		String name = null;
		
		int age;
		double luggage;
		Scanner scan = new Scanner(System.in);
		System.out.println("-------enter the User ID :----------\n ");
		int userId = scan.nextInt();
		System.out.println("--------------Searching for Flight------------------\n");
		ser.getAllscheduleFlight();
		System.out.println("enter the Scheduled Id");
		int scheduleId = scan.nextInt();
		System.out.println("-----Enter the Number of passengers ------\n");
		int numOfPassengers = scan.nextInt();
		for (int i = 0; i < numOfPassengers; i++) {
			System.out.println("----------enter the passenger Details -----------\n");
			System.out.println("Enter the Name : ");
			name = scan.next();
			name += scan.next();
			if (!name.matches("^[a-zA-Z\\s]+$")) {
				throw new InvalidNameException("Enter the valid User Name :");
			}

			System.out.println("Enter the Age : ");
			age = scan.nextInt();

			if (!Integer.toString(age).matches("[0-9]{2}")) {
				throw new AgeException("Enter Valid age :");
			}
			System.out.println("enter the luggage in kg : ");
			luggage = scan.nextDouble();
			if (luggage > 15) {
				throw new LuggageException("Enter Luggage less than 15 Kg : ");
			}
			Passenger passenger = new Passenger(name, age, luggage);
			lst.add(passenger);
		}

		System.out.println("---------------TicketBooked----------" + ser.bookTicket(userId, lst, scheduleId));
		scan.close();
	}

}
