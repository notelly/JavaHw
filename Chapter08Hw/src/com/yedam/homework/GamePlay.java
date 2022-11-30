package com.yedam.homework;

public class GamePlay {
	public static void main(String[] args) {
		Keypad game = new RPGgame();
				
		game.leftUpButton();
		game.rightUpButton();
		game.changeMode();
		game.rightUpButton();
		game.rightDownButton();
		game.changeMode();
		game.rightDownButton();
		
		System.out.println("===================");
		
		
		game = new ArcadeGame();
		
		game.leftUpButton();
		game.rightUpButton();
		game.leftDownButton();
		game.changeMode();
		game.rightUpButton();
		game.leftUpButton();
		game.rightDownButton();
		


		
		
	}

}
