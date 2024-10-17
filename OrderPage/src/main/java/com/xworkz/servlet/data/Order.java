package com.xworkz.servlet.data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/order")
public class Order extends HttpServlet {
	
	public Order()
	{
		System.out.println("created order");
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

		String name=arg0.getParameter("customerName");
		String item=arg0.getParameter("item");
		String quantity=arg0.getParameter("quantity");
		System.out.println(name);
		System.out.println(item);
		System.out.println(quantity);
		
		
		PrintWriter print= arg1.getWriter();
		print.println("order success");
	}

}
