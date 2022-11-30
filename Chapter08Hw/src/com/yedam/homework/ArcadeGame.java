package com.yedam.homework;

public class ArcadeGame implements Keypad {
	
	int mod = Keypad.NORMAL_MODE;
	
	public ArcadeGame() {
		System.out.println("ArcadeGame 실행");
	}
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
		
	}

	@Override
	public void rightUpButton() {
		if (mod == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		}else if (mod == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 연속 공격");
		}
	}

	@Override
	public void rightDownButton() {
		if (mod == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 HIT 공격");
		}else if (mod == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 Double HIT 공격");
		}
	}

	@Override
	public void changeMode() {
		if(mod == Keypad.NORMAL_MODE) {
			mod = Keypad.HARD_MODE;
			System.out.println("현재 모드 : " + String.valueOf(mod));
		}else if (mod == Keypad.HARD_MODE) {
			mod = Keypad.NORMAL_MODE;
			System.out.println("현재 모드 : " + String.valueOf(mod));
		}
	}


		

		
		

}

