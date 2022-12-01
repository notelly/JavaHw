package com.yedam.homwork;

import java.util.Scanner;

public class Homework1123 {
	public static void main(String[] args) {
		

	//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
	//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		int index = 0;
		for(int i = 0; i <arr1.length; i++) {
			if(arr1[i] == 60){
				index = i;
			}
		}
		System.out.println("값이 60인 곳의 인덱스는 : " + index + "입니다.");
		
		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		int index2 = 0;
		for(int i = 0; i <arr1.length; i++) {
			if(arr1[i] != 3) {
				index2 = i;
				System.out.println(arr1[i]+ "의 인덱스 값은" + index2 + "입니다.");		
			}
		}
		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("변경하고 싶은 값의 인덱스 번호를 입력하시오.");
		int index3 = Integer.parseInt(sc.nextLine());
		arr1[index3] = 1000;
		for(int i = 0; i <arr1.length; i++) {
			System.out.println("arr1["+ i + "] >"+arr1[i]);
		}
		
		//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int max = 0;
		int min = arr1[0];
		for(int arr : arr1) {
			if(max < arr) {
				max = arr;
			}
			if(min > arr) {
				min = arr;
			}
		}
		System.out.println("최대값은 : " + max +"입니다.");
		System.out.println("최소값은 : " + min +"입니다.");
		
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		
		int[] integer = new int[10];
		for (int i = 0; i < integer.length; i++) {
			integer[i] = (int)(Math.random()*100)+1;
//			System.out.println(integer[i]);
			if((integer[i])%3 == 0) {
			 System.out.println(integer[i] + "은 3의 배수 입니다.");
			}
		}
		
		//추가문제
		//- Lotto 생성
		//1) 1~45 사이의 수를 랜덤으로 추출합니다.
		//2) 랜덤으로 추출한 번호는 중복이 되선 안됩니다. 중복되면 돌아가서 다시 뽑기
		//3) 번호는 6개만 추출합니다.
		
		int [] number = new int [6];
		System.out.println("로또번호는 아래와 같습니다.");
		for(int i = 0; i< number.length; i++) {
			for(int j = 0; j<=i; j++) { //가장 처음 i = 0; j = 0; 이면 i<j가 성립되지 못하므로 j <= i가 성립해야한다.
				number[i] = (int)(Math.random()*44)+1;
				if(number[i] == number[j]){
					break;
				}
			}
			System.out.println(number[i]);
		}
		
		
	}
}
