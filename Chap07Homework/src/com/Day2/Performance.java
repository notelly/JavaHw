package com.Day2;

public class Performance extends Culture {
	//필드
	String genre;
	//생성자
	
	public Performance() {
		super();
		this.genre = "공연";
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
