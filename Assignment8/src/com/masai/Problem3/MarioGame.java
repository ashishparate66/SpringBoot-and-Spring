package com.masai.Problem3;

public class MarioGame implements Game {

	public void up(){
		System.out.println("MarioGame up");
	}

	public void down(){
		System.out.println("MarioGame down");
		
	}

	public void left(){
		System.out.println("MarioGame left");
		
	}

	public void right(){
		System.out.println("MarioGame right");
		
	}

	@Override
	public void start() {
		up();
		down();
		left();
		right();
		
	}
}
