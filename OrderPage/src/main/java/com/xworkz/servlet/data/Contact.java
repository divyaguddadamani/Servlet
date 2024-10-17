package com.xworkz.servlet.data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/submit")
public class Contact extends HttpServlet{
	
	public  Contact() {
		System.out.println("contact created");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String name=arg0.getParameter("name");
		String email=arg0.getParameter("email");
		String phone=arg0.getParameter("phone");
		String age=arg0.getParameter("age");
		String address=arg0.getParameter("address");
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(age);
		System.out.println(address);
	
		PrintWriter print= arg1.getWriter();
		print.println("contact saved");
		
		
	}

}
