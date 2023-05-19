package com.masai.Problem1;

public class Cleark implements Job {

	public void registerStudent(){
	    System.out.println("enroll the Student in Collage");
	}

	@Override
	public void start() {
		registerStudent();
		
	}
}
