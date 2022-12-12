package com.week3;

public class BankAccount {
	int balance;
	
	
	//출금기능을 수행
	public void withDraw(int money) {
		if((balance - money) <= 0) {
			System.out.println("출금 결과 : 실패 !!잔고 부족!!");
		}else {
			balance = balance - money;
			System.out.println("출금 결과 : 성공 잔고 : " + balance +"원");
		}
	}
	
	//입금기능을 수행
	public void deposit(int money) {
		balance = balance + money;
		System.out.println("입금 결과 : 성공 잔고 : " + balance +"원");
	}
	
	//잔고출력
	public void getInfo() {
		System.out.println("현재 잔고 : " + balance + "원" );
	}
	
	
}
