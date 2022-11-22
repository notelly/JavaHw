package com.yedam.homwork;

import java.util.Scanner;

public class Homwork_1122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		double x =(double)(Math.random()*100)-50;
		double y =(double)(Math.random()*100)-50;
		System.out.println(x);
		System.out.println(y);
		if (x>0 && y>0){
			System.out.println("제 1사분면");
		}else if (x<0 && y>0){
			System.out.println("제 2사분면");
		}else if (x<0 && y<0){
			System.out.println("제 3사분면");
		}else if (x>0 && y<0){
			System.out.println("제 4사분면");
		}
		
		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
/*		System.out.println("연도를 입력하세요");
		int year = Integer.parseInt(sc.nextLine());
		
		if(year%4 == 0){
			if (year%100 != 0 || year%400 == 0) {
				System.out.println(year + "은 윤년입니다.");
			}else {
				System.out.println(year + "은 윤년이 아닙니다.");
			}
		}*/
		
		// 문제3) 반복문을 활용하여 up & down 게임을 작성하시오.
		// 기회는 5번 이내로 맞추도록 하며, 맞추게 될 시에는 정답 공개 및 축하합니다.
		// 메세지 출력.
		// 사용자가 답안 제출 시, up, down이라는 메세지를 출력하면서 
		// 정답 유추를 할 수 있도록 한다.
		
/*		int random = (int)(Math.random()*100)+1;
		System.out.println(random);
		System.out.println("up & down 5회 안에 숫자를 맞추세요.");
		for(int i = 4; i >= 0; i--) {
			System.out.println("입력>");
			int number = Integer.parseInt(sc.nextLine());
				if(number > random) {
					System.out.println("down");
					System.out.println(i + "번 남았습니다.");
				}else if (number < random) {
					System.out.println("up");
					System.out.println(i + "번 남았습니다.");
				}else if(number == random) {
					System.out.println("정답");
					break;
				}
//			System.out.println("횟수를 다썼습니다."); 이거까지 뜨게 하려면 어캐 하지
			}*/
		
		// 문제4) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		
		System.out.println("m과 n을 입력하세요.");
		System.out.println("m 입력>");
		int m = Integer.parseInt(sc.nextLine());
		System.out.println("n 입력>");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 2; i == m; i++) {
			for(int j = 1; j == n; j++) {
				System.out.println(i + " x " + j + "=" + (i*j));
			}
		}
		
		
		
		
	}
}
