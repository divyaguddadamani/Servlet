package com.java.jet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/run")
public class JetServlet extends HttpServlet {
	
public JetServlet()
{
	System.out.println("created jet servlet");
}

@Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	System.out.println("running service in jetservlet");
	
}


}
