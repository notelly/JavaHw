package com.Day2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie movie = new Movie();
		
		System.out.println("영화 관객 수를 입력하세요. >");
		movie.attendance = Integer.parseInt(sc.nextLine());
		//총점
		for(int i = 0; i < movie.attendance; i++) {
			System.out.println("총점을 입력하세요. >");
			int score = Integer.parseInt(sc.nextLine());
			movie.setTotalScore(score);
		}
		movie.totalScore = movie.scoreSum / movie.attendance;
		System.out.println(movie.totalScore);
		
		//평점
		for (int i = 0; i < movie.attendance; i++) {
			System.out.println("평점을 입력하세요.");
			int grade = Integer.parseInt(sc.nextLine());
			if (grade <=5 && grade >0) {
				movie.gradeSum = movie.getGrade(grade);
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
			int starNum = movie.gradeSum / movie.attendance;
			System.out.println(starNum);
			movie.star = movie.star(starNum);
		
		movie.name = "추격자";
		movie.directorNum = 7;
		movie.actorNum = 5;
		movie.totalScore = movie.totalScore;
		movie.star = movie.star;
		

		
		Performance perform = new Performance();
		
		System.out.println("공연 관객 수를 입력하세요. >");
		perform.attendance = Integer.parseInt(sc.nextLine());
		//총점
		for(int i = 0; i < perform.attendance; i++) {
			System.out.println("총점을 입력하세요. >");
			int score = Integer.parseInt(sc.nextLine());
			perform.setTotalScore(score);
		}
		perform.totalScore = perform.scoreSum / perform.attendance;
		System.out.println(perform.totalScore);
		
		//평점
		for (int i = 0; i < perform.attendance; i++) {
			System.out.println("평점을 입력하세요.");
			int grade = Integer.parseInt(sc.nextLine());
			if (grade <=5 && grade >0) {
				movie.gradeSum = perform.getGrade(grade);
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
			int starNum1 = perform.gradeSum / movie.attendance;
			System.out.println(starNum1);
			perform.star = perform.star(starNum);
		
		perform.name = "지킬앤하이드";
		perform.directorNum = 9;
		perform.actorNum = 10;
		perform.totalScore = perform.totalScore;
		perform.star = perform.star;
		
		movie.getInformation();
		perform.getInformation();
	}

}
