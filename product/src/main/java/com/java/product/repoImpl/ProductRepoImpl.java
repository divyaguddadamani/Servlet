package com.java.product.repoImpl;

import com.java.product.dto.ProductDto;
import com.java.product.repository.ProductRepo;

public class ProductRepoImpl implements ProductRepo{

	@Override
	public int save(ProductDto dto) {

		System.out.println("running save in ProductRepoImpl");
		System.out.println("Database  connected");
		return 0;
	}

}
