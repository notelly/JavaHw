package com.yedam.test2;

public class TossCard extends Card {
	//필드
	String company = "Toss";
	String cardStaff;
	
	//생성자
	public TossCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardStaff, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	//메소드
	@Override
	public void showCardInfo() {
		System.out.println("카드 정보 - Card NO," + cardNo);
		System.out.println("담당 직원 -"+ cardStaff +", "+ company);
	}
	
	
	
	
	
}
