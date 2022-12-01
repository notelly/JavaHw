package com.week2;

public class Movie extends Culture {
	//필드
	String genre;
	//생성자
	
	public Movie() {
		super();
		this.genre = "영화";
	}
	
	@Override
	public void getInformation() {
		System.out.println(genre + "제목 : " + name );
		System.out.println("감독 : " + directorNum);
		System.out.println("배우 : " + actorNum);
		System.out.println(genre + "총점 : " + totalScore);
		System.out.println(genre + "평점 : " + star);
		System.out.println("=====================");

	}

}
