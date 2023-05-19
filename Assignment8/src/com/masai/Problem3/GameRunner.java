package com.masai.Problem3;

public class GameRunner {
	private Game g;
	
	
	public void setG(Game g) {
		this.g = g;
	}
//	public GameRunner(Game g) {
//		super();
//		this.g = g;
//	}

	public void run(){
		g.start();
		System.out.println("Game is started");
		
	}


}
