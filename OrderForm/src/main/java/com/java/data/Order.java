package com.java.data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/order")
public class Order extends HttpServlet{
	
	public Order() {
		System.out.println("no arg const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String name=arg0.getParameter("item");
		String quantity=arg0.getParameter("quantity");
		String price=arg0.getParameter("price");
		
		
		boolean valid=true;
		arg1.containsHeader("html/text");
		PrintWriter printer=arg1.getWriter();
		printer.print("<html>");
		printer.print("<body>");
		 if(quantity!=null) {
			int ref1 =Integer.parseInt(quantity);
			if(ref1>0) {
				printer.print("quantity is valid"+"<br>");
				
			}
			else {
				valid=false;
				printer.print("<span style=\"color:red;\">");
				printer.print("quantity is in-valid"+"<br>");
				printer.print("</span>");
			}
		 }
			 if( valid&&price!=null) {
					int ref2 =Integer.parseInt(price);
					if(ref2>20) {
						printer.print("price is valid"+"<br>");
						
					}
					else {
						valid=false;
						printer.print("<span style=\"color:red;\">");
						printer.print("price is in-valid"+"<br>");
						printer.print("</span>");
					}
					
		 }
	

   if (valid) {
	   printer.print("order placed");
   }

   printer.print("</body>");
   printer.print("</html>");
		
	}
}
