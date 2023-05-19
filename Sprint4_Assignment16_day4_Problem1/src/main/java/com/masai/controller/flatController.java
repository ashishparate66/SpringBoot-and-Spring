package com.masai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Flat;
import com.masai.service.FlatService;

import jakarta.validation.Valid;

@RestController
public class flatController {

	@Autowired
	private FlatService flatServices;
	
	
	@PostMapping("/flats")
	public ResponseEntity<Flat> registerFlatHandler(@Valid @RequestBody Flat flat){
		
		Flat registerFlat = flatServices.saveFlat(flat);
		
		return new ResponseEntity<>(registerFlat, HttpStatus.CREATED);
	}
	
	
	
//	@GetMapping("/flats/{price}")
//	public ResponseEntity<List<Flat>> getFlatByPriceLessThan(@PathVariable("price") Integer price){
//		
//		List<Flat> flats = flatServices.findFlatByPriceLessThan(price);
//		
//		return new ResponseEntity<>(flats,HttpStatus.OK);
//	}
//	
//	
//	
//	@GetMapping("/getflatsEqual/{price}")
//	public ResponseEntity<List<Flat>> getFlatByPriceLessThanEqual(@PathVariable("price") Integer price){
//		
//		List<Flat> flats = flatServices.findFlatByPriceLessThanEqualTo(price);
//		
//		return new ResponseEntity<>(flats,HttpStatus.OK);
//	}
//	
//	
//	
//	@GetMapping("/getflatsGreater/{price}")
//	public ResponseEntity<List<Flat>> getFlatByPriceGreterThan (@PathVariable("price") Integer price){
//		
//		List<Flat> flats = flatServices.findFlatByPriceGreaterThan(price);
//		
//		return new ResponseEntity<>(flats,HttpStatus.OK);
//		
//	}
	
//	
//	@GetMapping("/getflatsBetween/{s_price}/{e_price}")
//	public ResponseEntity<List<Flat>> getFlatByPriceBetween(@PathVariable("s_price") Integer s_price, @PathVariable("e_price") Integer e_price){
//	
//		List<Flat> flats = flatServices.findFlatByPriceBetween(s_price, e_price);
//		
//		return new ResponseEntity<>(flats,HttpStatus.OK);
//	
//	}
	
}
