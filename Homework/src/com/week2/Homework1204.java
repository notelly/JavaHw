package com.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * [1번 문제] 학교시험을 칠 때 날짜에 대한 징크스가 있다.
		 * 
		 * 그것은 시험을 치는 날짜가 짝수이거나 5의 배수인 날인 경우 항상 시험을 못 보는 것이다.
		 * 
		 * 그래서 이번 시험일자가 공고되면 미리 시험운을 예견해 보려고 한다.
		 * 
		 * 시험을 못 볼 운이면 Bad 아니면 Good을 출력해라
		 * 
		 * 예시) 입력 : 3 출력 : Good 입력 : 15 출력 : Bad
		 */

		System.out.println("오늘의 날짜를 입력하세요. >");
		int date = Integer.parseInt(sc.nextLine());

		if (date % 2 == 0 || date % 5 == 0) {
			System.out.println("Bad");
		} else {
			System.out.println("Good");
		}

		/*
		 * [2번 문제] 0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면
		 * 
		 * 그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
		 * 
		 * (평균은 반올림하여 소수 첫째자리까지 출력한다.)
		 * 
		 * 예시 ) 입력 : 55 100 48 36 0 101 출력 : sum : 239, avg : 47.8
		 */
		
		boolean run = true;
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		while (run) {
			System.out.println("0~100 사이의 정수를 입력하세요.");
			int num = Integer.parseInt(sc.nextLine());
			if(num >=0 && num <= 100) {
				list.add(num);
			}else {
				run =false;
			}
		}
			for(int i = 0; i < list.size(); i++) {
				sum += list.get(i);
			}
			System.out.println("sum : " + sum + ", avg : " + (sum/list.size()));
		/*
		 * [3번 문제] 호수에서 살고 있는 얼음요정이 곱셈을 공부하기로 했다. 근데 이 요정은 너무 멍청해서 9라는 숫자 이외에는 헷갈려서 잘 쓰지
		 * 못한다고 한다. 그래서 사람과는 곱셈방식이 좀 다르다.
		 * 
		 * (규칙 1)
		 * 
		 * 곱하는 수나 곱한 결과에 9가 없으면 뭘 곱하든 9가 된다.
		 * 
		 * 3*4=9
		 * 
		 * 13*17=9
		 * 
		 * (규칙 2)
		 * 
		 * 곱하는 수나 곱한 결과에 9가 있으면 값을 그대로 출력한다.
		 * 
		 * 19*2=38
		 * 
		 * 13*7=91
		 * 
		 * 얼음요정의 n*n단을 출력해보자.
		 */
		for (int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				if(i%9 == 0 || j%9 == 0 || (i*j)%9 == 0 ) {
					System.out.print(j +"x"+ i + "= " + i*j);
					System.out.print("\t");
				}else {
					System.out.print(j +"x"+ i + "= 9" );
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
	}
}
