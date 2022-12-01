package com.week1;

import java.util.Scanner;

public class Application11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int stdCount = 0;
		Student[] stdAry = null;
		
		while (true) {
			System.out.println("1. 학생 수|2. 학생 정보 입력 | 3. 학생의 총점, 평균| 4. 종료");
			System.out.println("입력>");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("학생 수 입력>");
				stdCount = Integer.parseInt(sc.nextLine());

			} else if (selectNo == 2) {
				stdAry = new Student[stdCount];
				for(int i=0; i<stdAry.length; i++) {
					Student std = new Student();
					
					System.out.println("학생 이름>");
					String name = sc.nextLine();
					std.stdName = name;
					
					System.out.println("국어 성적>");
					int kor = Integer.parseInt(sc.nextLine());
					std.kor = kor;
					
					System.out.println("수학 성적>");
					std.math = Integer.parseInt(sc.nextLine());
					
					System.out.println("영어 성적>");
					std.eng = Integer.parseInt(sc.nextLine());
					
					stdAry[i] = std;
				}
			} else if (selectNo == 3) {
				for(int i=0; i<stdAry.length; i++) {
					System.out.println(stdAry[i].stdName+" 학생 성적");
					System.out.println("총 점 : "+ stdAry[i].sum());
					System.out.println("평 균 : "+ stdAry[i].avg());
				}
			} else if (selectNo == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}
}
