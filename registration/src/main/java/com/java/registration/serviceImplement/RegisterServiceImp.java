package com.java.registration.serviceImplement;

import com.java.registration.dto.RegisterDto;
import com.java.registration.service.RegisterService;

public class RegisterServiceImp implements RegisterService {

	@Override
	public boolean validateAndSave(RegisterDto dto) {
		
		boolean valid=true;
		if(dto!=null) {
		  String name= dto.getName();
		 if (name!= null && !name.isEmpty()&& name.length()>=3 && name.length()<=100) {
	            System.out.println("name is  valid");
	           
	        }
		 else {
			 System.out.println("name is  not valid");
			 valid=false;
		 }
		 
		 System.out.println("================");
		 
		 String email=dto.getEmail();
		 if (email != null && email.contains("@") && 
			        (email.endsWith(".com") || email.endsWith(".in")) && email.length()>=6 && email.length()<=500) {
			 System.out.println("email is valid");
			
		 }
		 else {
			 System.out.println("email is in valid");
			  valid=false;
			
		 }
		 int age = dto.getAge();
		    if (age >= 18 && age <= 60) {
		        System.out.println("Age is valid.");
		       
		    } else {
		        System.out.println(" Age is in valid");
		        valid=false;
		    }
		}
		return valid;
	}

}
