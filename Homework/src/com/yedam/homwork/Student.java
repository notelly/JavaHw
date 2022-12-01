package com.yedam.homwork;

public class Student {
	//필드
	private String name;
	private String major;
	private String grade;
	private int programScore;
	private int dbScore;
	private int osScore;
	
	//생성자
	//클래스를 통한 객체를 생성할때 첫번째로 수행하는 일들을 모아두는 곳
	//필드에 대한 데이터의 객체를 생성할 때 초기화 할 예정이라면
	//생성자에 this 키워드를 활용해서 필드 초기화를 하면 됨.
	//메소드
	//getter setter 만들때 오른쪽 클릭으로 만들기
	//일일이 비생산적 //source로 들어가면 있음
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getProgramScore() {
		return programScore;
	}
	//프로그래밍 언어 점수가 0보다 작은 점수가 들어올 경우
	//프로그래밍 언어 점수를 0으로 처리하겠다.
	public void setProgramScore(int programScore) {
		if(programScore <0) {
			System.out.println("잘못된 정보를 입력했습니다. 다시 입력하세요.");
		}else {
			this.programScore = programScore;			
		}
	}
	public int getDbScore() {
		return dbScore;
	}
	public void setDbScore(int dbScore) {
		this.dbScore = dbScore;
	}
	public int getOsScore() {
		return osScore;
	}
	public void setOsScore(int osScore) {
		this.osScore = osScore;
	}
	

	
}
