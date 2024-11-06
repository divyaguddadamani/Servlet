package com.java.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.product.dto.ProductDto;
import com.java.product.service.ProductService;
import com.java.product.serviceImpl.ProductImpl;

@WebServlet(loadOnStartup = 1,urlPatterns = "/submitProduct")
public class ProductServlet extends HttpServlet {
	
	public ProductServlet() {
		System.out.println("no args const");	
		}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		String CompanyName=arg0.getParameter("name");
		String ProductName=arg0.getParameter("productName");
		String Producttype=arg0.getParameter("productType");
		String ProductQuantity=arg0.getParameter("quantity");
		String cost=arg0.getParameter("cost");
		

		int ref1=Integer.valueOf(ProductQuantity);
		double ref2=Double.valueOf(cost);
		
		double totalCost=ref1*ref2;
		
		ProductDto dto=new ProductDto(CompanyName, ProductName, Producttype, ref1, ref2);
		
		ProductService service=new ProductImpl();
		boolean isvalid=service.validate(dto);
		
		if(isvalid)
		{
			System.out.println("details are valid");
			arg0.setAttribute("success", "product details are valid");
			arg0.setAttribute("ProductName", ProductName);
			arg0.setAttribute("totalCost", totalCost);
			
		}
		else
		{
			System.out.println("details are invalid");
			arg0.setAttribute("failure", "product details are invalid");
			arg0.setAttribute("valid", "validation error");
			arg0.setAttribute("value", new ProductDto(CompanyName, ProductName, Producttype));
			arg0.setAttribute("dto", new ProductDto(CompanyName, ProductName, Producttype, ref1, ref2));
		
		}
		RequestDispatcher requestDispatcher=arg0.getRequestDispatcher("/Product.jsp");
		requestDispatcher.forward(arg0, arg1);
	}

}
