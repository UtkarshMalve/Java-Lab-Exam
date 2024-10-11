package Entity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Exception.BookingException;

public class Booking {

	private Customer passenger;
	private Flight flight;

	public Booking(Customer passenger, Flight flight)  {
		
		this.passenger = passenger;
		this.flight = flight;
		
	}
	

	public double getTotalPrice() {
		return flight.getTicketPrice();
	}

	public void SaveDetailsToFile(String filename) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
			System.out.println("\n========Airline Booking System=======\n");
			writer.write(passenger.toString());
			writer.newLine();
			writer.write(flight.toString());
			writer.newLine();
			writer.write("-------------------------");
			writer.newLine();
			System.out.println("Booking saved to file: " + filename);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	public void displayAllBooking() {
		System.out.println("Passdenger Details:\n");
		System.out.println(passenger.toString() + "\n");
		System.out.println("---------------------------------------------------------");
		System.out.println("Flight Details:\n");
		System.out.println(flight.toString());
	}

}
