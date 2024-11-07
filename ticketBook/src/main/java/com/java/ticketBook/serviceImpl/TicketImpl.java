package com.java.ticketBook.serviceImpl;

import com.java.ticketBook.dto.TicketDto;
import com.java.ticketBook.repository.TicketRepo;
import com.java.ticketBook.repositoryImpl.TicketRepoImpl;
import com.java.ticketBook.service.TicketService;

public class TicketImpl implements TicketService{

	@Override
	public boolean validate(TicketDto dto) {
		boolean valid=true;
		
		if(dto!=null) {
			
			int noOfTicket=dto.getNoOfTicket();
			if(noOfTicket!=0&&noOfTicket>0&&noOfTicket<=10) {
				System.out.println("valid");
			}
			else
			{	valid=false;
				System.out.println("invalid");
			}
			
			long contact=dto.getContact();
			if(contact!=0&&contact>=10)
			{
				System.out.println("valid contact");
			}
			else
			{
				valid=false;
				System.out.println("invalid conatact");
			}
			
			String email=dto.getEmail();
			 if (email != null && email.contains("@") && 
				        (email.endsWith(".com") || email.endsWith(".in")) && email.length()>=3 && email.length()<=500) 
			 {
				 System.out.println("email is valid");
			 }
			 else
			 {
				 valid=false;
				 System.out.println("email is invalid");
			 }
		}
			 if(valid)
			 {
				 System.out.println("save data into db");
				 TicketRepo repo=new TicketRepoImpl();
				 int pk=repo.save(dto);
				 if(pk>0)
				 {   valid=true;
					 System.out.println("data saved into db");
					 
				 }
				 else
				 {		valid=false;
					 System.out.println("data is not saved");
				 }
			 }
			
		
		
		
		return valid;
		
	}
	

}
