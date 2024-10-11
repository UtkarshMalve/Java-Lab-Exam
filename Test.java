package TestAirline;

import java.io.BufferedReader; 
import java.io.InputStreamReader;
import Exception.*;
import Entity.*;
import Service.*;

public class Test {

	public static void main(String[] args) {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BookingService bookingservice = new BookingService();

		try {
			System.out.println("How Much seats you have to Book?");
			int noSeats = Integer.parseInt(read.readLine());

			for (int i = 0; i < noSeats; i++) {
				System.out.println("Enter Passenger id:");
				int id = Integer.parseInt(read.readLine());
				System.out.println("Enter Passenger name:");
				String name = read.readLine();
				System.out.println("Enter Contact Number");
				String contactNo = read.readLine();
				
				Customer passenger = new Customer(id, name, contactNo);

				System.out.println("Enter Flight id: ");
				int flightId = Integer.parseInt(read.readLine());
				System.out.println("Enter Destination:");
				String destination = read.readLine();
				System.out.println("Enter Departure Time:");
				String departureTime = read.readLine();
				System.out.println("Enter Seats Available For this flight:");
				int seatsAvailable = Integer.parseInt(read.readLine());
				System.out.println("Enter Price for one Ticket");
				int ticketPrice = Integer.parseInt(read.readLine());
				
				Flight flight = new Flight(flightId, destination, ticketPrice, seatsAvailable, departureTime);

				Booking booking = new Booking(passenger, flight);

				bookingservice.add(booking);

				booking.displayAllBooking();

			}
			bookingservice.saveAllDetailsToFile("D:\\Utkarsh Airline.txt");

			bookingservice.displayAllBooking();

		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (seatsAvailableException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
