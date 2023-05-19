package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Flat;
import com.masai.repository.FlatRepository;

@Service
public class FlatServiceImpl implements FlatService {

	@Autowired
	private FlatRepository flatRepository;
	
	
	@Override
	public Flat saveFlat(Flat flat) {
		
		System.out.println(flatRepository.getClass().getName());
		Flat saveFlat = flatRepository.save(flat);
		
		return saveFlat;
	}
//
//	@Override
//	public List<Flat> findFlatByPriceLessThan(int price) {
//		
//		List<Flat> flats = flatRepository.findFlatByPriceLessThan(price);
//		
//		if(flats.isEmpty()) {
//			throw new FlatException("Flat does not found : "+price);
//		}else {
//			return flats;
//		}
//	}
//
//	@Override
//	public List<Flat> findFlatByPriceLessThanEqualTo(int price) {
//		
//		List<Flat> flats = flatRepository.findFlatByPriceLessThanEqualTo(price);
//		
//		if(flats.isEmpty()) {
//			throw new FlatException("Flat Does not Found : "+price);
//		}else {
//			return flats;
//		}
//	}
//
//	@Override
//	public List<Flat> findFlatByPriceGreaterThan(int price) {
//		List<Flat> flats = flatRepository.findFlatByPriceGreaterThan(price);
//		
//		if(flats.isEmpty()) {
//			throw new FlatException("Flat Does not Found : "+price);
//		}else {
//			return flats;
//		}
//	}
//
//	@Override
//	public List<Flat> findFlatByPriceBetween(int s_price, int e_price) {
//		List<Flat> flats = flatRepository.findFlatByPriceBetween(s_price, e_price);
//		
//		if(flats.isEmpty()) {
//			throw new FlatException("Flat Does not Found : "+s_price+" to " + e_price);
//		}else {
//			return flats;
//		}
//	}

}
