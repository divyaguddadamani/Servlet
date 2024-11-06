package com.java.product.serviceImpl;

import com.java.product.dto.ProductDto;
import com.java.product.service.ProductService;

public class ProductImpl implements ProductService{

	@Override
	public boolean validate(ProductDto dto) {
		boolean valid=true;
		
		if(dto!=null)
		{
			String CompanyName=dto.getCompanyName();
			if(CompanyName!=null&& !CompanyName.isEmpty()&&CompanyName.length()>5&&CompanyName.length()<=500)
			{
				System.out.println("valid");
			}
			else
			{
				valid=false;
				System.out.println("invalid");
			}
			
			String ProductName=dto.getProductName();
			if(ProductName!=null&& !ProductName.isEmpty()&&ProductName.length()>5&&ProductName.length()<=500)
			{
				System.out.println("valid");
			}
			else
			{
				valid=false;
				System.out.println("invalid");
			}
			
			int Quantity=dto.getProductQuantity();
			if(Quantity>0&&Quantity<=10)
			{
				System.out.println("valid");
			}
			else
			{
				valid=false;
				System.out.println("invalid");
			}
			
			double cost=dto.getProductCost();
			if(cost>100)
			{
				System.out.println("valid");
			}
			else
			{
				valid=false;
				System.out.println("invalid");
			}
			
		}
		
		return valid;
	}

}
