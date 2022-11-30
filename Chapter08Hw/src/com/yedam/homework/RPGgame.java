package com.yedam.homework;

public class RPGgame implements Keypad {

	int mod = Keypad.NORMAL_MODE;

	public RPGgame() {
		System.out.println("RPGGame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");

	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");

	}

	@Override
	public void rightUpButton() {
		if (mod == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		} else if (mod == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if (mod == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격.");
		} else if (mod == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 HIT 공격.");
		}

	}

	// 왜 int mod 값을 안넣지?
	@Override
	public void changeMode() {
		if (mod == Keypad.NORMAL_MODE) {
			mod = Keypad.HARD_MODE;
			System.out.println("현재 모드 : HARD_MODE");
		} else if (mod == Keypad.HARD_MODE) {
			mod = Keypad.NORMAL_MODE;
			System.out.println("현재 모드 : NORMAL_MODE");
		}
	}
}
