package com.masai.Problem4;

public class Circle implements Shape {

	public void draw() {
		System.out.println("You have drawn a Circle");
	}

	@Override
	public void start() {
		draw();
		
	}
}
