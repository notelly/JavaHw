package com.week1;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int[] number = new int[6];
		System.out.println("로또번호는 아래와 같습니다.");
		for(int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random()*44)+1;
			System.out.println(i + "숫자" + number[i]);
			for(int j = 0; j<i; j++) {
				System.out.println(number[i] + "=" + number[j]);
				if(number[i] == number[j]) {
					i--;
					break;
				}
			}
			System.out.println("최종 " + number[i]);
		}
		System.out.println(Arrays.toString(number));
	}
}
