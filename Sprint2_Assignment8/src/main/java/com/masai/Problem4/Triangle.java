package com.masai.Problem4;

public class Triangle implements Shape {

	public void draw() {
		System.out.println("You have drawn a Triangle");
	}

	@Override
	public void start() {
		draw();
		
	}
}
