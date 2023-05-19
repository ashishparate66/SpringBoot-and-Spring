package com.problem1.service;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.problem1.model.ArtistManagement;

@Service("eventOraganizerImpl")
@Lazy(value=true)
public class EventOranizerImpl implements Eventorganizer {

	@Autowired(required = false)
	@Qualifier("singer")
	ArtistManagement artistManagement;
	
	
	@Override
	public void findArtist(String message) {
			artistManagement.annouunceAvailability(message);
	}


	public ArtistManagement getArtistManagement() {
		return artistManagement;
	}


	public void setArtistManagement(ArtistManagement artistManagement) {
		this.artistManagement = artistManagement;
	}	
	
	@PostConstruct
	 public void printInfo() {
		 System.out.println("Event date is: "+ LocalDateTime.now());
		 System.out.println("Event venue is: Nagpur");
	 }
	@PreDestroy
	public void ending() {
		System.out.println("Thank you  for attending the event");
	}
}
