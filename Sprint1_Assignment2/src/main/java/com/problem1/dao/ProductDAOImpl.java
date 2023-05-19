package com.problem1.dao;

import javax.persistence.EntityManager;

import com.problem1.connection.EMutils;
import com.problem1.dto.Product;
import com.problem1.dto.ProductImpl;

public class ProductDAOImpl implements ProductDAO {
	
	public Product findProductById(int productId) {
		Product p = null;
		EntityManager em = EMutils.getConnection();
		em.getTransaction().begin();
		p = em.find(ProductImpl.class, productId);
		em.getTransaction().commit();
		em.close();
		return p;
	}
}
