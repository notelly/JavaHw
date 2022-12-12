package com.week3;

import java.util.Scanner;

public class Homework1207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1. 섭씨 온도가 입력되면 화씨 온도로 변환하시오.
//
//		공식 : 화씨 온도 = 9 / 5 * 섭씨온도 + 32
//
//		예시 )
//		입력 : 섭씨 입력>
//		         30
//		출력 : ## 섭씨 -> 화씨 변환 완료
//		             결과 -> 86
//		System.out.println("=====섭씨 온도를 화씨로 변환=====");
//		System.out.println(" 섭씨 온도를 입력하세요 >");
//		int degree = Integer.parseInt(sc.nextLine());
//		// System.out.println(degree);
//		double solution = 9 / 5 * (double) degree + 32;
//		// System.out.println(solution);
//		System.out.println(" ## 섭씨 -> 화씨 변환 완료");
//		System.out.printf("\t 결과 -> " + solution); // 소수점 정리하기

//		2. 카드를 랜덤하게 선택하여 화면에 출력하는 코드를 작성하자. 
//		{"Clubs", "Diamonds", "Hearts", "Spades"} 와 { "2", "3", "4", "5", "6", "7", "8", "9", "JACK", "Queen", "King", "ACE" }를
//		가지고 있는 배열을 생성하고 위 내용을 활용하여 5장의 카드를 랜덤하게 출력하시오.
//
//		예시 )
//		Diamonds의 King
//		Clubs의 10
//		Spades의 9
//		Diamonds의 9
//		Spades의 3

//		String[] cardShape = { "Clubs", "Diamonds", "Hearts", "Spades" };
//		String[] cardNum = { "2", "3", "4", "5", "6", "7", "8", "9", "JACK", "Queen", "King", "ACE" };
//		System.out.println("카드 랜덤 생성");
//
//		for (int i = 0; i < 6; i++) {
//			int random = (int) (Math.random() * 4);
//			int numRandom = (int) (Math.random() * 12);
//			System.out.println(cardShape[random] + "의 " + cardNum[numRandom]);
//		}

//		3. 은행 계좌를 나타내는 BankAccount 클래스는 잔액을 나타내는 balance 필드를 가지고 있다.
//		이 클래스에 출금 기능을 수행하는 메소드 withDraw(int money), 입금 기능을 수행하는 deposit(int money), 잔액을 출력하는 getInfo()가 존재한다.
//
//		BankAccount 클래스를 작성하여 입금과 출금을 할 수 있는 기능을 구현하시오.
//
//		예시) BankAccount account1 = new BankAccount(20000);
//
//		        account1.withDraw(30000);      // 출금 결과 : 실패
//		        account1.withDraw(10000);      // 출금 결과 : 성공, 잔고 : 10000원.
//		        account1.deposit(10000);         // 입금 결과 : 성공, 잔고 : 20000원.
//		        account1.getInfo();                  // 현재 잔고 : 20000원.
		BankAccount act = new BankAccount();
		boolean run = true;
		while (run) {
			System.out.println("====== 1. 출금 | 2. 입금 | 3. 잔고 | 4. 종료 ======");
			System.out.println("입력 >>");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				System.out.println("얼마를 출금하시겠습니까? >>");
				int money = Integer.parseInt(sc.nextLine()); //next 랑 nextLine이랑 좀 섞어서 쓰지 말기 NumberFormatException
				act.withDraw(money);
				break;
			case 2:
				System.out.println("얼마를 입금하시겠습니까? >>");
				money = Integer.parseInt(sc.nextLine());
				act.deposit(money);
				break;
			case 3:
				act.getInfo();
				break;
			case 4:
				run = false;
				System.out.println("종료");
				break;
			default:
				System.out.println("번호를 잘못 입력하였습니다.");
				break;
			}
		}

	}

}
