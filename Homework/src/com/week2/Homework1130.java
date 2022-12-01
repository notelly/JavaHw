package com.week2;

import java.util.Scanner;

public class Homework1130 {
	public static void main(String[] args) {

		// 1. 문자열 뒤집기

		String str = "123456789";
		String str2 = "";
		
		// -> 987654321
		for (int i = str.length()-1; i >= 0; i--) {
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
		System.out.println(shortestWord + " : " +shortestWord.length());

		//3. ID와 비밀번호를 입력 받아 ID가 3글자 보다 크고  비밀번호가 8글자 이상
		//사용할 수 있는 ID와 PW입니다. 출력하기
		//해당아이디의 숫자 몇개, 문자 몇개, 특수문자 몇개. 3번과 숙제 1번을 섞으면 구현가능
		
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
		//계산식을 세워야한다.
		// 1.1. 00년 이후 출생한 사람의 나이 구하기 (22-00)+1
		// 1.2. 00년 이전 출생한 사람의 나이 구하기 (122-99)+1
		System.out.println("생년월일을 입력하세요. >");
		String birth = sc.nextLine();
		String str1 = birth.substring(0, 2);
		String str3 = birth.substring(2, 6);
		//System.out.println(str1);
		//System.out.println(str3);
		
		int num = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str3);
		int result; 
		
		//System.out.println(num);
		//System.out.println(num2);
		if (num >=00 && num < 23) {
			if(num2 <= 1201) {
				result = 2022-(2000+num);				
			}else {
				result = 2022-(2000+num-1);
			}
			
		}else {
			if(num2 <= 1201) {
				result = 2022-(1900+num);				
			}else {
				result = 2022-(1900+num)-1;
			}
		}
		System.out.println(result);
		
//		#모든 문자열은 소문자로 받아서 진행 한다.

//		 1) 문자열 개수 세기
//		-> 입력 문자열에서 알파벳, 숫자, 공백의 개수를 구하시오.
//		예시) 
//		-> 입력 : 1a2b3c4d 5e
//		-> 출력 : 문자 :5개, 숫자:5개, 공백 : 1개
		// 아스키코드
		
		String alpha = "1a2b3c4d 5e";
		alpha = alpha.toLowerCase();
		int[] print = new int[3];
		for (int i = 0; i < alpha.length(); i++) {
			char a = alpha.charAt(i);
			String b = alpha.substring(i);
			System.out.println(a);
			if (a >= 'a' && a <= 'z') {
				print[0] += 1; 
			}else if (a >= '0' && a <= '9') {
				print[1] += 1;
			}else if (b.indexOf(" ") != -1) {
				print[2] += 1;
			}
		}
		
		System.out.println(print[1]);
		System.out.println("문자 : "+ print[0] + "개, 숫자 : "+ print[1] + "개, 공백 : " + print[2]+ "개" );
		
		
		
		
		
//
//		//2) 중복되는 문자가 없는 문자열에서 두 문자사이의 거리 구하기
//		조건 : 입력되는 두 문자를 제외한 가운데 문자의 갯수를 두 문자간 거리로 한다.
//		예시)
//		-> 입력 : "abcdefghijklmnopqrstuvwxyz"
//		-----------------------------------
//		-> 입력 : 첫번째 문자 : c
//		-> 입력 : 두번째 문자 : f
//		-> 출력 : 두 문자간의 거리 : 2
//		각문자의 위치를 찾은 다음 큰수 - 작은수
//		------------------------------------
//		-> 입력 : 첫번째 문자 : e
//		-> 입력 : 두번째 문자 : a
//		-> 출력 : 두 문자간의 거리 : 3
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("첫번째 문자 >");
		String first = sc.nextLine();
		System.out.println("두번째 문자 >");
		String second = sc.nextLine();
		
		int firstIndex = alphabet.indexOf(first);
		int secondIndex = alphabet.indexOf(second);
		
		if (firstIndex < secondIndex) {
			System.out.println("두 문자간의 거리 : " + (secondIndex - firstIndex-1));
		}else if (firstIndex < secondIndex) {
			System.out.println("두 문자간의 거리 : " + (firstIndex - secondIndex-1));
		}
		
		//substring(,).length()-1
//
//		//3) 중복문자 제거
//		입력 : aaabbccceedddd
//		출력 : abcd
		
		//중복문자가 존재하는지에대한 여부
		String strList = "aaabbccceedddd";
		//indexOf에서 중복된 문자열이 있으면 -> 중복된 문자열 중에서 제일 첫번쨰 값.
		//반환을 해줍니다.
		//생각해보기
		//str.indexOf(chatAt(i)) == i
		
		
		
		
		
		
		
		
		
		
		
		
		//답
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < strList.length(); i++) {
			if(strList.indexOf(strList.charAt(i)) == i) {
				System.out.println(i);
				sb.append(strList.charAt(i));
			}
		}
		System.out.println(sb);
		
		
	}
}
