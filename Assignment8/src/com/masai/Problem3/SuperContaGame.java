package com.masai.Problem3;

public class SuperContaGame implements Game {
	public void up(){
		System.out.println("SuperContaGame up");
	}

	public void down(){
		System.out.println("SuperContaGame down");
		
	}

	public void left(){
		System.out.println("SuperContaGame left");
		
	}

	public void right(){
		System.out.println("SuperContaGame right");
		
	}

	@Override
	public void start() {
		up();
		down();
		left();
		right();
	}
}
