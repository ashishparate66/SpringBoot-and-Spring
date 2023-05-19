package com.masai;

public class A {

	private String message;
	public void setMessage(String message) {
	this.message = message;
	}
	public void mySetup() {
	System.out.println("inside mySetup method to write any initialization logic...");
	System.out.println("message is :"+message);
	}
	public void funA() {
	System.out.println("inside funA of A");
	}
 
}
