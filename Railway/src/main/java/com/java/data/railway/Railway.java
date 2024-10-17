package com.java.data.railway;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/book")
public class Railway extends HttpServlet {

	public Railway() {
		System.out.println("railway is created");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

		String name=arg0.getParameter("name");
		String source=arg0.getParameter("source");
		String destination=arg0.getParameter("destination");
		String start=arg0.getParameter("start");
		String end=arg0.getParameter("return");
		String type=arg0.getParameter("type");
		String ticket=arg0.getParameter("ticket");
		String male=arg0.getParameter("male");
		String female=arg0.getParameter("female");
	
		
		System.out.println(name);
		System.out.println(source);
		System.out.println(destination);
		System.out.println(start);
		System.out.println(end);
		System.out.println(type);
		System.out.println(ticket);
		System.out.println(male);
		System.out.println(female);

		
		PrintWriter printWriter= arg1.getWriter();
		printWriter.print("<html>");
		printWriter.print("<head>");
		printWriter.print("<title>"+"X-workz"+"</title>");
		printWriter.print("<body>");
		printWriter.print("<h1>"+"Railway Form"+"<h1>");
		printWriter.print("<form>");
		printWriter.print(name+"<br>");
		printWriter.print(source+"<br>");
		printWriter.print(destination+"<br>");
		printWriter.print(start+"<br>");
		printWriter.print(end+"<br>");
		printWriter.print(type+"<br>");
		printWriter.print(ticket+"<br>");
		printWriter.print(male+"<br>");
		printWriter.print(female+"<br>");
		printWriter.print("</form>");
		printWriter.print("<body>");

		printWriter.print("booked successfully");

		
	}
}
