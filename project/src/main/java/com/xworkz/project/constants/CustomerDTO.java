package com.xworkz.project.constants;

public class CustomerDTO {

	String name;
	String email;
	ProductType productType;
	
	public CustomerDTO(String name, String email, ProductType productType) {
		super();
		this.name = name;
		this.email = email;
		this.productType = productType;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public ProductType getProductType() {
		return productType;
	}
	
}
