package com.masai.Problem1;

public class Teacher implements Job {

	
	public void teaches(){
	      System.out.println("Teacher teaches");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		teaches();
	}
}
