package com.java.registration.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
@EqualsAndHashCode
public class RegisterDto {
	private String name;
	private String email;
	private int age;
	private String city;
	private String state;
    private String country;
    
}
