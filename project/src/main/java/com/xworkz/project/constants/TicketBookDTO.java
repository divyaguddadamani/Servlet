package com.xworkz.project.constants;

public class TicketBookDTO {
	String MovieName;
	String theaterName;
	TicketType TicketType;
	SeatType SeatType;
	
	public TicketBookDTO(String movieName, String theaterName, TicketType ticketType, SeatType seatType) {
		super();
		MovieName = movieName;
		this.theaterName = theaterName;
		TicketType = ticketType;
		SeatType = seatType;
	}

	public String getMovieName() {
		return MovieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public TicketType getTicketType() {
		return TicketType;
	}

	public SeatType getSeatType() {
		return SeatType;
	}
	

}
