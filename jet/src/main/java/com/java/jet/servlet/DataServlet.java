package com.java.jet.servlet;


	import java.io.IOException;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet(loadOnStartup = 1,urlPatterns = "/send")
	public class DataServlet extends HttpServlet{
		public DataServlet()
		{
			System.out.println("no arg const");
		}

		protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			System.out.println("run service");
			

			
			String name=arg0.getParameter("customer");
			String email=arg0.getParameter("email");
			System.out.println(name);
			System.out.println(email);
		}

	

}
