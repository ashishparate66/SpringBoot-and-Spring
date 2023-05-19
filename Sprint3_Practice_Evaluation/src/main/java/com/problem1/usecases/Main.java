package com.problem1.usecases;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.problem1.service.EventOranizerImpl;
import com.problem1.service.Eventorganizer;
import com.problem1.util.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Eventorganizer eventOranizer = applicationContext.getBean(EventOranizerImpl.class);
		eventOranizer.findArtist("Singer");
		
		((AnnotationConfigApplicationContext) applicationContext).close();
	}
}
