package com.masai.Problem3;

public class Main {

	public static void main(String[] args) {
//		GameRunner g = new GameRunner(new MarioGame());
		GameRunner g = new GameRunner();
		g.setG(new PacManGame());
		g.run();
	}
}
