package com.masai.service;

import java.util.List;

import com.masai.model.Flat;

public interface FlatService {

	public Flat saveFlat(Flat flat);
	
	
	public List<Flat> getAllFlats();
	
	public List<Flat> findFlatByPriceLessThan(Integer price);

	
	public List<Flat> findFlatByPriceLessThanEqualTo(int price);

	
	public List<Flat> findFlatByPriceGreaterThan(int price);


	public List<Flat> findFlatByPriceBetween(int s_price,int e_price);
}
