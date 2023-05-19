package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Product;

import jakarta.annotation.PostConstruct;

@RestController
public class ProductController {

	private List<Product> list = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		list.add(new Product(1,"bisket","food",40,"Grocery"));
		list.add(new Product(2,"soap","bathSoap",100,"HealtCare"));
		list.add(new Product(3,"Apple","fuits",170,"Fruits"));
		list.add(new Product(4,"Cumin","pulces",360,"Grocery"));
		list.add(new Product(5,"Rice","Grocery",470,"Grocery"));
	}
	
	@GetMapping("/products")
	public List<Product> getAllProductHandler(){
		
		return list;
	}
	
	@PostMapping("/products")
	public String addProductHandler(@RequestBody Product product) {
		list.add(product);
		return "product added Succefully "+list;
	}
	
	@GetMapping("/products/{id}")
	public Product getProductByIdHandler(@PathVariable Integer id) {
		
		if(list.isEmpty()) {
			throw new IllegalArgumentException("Product not found "+id);
		}else {
			Product existProduct = list.get(id);
			return existProduct;
		}
	}
	
	@PutMapping("/products/{id}")
	public String updateProductHandler(@PathVariable Integer id, @RequestBody Product product) {
		
		if(list.isEmpty()) {
			throw new IllegalArgumentException("Product not found "+id);
		}
		else {
			Product existProduct = list.get(id);
			list.add(product);
			return "Product  Update Succefully";
			
		}
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProductHandler(@PathVariable Integer id) {
		
		if(list.isEmpty()) {
			throw new IllegalArgumentException("Product not found "+id);
		}
		else {
			list.remove(id);
			return "Product Delete Successfully";
			
		}
	}
	
}
