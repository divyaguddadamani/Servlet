package com.xworz.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworz.java.dto.Feedbackdto;

@WebServlet(loadOnStartup = 1,urlPatterns = "/send")
public class Feedback extends HttpServlet{

	public Feedback() {
		System.out.println("no arg const");
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html");
		String name=arg0.getParameter("name");
		String email=arg0.getParameter("email");
		String comments=arg0.getParameter("comment");
		

		Feedbackdto dto4=new Feedbackdto(name, email, comments);
		
		System.out.println(""+name+""+email+""+comments+"");
		PrintWriter printer=arg1.getWriter();
		printer.println("feedback sent successfully");
	}
}
