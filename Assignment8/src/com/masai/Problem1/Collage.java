package com.masai.Problem1;

public class Collage {

	private Job j;
	  
//  public Collage(Job j) {
//		super();
//		this.j = j;
//	}

	public void setJ(Job j) {
		this.j = j;
	}

	public void doJob(){
		j.start();
		System.out.println("Job is started");
		//here it needs the service of its Dependencies
		}
}
