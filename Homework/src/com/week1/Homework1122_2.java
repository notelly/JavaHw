package com.week1;

public class Homework1122_2 {
	public static void main(String[] args) {
		// 문제4) 변수 val의 값이 양수일 경우엔 변수 값을, 아닐 경우엔 0을 담는 변수를 선언하세요. (단, 삼항연산자를 사용)
		int val = (int)(Math.random()*200)-100;
		int intResult = (val >0) ? (int)val : 0;
		//System.out.println(val);
		System.out.println(intResult);
				
		/* 문제 5) 다음과 같이 두 개의 정수가 주어졌을 경우 
		두 정수 중에서 음수가 있다면 'One of a or b is negative number'를,
		만일 그렇지 않다면 'both a and b are zero or more'를 출력하도록 구현하세요. */ 
		int a = 10;
		int b = -8;
		String strResult;
		if(a*b < 0) {
			strResult = "One of a or b is negative number";
		}else {
			if(a<0) {
				strResult = "One of a or b is negative number";
			}else {
				strResult = "both a and b are zero or more";
			}
		}
		System.out.println(strResult);
		
	}
}
