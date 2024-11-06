package com.java.signin.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SigninDto {
	
	public SigninDto(String id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	private String id;
	private String email;
	private String password;
	private String confirmPassword;
	

}
