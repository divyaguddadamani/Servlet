package com.java.ticketBook.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.ticketBook.dto.TicketDto;
import com.java.ticketBook.service.TicketService;
import com.java.ticketBook.serviceImpl.TicketImpl;

@WebServlet(loadOnStartup = 1,urlPatterns = "/book")
public class TicketServlet  extends HttpServlet{
	
	public TicketServlet() {
		System.out.println("no arg const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String stadiumName=arg0.getParameter("StdiumName");
		String noOfTicket=arg0.getParameter("ticket");
		String contact=arg0.getParameter("number");
		String email=arg0.getParameter("email");
		
		int ref1=Integer.valueOf(noOfTicket);
		long ref2=Long.valueOf(contact);
		
		TicketDto dto=new TicketDto(stadiumName, ref1, ref2, email);
		
		TicketService value=new TicketImpl();
		
	
		
		boolean validate=value.validate(dto);
		
		if(validate)
		{
			System.out.println("details are valid");
			arg0.setAttribute("success", "ticket booked");
			arg0.setAttribute("name", stadiumName);
			
		}
		else
		{
			System.out.println("details are invalid");
			arg0.setAttribute("failure", "invalid info");
			arg0.setAttribute("valid", "validation error");
			arg0.setAttribute("dto1", new TicketDto(ref1, ref2, email));
			arg0.setAttribute("dto", new TicketDto(stadiumName, ref1, ref2, email));
			
		}
		
		RequestDispatcher requestDispatcher=arg0.getRequestDispatcher("/Ticket.jsp");
		requestDispatcher.forward(arg0, arg1);
	}
}
