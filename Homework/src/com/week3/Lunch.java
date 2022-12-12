package com.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lunch {
//	1)바쁜 학생들을 위해 미리 점심 메뉴를 선정하는 프로그램
//
//	랜덤으로 메뉴를 출력해주는 프로그램.
//	사용하는 사람이 마음에 들 때까지 반복을 하다가
//	맘에 드는 메뉴가 나오면 STOP
//
//	MENU CLASS, MAIN CLASS
//
//	객체를 생성하게 되면 임의 메뉴가 자동적으로 만들어 짐.
//
//	======= 오늘의 점심 메뉴 ========
//	1. 메뉴 선정
//	 - "메뉴 선정 중 입니다....짜짱면!!!!!!"
//	 - "마음에 드십니까?"
//	 - 입력 : Y or N
//	 - "메뉴 선정 중 입니다....햄버거!!!!!!"
//	 - "마음에 드십니까?"
//	 - 입력 : Y or N
//	2. 메뉴 리스트 조회
//	3. 메뉴 선정 리스트 조회
//	4. 메뉴 등록
//	5. 종료
//	====================================

	// 필드
	List<String> menuList = Arrays.asList(new String[] { "떡볶이", "된장찌개", "김치찌개", "고등어정식", "제육덮밥", "볶음밥", "김밥", "비빔밥",
			"국밥", "찜닭", "스파게티", "피자", "토스트", "샐러드", "햄버거", "스테이크", "샌드위치", "리조또", "치킨", "함박스테이크", "짜장면", "짬뽕", "울면",
			"완탕면", "탕수육", "잡채밥", "마라탕", "잡탕밥", "중화비빔밥", "야끼우동", "텐동", "초밥", "메밀소바", "마제소바", "규동", "우동", "가츠동", "타코야키",
			"라멘", "연어덮밥", "인도 커리", "분짜", "월남쌈", "쌀국수", "팟타이", "나시고렝", "쏨땀", "똠양꿍", "칠리크랩", "반세오" });
	int num;
	boolean run = true;
	boolean flag = true;
	List<String> foodList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	// 메소드
	public void lunchbox() {
		while (flag) {
		System.out.println("==============================오늘의 점심 메뉴==============================");
		System.out.println("1. 메뉴 선정 | 2. 메뉴 리스트 조회 | 3. 메뉴 선정 리스트 조회 | 4. 메뉴 등록 | 5. 종료");
		System.out.println("입력 >>");
		int number = Integer.parseInt(sc.nextLine());
			switch (number) {
			case 1:
				pickMenu();
				break;
			case 2:
				menuList();
				break;
			case 3:
				pickList();
				break;
			case 4:
				menu();
				break;
			case 5:
				System.out.println("종료");
				flag = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}
	}

	// 음식 선정
	public void pickMenu() {
		while (run) {
			num = (int) (Math.random() * 50);
			System.out.println("메뉴 선정중...");
			System.out.println(menuList.get(num));
			foodList.add(menuList.get(num));
			System.out.println("마음에 드십니까?");
			System.out.println("입력 Y or N");
			String answer = sc.nextLine();
			if (answer.toLowerCase().equals("y")) {
				System.out.println("맛있게 드세요!");
				run = false;
			} else if (answer.toLowerCase().equals("n")) {
				System.out.println("메뉴 다시 선정");
				continue;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	// 메뉴리스트조회
	public void menuList() {
		System.out.println("메뉴 리스트 조회");
		for (int i = 0; i < menuList.size(); i++) {
			if (i % 10 == 0) {
				System.out.println();
				System.out.printf(menuList.get(i)+ " ");
			} else {
				System.out.printf(menuList.get(i)+ " ");
			}
		}
		System.out.println();
		System.out.println();
	}

	// 메뉴 선정 리스트 조회
	public void pickList() {
		System.out.println("메뉴 선정 리스트 조회");
		for (int i = 0; i < foodList.size(); i++) {
			if (i % 10 == 0) {
				System.out.println();
				System.out.print(foodList.get(i) + " ");
			} else {
				System.out.printf(foodList.get(i) + " ");
			}
		}
		System.out.println();
		System.out.println();
	}

	// 메뉴 등록
	public void menu() {
		System.out.println("등록할 메뉴를 입력하세요. >>");
		String newMenu = sc.nextLine();
		for(int i = 0; i < menuList.size(); i++) {
			if(newMenu.equals(menuList.get(i))) {
				System.out.println("이미 있는 메뉴 입니다.");
			}else {
				menuList.add(newMenu);
				System.out.println(newMenu + " 등록 완료!");
			}
			
		}
	}

}
