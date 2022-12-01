package com.yedam.homwork;

import java.util.Scanner;

public class Homework1124 {
	public static void main(String[] args) {
		//상품 수와 상품 명을 입력 받을 수 있도록 Scanner 등록
		Scanner sc = new Scanner(System.in);
		Stock calling = new Stock();
		// switch 사용시 true X, flag =true,  while(flag)을 넣고 flag = false를 넣어야한다.
		while(true) {
			// Product[] pd = null; 반복문 안에 정의 하면 돌때 배열의 크기가 초기화 됨
			// 결론: 변수 or 배열의 선언 같은 경우는 반복문 밖에 하는 것이 났다.
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료 ");
			System.out.println("입력>");
			int selectNo = Integer.parseInt(sc.nextLine());
			//double selectNo = sc.nextLine(); 도 가능. 문자열 비교하는 방식으로 하면 된다.
			// if (selectNo.equals("1")){} 로 쓰면 됨.
			if (selectNo == 1) {
				calling.stockNo();
				//배열의 크기를 받는 행동만 할것. 크기 확정은 2번에서
			}else if (selectNo == 2) {
				calling.Arry();
			}else if (selectNo == 3) {
				//배열의 크기만큼 반복문을 진행할때 배열에 각 인덱스(방 번호)를 
				//활용하여 객체(상품)을 꺼내와서 상품에 객체(상품)에 정보를 하나씩 꺼내온다.
				calling.getInfo();
			}else if (selectNo == 4) {
				System.out.println("최고 가격을 가지는 제품인 "+ calling.maxName() + "의 가격은 " + calling.max() + "원");
				System.out.println("가격이 가장 비싼 "+calling.maxName+"을 제외한 제품들의 총합은 "+ calling.sum() + "원");
			}else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break; //반복문을 종료할 때 사용한다.
			}
		}
	}
}
