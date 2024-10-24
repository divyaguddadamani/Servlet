package com.java.registration.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.registration.dto.RegisterDto;
import com.java.registration.service.RegisterService;
import com.java.registration.serviceImplement.RegisterServiceImp;

@WebServlet(loadOnStartup = 1,urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
	
	public RegisterServlet() {
		System.out.println("no arg const");
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
      
		String name=arg0.getParameter("name");
		String email=arg0.getParameter("email");
		String age=arg0.getParameter("age");
		String city=arg0.getParameter("city");
		String state=arg0.getParameter("state");
		String country=arg0.getParameter("country");
		
		int ref=Integer.valueOf(age);
		
		RegisterDto dto =new RegisterDto(name, email, ref, city, state, country);
		
		RegisterService service =new RegisterServiceImp();
		boolean isvalid=service.validateAndSave(dto);
		
		if(isvalid) {
			System.out.println("details are valid");
			arg0.setAttribute("success", "registration completed");
			
			
			}
			else {
				System.out.println("details are invalid");
				arg0.setAttribute("failure", "registration is incompleted");
			
				
			}
		RequestDispatcher requestDispatcher=arg0.getRequestDispatcher("/Registration.jsp");
		requestDispatcher.forward(arg0, arg1);
	}

}
