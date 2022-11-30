package com.week2;

import java.util.Scanner;

public class Homework1130 {
	public static void main(String[] args) {

		// 1. 문자열 뒤집기

		String str = "123456789";
		String str2 = "";
		
		// -> 987654321
		for (int i = 8; i >= 0; i--) {
			str2 += str.substring(i, i+1);
			//System.out.println(str2);
		}
			System.out.println(str2);
		
			//String str1 = birth.substring(0, 2);

		// 2. 세 개의 임의 단어 3개 중에 가장 짧은 단어와 길이 출력하기.
		String word1 = "아이스크림";
		String word2 = "망고";
		String word3 = "후르츠";
		String shortestWord;

		if (word1.length() < word2.length()) {
			if (word1.length() < word3.length()) {
				shortestWord = word1;
			} else {
				shortestWord = word3;
			}
		} else {
			if (word2.length() < word3.length()) {
				shortestWord = word2;
			} else {
				shortestWord = word3;
			}
		}
		System.out.println(shortestWord);

		//3. ID와 비밀번호를 입력 받아 ID가 3글자 보다 크고  비밀번호가 8글자 이상
		//사용할 수 있는 ID와 PW입니다. 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		/*String id;
		String pw;
		
		System.out.println("아이디를 입력하세요. >");
		id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요. >");
		pw = sc.nextLine();
		
		if(id.length() > 3 && pw.length() > 8) {
			System.out.println("사용할 수 있는 아이디와 패스워드입니다.");
		}else {
			System.out.println("사용할 수 없는 아이디와 패스워드입니다.");
		}*/
		
		//4. 생년월일 입력 후 나이 출력하기 (220101 -> 2022년생, 230202 -> 1923년생)
		/*System.out.println("생년월일을 입력하세요. >");
		String birth = sc.nextLine();
		String str1 = birth.substring(0, 2);
		System.out.println(str1);
		
		int num = Integer.parseInt(str1);
		int result; 
		
		System.out.println(num);
		if (num >=00 && num < 23) {
			result = 2022-(2000+num);
		}else {
			result = 2022-(1900+num);
		}
		System.out.println(result);*/
		
//		#모든 문자열은 소문자로 받아서 진행 한다.

//		 1) 문자열 개수 세기
//		-> 입력 문자열에서 알파벳, 숫자, 공백의 개수를 구하시오.
//		예시) 
//		-> 입력 : 1a2b3c4d 5e
//		-> 출력 : 문자 :5개, 숫자:5개, 공백 : 1개
		
		String alpha = "1a2b3c4d 5e";
		alpha = alpha.toLowerCase();
		String a;
		int[] print = new int[3];
		for (int i = 0; i < alpha.length(); i++) {
			a = alpha.substring(i, i+1);
			System.out.println(a);
			if (a.indexOf("abcdefghijklmnopqrstuvwxyz") != -1) {
				print[0] += 1; 
			}else if (a.indexOf("123456789") != -1) {
				print[1] += 1;
			}else if (a.indexOf(" ") != -1) {
				print[2] += 1;
			}
		}
		System.out.println("문자 : "+ print[0] + "개 " );
		
		
		
		
		
//
//		//2) 중복되는 문자가 없는 문자열에서 두 문자사이의 거리 구하기
//		조건 : 입력되는 두 문자를 제외한 가운데 문자의 갯수를 두 문자간 거리로 한다.
//		예시)
//		-> 입력 : "abcdefghijklmnopqrstuvwxyz"
//		-----------------------------------
//		-> 입력 : 첫번째 문자 : c
//		-> 입력 : 두번째 문자 : f
//		-> 출력 : 두 문자간의 거리 : 2
//		------------------------------------
//		-> 입력 : 첫번째 문자 : e
//		-> 입력 : 두번째 문자 : a
//		-> 출력 : 두 문자간의 거리 : 3
//
//		//3) 중복문자 제거
//		입력 : aaabbccceedddd
//		출력 : abcd
		
		
		
	}
}
