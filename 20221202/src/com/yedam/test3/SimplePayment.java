package com.yedam.test3;

public class SimplePayment implements Payment {
	//필드
	double simplePaymentRatio;
	double onSPRatio;
	double offSPRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}
	
	@Override
	public void showInfo() {
		this.onSPRatio = simplePaymentRatio + ONLINE_PAYMENT_RATIO;
		this.offSPRatio = simplePaymentRatio + OFFLINE_PAYMENT_RATIO;
		System.out.println("온라인 결제시 총 할인율 : " + onSPRatio);
		System.out.println("오프라인 결제시 총 할인율 : " + offSPRatio);
	}
	
	@Override
	public int online(int price) {
		int money = (int) ((int)price * (1-onSPRatio));
		return money;
	}

	@Override
	public int offline(int price) {
		int money = (int) ((int)price * (1-offSPRatio));
		return money;
	}


}
