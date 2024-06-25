package com.tnisf.booking;

public class TicketBooking {
	
	//instance variable
	private String name;
	private String movieName;
	private int time;
	
	
	//static variable to track the number of tickets
	static int ticket = 10;
	

	public TicketBooking(String name, String movieName, int time) {
		if (ticket > 0)
		{
			this.name = name;
			this.movieName = movieName;
			this.time = time;
			ticket--; // decrementing number of ticket
			System.out.println("Ticket booked successfully");
		}else {
			System.out.println("No available tickets");
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public static int getTicket() {
		return ticket;
	}


	public static void setTicket(int ticket) {
		TicketBooking.ticket = ticket;
	}


	@Override
	public String toString() {
		return "TicketBooking [name=" + name + ", movieName=" + movieName + ", time=" + time + ", Available tickets= " + TicketBooking.ticket +"]";
	}

}
