package com.xworkz.project.constants.runner;

import com.xworkz.project.constants.CustomerDTO;
import com.xworkz.project.constants.ProductType;
import com.xworkz.project.constants.SeatType;
import com.xworkz.project.constants.TicketBookDTO;
import com.xworkz.project.constants.TicketType;

public class Runner {

	public static void main(String[] args) {
		CustomerDTO customer =new CustomerDTO("divya", "divya@gamil.com", ProductType.KITCHEN);
		String name=customer.getName();
		String email=customer.getEmail();
		ProductType product =customer.getProductType();
		System.out.println("Customer name is:"+name);
		System.out.println("Customer email is:"+email);
		System.out.println("ProductType:"+product);
		
		System.out.println("===============================");
		
		TicketBookDTO dto= new TicketBookDTO("stree 2", "pvr", TicketType.OFFLINE, SeatType.EXECUTIVE);
		String MovieName=dto.getMovieName();
		String theaterName=dto.getTheaterName();
		TicketType TicketType=dto.getTicketType();
		SeatType SeatType=dto.getSeatType();
		System.out.println("movie name is:"+MovieName);
		System.out.println("theater name is:"+theaterName);
		System.out.println("ticket type:"+TicketType);
		System.out.println("seat type is:"+SeatType);

		System.out.println("===============================");
		
		

	}

}
