package com.yedam.homwork;

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		Student stdInfo = new Student();
		
		stdInfo.setName("김또치");
		stdInfo.setGrade("2학년");
		stdInfo.setMajor("컴퓨터공학과");
		stdInfo.setProgramScore(50);
		stdInfo.setDbScore(60);
		stdInfo.setOsScore(90);
		
		System.out.println("이름 : " + stdInfo.getName());
		System.out.println("학과 : " + stdInfo.getMajor());
		System.out.println("학년 : " + stdInfo.getGrade());
		System.out.println("프로그래밍 점수 : " + stdInfo.getProgramScore());
		System.out.println("데이터베이스 점수 : " + stdInfo.getDbScore());
		System.out.println("운영체제 점수 : " + stdInfo.getOsScore());
}
}
