package com.yedam.exam;

import java.util.Scanner;

public class FirstExam {
	public static void main(String[] args) {
		// 5) 주사위 문제
		// [메뉴1] 주사위 크기(5~10)을 입력받으세요. 범위를 벗어날 경우 범위 안내 메세지를 출력.
		// [메뉴2] 5가 나올때 까지 주사위를 몇번 굴리는 지 구하고 출력.
		// [메뉴3] [메뉴2에서 각 주사위 수별로 몇번씩 나왔는지 출력.
		Scanner sc = new Scanner(System.in);
		int dice = 0;
		int j = 0;
		int[] arrys = null;
		while(true) {
			System.out.println("==1. 주사위의 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료 ==");
			System.out.println("메뉴 >");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				System.out.println("주사위의 크기를 입력하세요. >");
				dice = Integer.parseInt(sc.nextLine());
				//System.out.println();
				Label: if ((dice > 10) || (dice <5)) {
					System.out.println("주사위의 범위는 5~10 입니다. 다시 입력하세요.");
					break Label;
				}
			}else if(menu == 2) {
				arrys = new int[dice];
				while(true) {
					j += 1;
					int number = (int)(Math.random()*dice)+1;
					System.out.println(number);
					arrys[number-1] += 1; 
					if (number == 5) {
						System.out.println("5가 나올 때까지 주사위를 " + j + "번 굴렸습니다.");
						break;
					}
					}
				for (int i = 0; i < dice; i++) {
					System.out.println(arrys[i]+1);
				}
			}else if(menu == 3) {
				for (int i = 0; i < arrys.length; i++) {
					System.out.println("주사위 "+ (i+1) + "는 "+ (arrys[i]+1) +"번 나왔습니다.");
				}
			}else if(menu == 4) {
				int max = 0;
				int maxNum = 0;
				for (int i = 0; i < dice; i++) {
					if(max < arrys[i]) {
						max = arrys[i];
						maxNum = i+1;
					}
				}
				System.out.println("가장 많이 나온 수 " + maxNum + " 는 " + max+ "번 나왔습니다.");
			}else if(menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
