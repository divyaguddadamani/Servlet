package com.java.ticketBook.repository;

import com.java.ticketBook.dto.TicketDto;

public interface TicketRepo {
	
	int save(TicketDto dto);

}
