package com.masai.Problem4;

public class Runner {

	private Shape s;

	public void setS(Shape s) {
		this.s = s;
	}
	
	public void run() {
		s.start();
		System.out.println("Shape is Started");
	}
}
