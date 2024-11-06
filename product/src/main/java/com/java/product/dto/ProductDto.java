package com.java.product.dto;

import javax.servlet.annotation.HandlesTypes;

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
public class ProductDto {

	private String CompanyName;
	private String productName;
	private String ProductType;
	private int ProductQuantity;
	private double ProductCost;
	
	public ProductDto(String companyName, String productName, String productType) {
		super();
		CompanyName = companyName;
		this.productName = productName;
		ProductType = productType;
	}
}
