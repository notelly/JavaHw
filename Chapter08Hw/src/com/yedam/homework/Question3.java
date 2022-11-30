package com.yedam.homework;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 2) + 1;
		Scanner sc = new Scanner(System.in);
		//System.out.println(random);
		Label : switch (random) {
		case 1:
			Keypad game = new RPGgame();
			boolean a = true;
			while (a) {
				System.out.println("=======================================================================================");
				System.out.println("1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT");
				System.out.println("=======================================================================================");

				System.out.printf("choice>> ");
				int getNum = Integer.parseInt(sc.nextLine());

				switch (getNum) {
				case 1:
					game.leftUpButton();
					break;
				case 2:
					game.leftDownButton();
					break;
				case 3:
					game.rightUpButton();
					break;
				case 4:
					game.rightDownButton();
					break;
				case 5:
					game.changeMode();
					break;
				case 0:
					a = false;
					break;
				case 9:
					break Label;
				}
			}
		case 2:
			Keypad game1 = new ArcadeGame();
			a = true;
			while (a) {
				System.out.println("=======================================================================================");
				System.out.println("1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT");
				System.out.println("=======================================================================================");

				System.out.printf("choice>> ");
				int getNum = Integer.parseInt(sc.nextLine());

				switch (getNum) {
				case 1:
					game1.leftUpButton();
					break;
				case 2:
					game1.leftDownButton();
					break;
				case 3:
					game1.rightUpButton();
					break;
				case 4:
					game1.rightDownButton();
					break;
				case 5:
					game1.changeMode();
					break;
				case 0:
					//뭘 넣어야 case 1 으로 돌아갈까?
					 continue;
				case 9:
					break Label;
				}

			}

		}
	}
}
