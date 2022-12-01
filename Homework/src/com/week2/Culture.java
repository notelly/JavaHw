package com.week2;

import java.util.Scanner;

public abstract class Culture {
	//필드
	String name;
	int directorNum;
	int actorNum;
	int attendance;
	int totalScore;
	String star;
	int scoreSum;
	int gradeSum;
	Scanner sc = new Scanner(System.in);
	
	//생성자
	public Culture() {
		
	}
	
	//메소드
	public void setTotalScore(int score) {
			scoreSum += score;
		}
	
	
	public int getGrade(int grade) {
		gradeSum += grade;
		return gradeSum;
	}
		
		
	public String star(int starNum) {	
		String star = null;
		switch (starNum) {
		case 0:
			star = "☆☆☆☆☆";
			break;
		case 1:
			star = "★☆☆☆☆";
			break;
		case 2:
			star = "★★☆☆☆";
			break;
		case 3:
			star = "★★★☆☆";
			break;
		case 4:
			star = "★★★★☆";
			break;
		case 5:
			star = "★★★★★";
			break;
		}
		
		return star;
	}
	
	public abstract void getInformation();
	
}
