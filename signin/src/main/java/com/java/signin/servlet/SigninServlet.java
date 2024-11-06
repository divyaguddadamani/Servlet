package com.java.signin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.java.signin.dto.SigninDto;
import com.java.signin.service.SinginService;
import com.java.signin.serviceImp.SigninServiceImp;

@WebServlet(loadOnStartup = 1,urlPatterns = "/signin")
public class SigninServlet extends HttpServlet{
	 
	public SigninServlet() {
		System.out.println("no args const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		String id=arg0.getParameter("id");
		String email=arg0.getParameter("email");
		String password=arg0.getParameter("password");
		String confirm=arg0.getParameter("confirm");
		

		SigninDto dto=new SigninDto(id, email, password, confirm);
		
		SinginService service=new SigninServiceImp();
		boolean isvalid=service.validate(dto);
		
		if(isvalid)
		{
			System.out.println("signup success");
			arg0.setAttribute("dto", new SigninDto(id, email));
			arg0.setAttribute("success", "signin completed");
			arg0.setAttribute("id", id);
			arg0.setAttribute("hi", "Hi");
			
		}
		else
		{
			System.out.println("detail are invalid");
			arg0.setAttribute("failure", "signin incomplete");
			arg0.setAttribute("dto", new SigninDto(id, email));
			arg0.setAttribute("info", new SigninDto(id, email, password, confirm));
			
		}
		
		
		RequestDispatcher requestDispatcher=arg0.getRequestDispatcher("/Signin.jsp");
		requestDispatcher.forward(arg0, arg1);
		
	}
}
