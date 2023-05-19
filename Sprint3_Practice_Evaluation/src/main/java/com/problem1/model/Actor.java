package com.problem1.model;

import org.springframework.stereotype.Component;

@Component
public class Actor implements ArtistManagement {

	@Override
	public void annouunceAvailability(String message) {
		System.out.println(message+" Available for booking now....");
		
	}

}
