package com.xworkz.servlet.data;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/signin")
public class Register extends HttpServlet{

	public Register() {
		System.out.println("register created");
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String firstname=arg0.getParameter("firstname");
		String lastname=arg0.getParameter("lastname");
		String phone=arg0.getParameter("phone");
		String email=arg0.getParameter("email");
		String password=arg0.getParameter("password");
		String confirmPassword=arg0.getParameter("confirmPassword");
		String gender=arg0.getParameter("gender");
		String country=arg0.getParameter("country");
		String state=arg0.getParameter("state");
		String city=arg0.getParameter("city");
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(phone);
		System.out.println(email);
		System.out.println(password);
		System.out.println(confirmPassword);
		System.out.println(gender);
		System.out.println(country);
		System.out.println(state);
		System.out.println(city);
		
		
		PrintWriter print= arg1.getWriter();
		print.println("register successfully");
		
	}
}
