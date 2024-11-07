package com.java.ticketBook.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TicketDto {
	
	private String StadiumName;
	private int NoOfTicket;
	private long Contact;
	private String Email;
	
	public TicketDto(int noOfTicket, long contact, String email) {
		super();
		NoOfTicket = noOfTicket;
		Contact = contact;
		Email = email;
	}
	

}
