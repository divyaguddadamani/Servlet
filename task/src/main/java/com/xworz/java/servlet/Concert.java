package com.xworz.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworz.java.dto.Concertdto;

@WebServlet(loadOnStartup = 1,urlPatterns = "/get")
public class Concert  extends HttpServlet{
	public Concert() {
		System.out.println("no args const");
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html");
		String location=arg0.getParameter("location");
		String artistname=arg0.getParameter("artistName");
		String tickettype=arg0.getParameter("ticketType");
		String noofticket=arg0.getParameter("noOfTickets");
		String preferencetype=arg0.getParameter("preference");
		
		int ref1 =Integer.valueOf(noofticket);
		
	
		Concertdto dto2=new Concertdto(location, artistname, tickettype, ref1, preferencetype);
		System.out.println(""+location+""+ artistname+""+tickettype+""+ ref1+""+ ""+preferencetype+"");
		PrintWriter printer=arg1.getWriter();
		printer.println("booked successfully");
	}

}
