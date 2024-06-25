package com.tnisf.booking;

public class TicketBooking {
	
	//instance variable
	private String name;
	
	
	//static variable to track the number of tickets
	static int ticket = 10;
	static String movieName= "The Crow";
	static int time = 9;
	
	
	// static method which calls static variable
	static void remainingSeats() {
		ticket--; // decrementing number of ticket using static variable
		System.out.println("Ticket booked successfully");
	}
	
	static {
		System.out.println("-------Welcome to Booking center-------");
	}

	public TicketBooking(String name) {
		if (ticket > 0)
		{
			this.name = name;
			TicketBooking.remainingSeats();
			
		}else {
			System.out.println("No available tickets");
		}
	}

	@Override
	public String toString() {
		return "TicketBooking [name=" + name + ", movieName=" + TicketBooking.movieName + ", time=" + TicketBooking.time + "pm, Available tickets= " + TicketBooking.ticket +"]";
	}

}
