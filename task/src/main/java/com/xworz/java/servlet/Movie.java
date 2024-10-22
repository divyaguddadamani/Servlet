package com.xworz.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworz.java.dto.Moviedto;

@WebServlet(loadOnStartup = 1,urlPatterns = "/book")
public class Movie extends HttpServlet {
	
	public Movie() {
		System.out.println("no arg const");
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html");
		String name=arg0.getParameter("name");
		String totalTickets=arg0.getParameter("ticket");
		String theaterName=arg0.getParameter("theaterName");
		String seatType=arg0.getParameter("seatType");
		String donation=arg0.getParameter("donation");
		String date=arg0.getParameter("date");
		String time=arg0.getParameter("time");
		
		
		int ref1=Integer .valueOf(totalTickets);
		int ref2=Integer.valueOf(donation);
		
	

		Moviedto dto=new Moviedto(name, ref1, theaterName, seatType, ref2, date, time);
		
		System.out.println(""+name+""+ ref1+""+ theaterName+""+ seatType+""+ ref2+""+ date+""+"" +time+"");
		
		PrintWriter printer=arg1.getWriter();
		printer.println("booked successfully");
		
	}
}
