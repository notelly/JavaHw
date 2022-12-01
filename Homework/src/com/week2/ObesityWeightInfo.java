package com.week2;

public class ObesityWeightInfo extends StandardWeightInfo {

	public ObesityWeightInfo() {
		super();
	}
	

	
	public void getInfomation(double avgWeight, double obesity) {
		if(obesity >= 25.0) {
			System.out.println(name +"님의 신장 "+ height+", 몸무게 "+weight+", 비만입니다.");
		}else {
			System.out.println(name +"님의 신장 "+ height+", 몸무게 "+weight+", 비만이 아닙니다.");
		}
	}
	
	
	public void getObesityInfo(int weight, double avgWeight) {
		obesity = (double) (weight / avgWeight)*100;
		System.out.println(obesity);
	}
}


