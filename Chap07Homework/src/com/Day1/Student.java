package com.Day1;

public class Student {
	// 학생의 이름 : 김또치
	   // 학생의 학교 : 예담고등학교
	   // 학생의 학번 : 221126
	
	//필드
	String stdName;
	String stdSchool;
	String stdNo;
	int kor;
	int math;
	int eng;
	
	//생성자
	// 1) 생성자를 통한 필드 초기화 -> 생성자(매개변수)
	public Student(String stdName, String stdSchool, String stdNo) {
		this.stdName = stdName;
		this.stdSchool = stdSchool;
		this.stdNo = stdNo;
	}
// 2) 객체 필드에 접근하여 필드 초기화 -> 기본 생성자
	public Student() {
		
	}
	//메소드
	void getInfo() {
		System.out.println("학생의 이름 : " + stdName);
		System.out.println("학생의 학교 : " + stdSchool);
		System.out.println("학생의 학번 : " + stdNo);
		System.out.println("총 점 : " + sum());
		System.out.println("평 균 : " + avg());
	}
	
	int sum() {
		return kor+eng+math;
	}
	
	double avg() {
		double avgs = sum() / (double)3;
		return avgs;
	}
		
}

