package com.yedam.test2;

public class CardExample {
	public static void main(String[] args) {
		TossCard toss = new TossCard("5432-4567-95343657", 20251203, 253, "신빛용");
		toss.showCardInfo();
		
		System.out.println();
		
		DGBCard daegu = new DGBCard("5432-4567-95343657", 20251203, 253, "신빛용");
		daegu.showCardInfo();
		
	}
}
