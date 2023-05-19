package com.problem1.dao;

import com.problem1.dto.Product;

public interface ProductDAO {
	
	public Product findProductById(int productId);
}
