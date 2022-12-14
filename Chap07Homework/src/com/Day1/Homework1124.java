package com.Day1;

import java.util.Scanner;

public class Homework1124 {
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		Scanner sc = new Scanner(System.in);
		Stock calling = new Stock();
		while(true) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료 ");
			System.out.println("입력>");
			int selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {
				calling.stockNo();
			}else if (selectNo == 2) {
				calling.Arry();
			}else if (selectNo == 3) {
				calling.getInfo();
			}else if (selectNo == 4) {
				System.out.println("최고 가격을 가지는 제품인 "+ calling.maxName() + "의 가격은 " + calling.max() + "원");
				System.out.println(calling.maxName+"을 제외한 제품들의 총합은 "+ calling.sum() + "원");
			}else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
