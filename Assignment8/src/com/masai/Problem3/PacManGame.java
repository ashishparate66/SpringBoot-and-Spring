package com.masai.Problem3;

public class PacManGame implements Game {

	public void up(){
		System.out.println("PacManGame up");
	}

	public void down(){
		System.out.println("PacManGame down");
		
	}

	public void left(){
		System.out.println("PacManGame left");
		
	}

	public void right(){
		System.out.println("PacManGame right");
		
	}

	@Override
	public void start() {
		up();
		down();
		left();
		right();
	}
}
