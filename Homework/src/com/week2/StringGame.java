package com.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringGame {
	// 필드
	Scanner sc = new Scanner(System.in);

	String[] words = { "Orange", "Game", "Phone", "Smart" };
	int arrNum = (int) (Math.random() * 4);
	String word = words[arrNum];
	String lowercaseWord = word.toLowerCase();
	List<String> recordList = new ArrayList<>();

	// 생성자

	// 메소드
	public void printword() {
		System.out.println(word);
	}

	public void setCharData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for (int i = 0; i < recordList.size(); i++) {
			System.out.print(recordList.get(i));
			System.out.print(" ");
		}
		System.out.println();
		System.out.print("입력값 >>");
		char alpha = sc.next().charAt(0);
		if (lowercaseWord.indexOf(alpha) != -1) {
			System.out.println(alpha + "은 문자열을 구성하는 문자입니다.");
			recordList.add(String.valueOf(alpha));
		} else {
			System.out.println(alpha + "은 문자열을 구성하는 문자가 아닙니다.");
		}
	}

	public void setStrData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for (int i = 0; i < recordList.size(); i++) {
			System.out.print(recordList.get(i));
			System.out.print(" ");
		}
		System.out.println();
		System.out.print("입력값 >> ");
		String answer = sc.nextLine();

		if (lowercaseWord.indexOf(answer) != -1) {
			System.out.println("정답입니다.");
		} else if (lowercaseWord.indexOf(answer) == -1) {
			if (answer.length() == lowercaseWord.length()) {
				for (int i = 0; i < word.length(); i++) {
					if (lowercaseWord.substring(i, i + 1).equals(answer.substring(i, i + 1))) {
						System.out.print("O");
						System.out.print(" ");
					} else {
						System.out.print("X");
						System.out.print(" ");
					}
				}
			} else if (answer.length() != lowercaseWord.length()) {
				System.out.println("입력된 문자열의 길이가 정답과 다릅니다.");
			}
		}
	}

	public void showCharData() {
		for (int i = 0; i < recordList.size(); i++) {
			System.out.println(recordList.get(i));
		}
	}

	public void init() {
		arrNum = (int) (Math.random() * 4);
		word = words[arrNum];
		lowercaseWord = word.toLowerCase();
		recordList.clear();
		System.out.println("새로운 게임으로");

	}

}
