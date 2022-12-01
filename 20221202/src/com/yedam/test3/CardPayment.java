package com.yedam.test3;

public class CardPayment implements Payment{
	//필드
	double cardRatio;
	double onCardFinalRatio;
	double offCardFinalRatio;
	
	//생성자
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}
	
	//메소드
	@Override
	public void showInfo() {
		this.onCardFinalRatio = cardRatio + ONLINE_PAYMENT_RATIO;
		this.offCardFinalRatio = cardRatio + OFFLINE_PAYMENT_RATIO;
		System.out.println("온라인 결제시 총 할인율 : " + onCardFinalRatio);
		System.out.println("오프라인 결제시 총 할인율 : " + offCardFinalRatio);
	}
	
	@Override
	public int online(int price) {
		int money = (int) ((int)price * (1-onCardFinalRatio));
		return money;
	}

	@Override
	public int offline(int price) {
		int money = (int) ((int)price * (1-offCardFinalRatio));
		return money;
	}

	
	
	
}
