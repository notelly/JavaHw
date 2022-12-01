package com.week2;

import java.util.Scanner;

public class Homework1129 {
	public static void main(String[] args) {
//		[2번 문제]		
//	구구단 출력
// 	첨부파일 확인 후 해당 그림과 같이 구현해 볼 것.
//	파일명 : gugu.png
//	※ 일정한 규칙을 찾은 뒤 반복문의 조건을 규칙에 맞추어서 풀어 본다.
		for (int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 5; j++) {
				System.out.printf(j +"x"+ i +"="+ (j*i)+" ");
			}
			System.out.println();
			System.out.println();
		}
//		[2번 문제]
//		삼각형의 3변의 길이 a, b, c가 입력으로 주어진다.
//		여기서 입력되는 변의 관계는 a ≤ b ≤ c 이다. 
//		그 삼각형이 무슨 삼각형인지 출력하시오.
//		※ 정삼각형, 이등변삼각형의 성질을 확인 후 해당 문제에 대입해서 풀어 본다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 길이를 입력하세요. >");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("b의 길이를 입력하세요. >");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("c의 길이를 입력하세요. >");
		int c = Integer.parseInt(sc.nextLine());
		
		
		if (a == b && b == c) {
			System.out.println("정삼각형 입니다.");
		}else if(a != b && b == c) {
			System.out.println("이등변 삼각형 입니다.");
		}else if ((a*a) + (b*b) == (c*c)) {
			System.out.println("피타고라스 삼각형입니다.");
		}else {
			System.out.println("일반 삼각형 입니다.");
		}
		
		
		
	}
	
}
