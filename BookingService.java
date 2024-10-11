package Service;

import java.util.ArrayList;
import java.util.List;
import Entity.*;

public class BookingService {

	private List<Booking> bookings;

	public BookingService() {
		this.bookings = new ArrayList<>();
	}

	public void add(Booking booking) {
		bookings.add(booking);
	}

	public void remove(BookingService bookingservice)
	{
		bookings.remove(bookingservice);
	}
	
	public void displayAllBooking() {
		System.out.println("All Booking Details:");
		for (Booking b : bookings) {
			b.displayAllBooking();
		}
	}

	public void saveAllDetailsToFile(String filename) {
		for (Booking b : bookings) {
			b.SaveDetailsToFile(filename);
		}
	}

}
