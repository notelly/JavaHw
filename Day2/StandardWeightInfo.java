package com.Day2;

public class StandardWeightInfo extends Human {
	//필드
	
	
	//생성자
	

	//메소드
	@Override
	public void getInfomation() {
		System.out.println(name +"님의 신장 "+ height+", 몸무게 "+weight+", 표준체중 " +avgWeight+" 입니다.");
	}
	
	public void getStandardWeight(int height) {
		avgWeight = (double) (height - 100*0.9);
		System.out.println(avgWeight);
	}

	
	
	
}
