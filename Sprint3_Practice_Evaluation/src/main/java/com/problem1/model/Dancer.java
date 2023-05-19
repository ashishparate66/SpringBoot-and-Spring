package com.problem1.model;

import org.springframework.stereotype.Component;

@Component
public class Dancer implements ArtistManagement {

	@Override
	public void annouunceAvailability(String message) {
		// TODO Auto-generated method stub
		System.out.println(message+ " Available for booking now!...");
		
	}

}
