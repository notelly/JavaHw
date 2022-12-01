package com.yedam.test2;

public class Card {
	//필드
	String cardNo;
	int validDate;
	int cvc;
	
	//생성자
	public Card(String cardNo, int validDate, int cvc) {
		this.cardNo =cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	//메소드
	public String getCardNo() {
		return cardNo;
	}

	public int getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}
	
	public void showCardInfo() {
		System.out.println("Card NO : " + cardNo + "유효기간 : " + validDate + "유효기간 : " + cvc);
	}

}
