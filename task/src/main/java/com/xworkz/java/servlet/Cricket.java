package com.xworkz.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.java.dto.Cricketdto;
import com.xworkz.java.implement.CricketImpl;
import com.xworkz.java.interfaces.CricketInterface;

@WebServlet(loadOnStartup = 1,urlPatterns = "/Book")
public class Cricket extends HttpServlet {
	public Cricket() {
		System.out.println("no arg const");
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html");
		String groundname=arg0.getParameter("gname");
		String customername=arg0.getParameter("cName");
		String customeremail=arg0.getParameter("cEmail");
		String seatType=arg0.getParameter("seat");
		String noofticket=arg0.getParameter("noOfTicket");
		
		
		int ref1=Integer.valueOf(noofticket);
		
		
		Cricketdto dto3=new Cricketdto(groundname, customername, customeremail, seatType, ref1);
		System.out.println(""+groundname+""+ customername+""+ customeremail+""+seatType+"" +ref1+"");
		
		 CricketInterface cricketInterface = new CricketImpl();
	        boolean valid = cricketInterface.validateCricketBooking(dto3); 
	        if (valid) {
	        	System.out.println("Ticket booked successfully!");
	        } else {
	        	System.out.println("Booking failed ");
	        }
		}

}
