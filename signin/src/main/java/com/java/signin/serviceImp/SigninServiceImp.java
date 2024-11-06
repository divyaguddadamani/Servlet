package com.java.signin.serviceImp;

import com.java.signin.dto.SigninDto;
import com.java.signin.service.SinginService;

public class SigninServiceImp  implements SinginService{

	@Override
	public boolean validate(SigninDto dto) {
		
		boolean valid=true;
		if(dto!=null)
		{
		String userId=dto.getId();
		if(userId!=null&& !userId.isEmpty()&&userId.length()>3&&userId.length()<=100)
		{
			System.out.println("user id is valid ");
			
		}
		else {
			valid=false;
			System.out.println("user id is invalid");
			
		}
		
		
		System.out.println("=============================");
		
		 String email=dto.getEmail();
		 if (email != null && email.contains("@") && 
			        (email.endsWith(".com") || email.endsWith(".in")) && email.length()>=6 && email.length()<=500) {
			 System.out.println("email is valid");
			
		 }
		 else {
			 valid=false;
			 System.out.println("email is in valid");
			  
			
		 }
		
		 System.out.println("================================");
		 
		 String password=dto.getPassword();
		 String confirm=dto.getConfirmPassword();
		 
		 if(password!=null&&!password.isEmpty()&&password.length()>3&&password.length()<=10&& confirm.equals(password))
		 {
			 System.out.println("valid password");
		 }
		 else {
			 valid =false;
			 System.err.println("invalid password");
			
		 }
		 
		}
		return valid;
		
	}

}
