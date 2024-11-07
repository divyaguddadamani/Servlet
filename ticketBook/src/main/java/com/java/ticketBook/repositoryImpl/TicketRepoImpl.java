package com.java.ticketBook.repositoryImpl;

import com.java.ticketBook.dto.TicketDto;
import com.java.ticketBook.repository.TicketRepo;

public class TicketRepoImpl  implements TicketRepo{

	@Override
	public int save(TicketDto dto) {
		System.out.println("running save in TicketRepoImpl");
		System.out.println("Database  connected");
		return 1;
	}

}
