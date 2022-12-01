package com.week2;

public class Homework1128 {
	public static void main(String[] args) {
		// [1번 문제]
		// 369게임
		// 3, 6, 9가 포함 되어있으면 짝으로 표기한다.
		// 아래 내용처럼 출력하면 되고, 출력 범위는 1~50으로 한다.

		// ※ 사칙연산을 활용해서 풀어볼 것.

		// 출력 예시) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝...
		// ================================================================================================
		for (int i = 1; i <= 50; i++) {
			if (i%3 == 0) {
				System.out.print("짝 ");
			}else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		// [2번 문제]
		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
		// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라

			int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
			int[] counter = new int[4];
			
	
			for (int i = 0; i < answer.length; i++) {
//				/* 해당 부분 코딩 */
				if (answer[i] == 1) {
					counter[0] +=1;
				}else if (answer[i] == 2) {
					counter[1] +=1;
				}else if (answer[i] == 3) {
					counter[2] +=1;
				}else if (answer[i] == 4) {
					counter[3] +=1;
				}
			}
			for (int i = 0; i < counter.length; i++) {
//				/* 해당 부분 코딩 */
				String star = "";
				for (int j = 0; j < counter[i]; j++) {
					star += "*";
				}
				System.out.println((i+1)+"의 " + star);					
			}
		
		// ================================================================================================
	// [3번 문제]
		// 거스름돈 갯수 파악
		// 큰 금액의 돈을 입력 후, 동전으로 바꾸었을 때 몇개의 동전이 필요한지
		// 배열을 활용해서 구현해 본다.
		// 큰 금액부터 동전을 우선적으로 거슬러 줘야한다.
			int[] coinUnit = new int[4];
	
			int money = 2680;
			int changes = 0;
			int num = 0;
			System.out.println("money=" + money);
	
			for (int i = 0; i < coinUnit.length; i++) {
				/* 해당 부분 코딩 */
				if(money > 500) {
					num = money/500;
					changes = money%500;
				}else if (money > 100) {
					num = money/100;
					changes = money%100;
				}else if (money > 50) {
					num = money/50;
					changes = money%50;
				}else if (money > 10) {
					num = money/10;
					changes = money%10;
				}
				coinUnit[i] = num;
				//System.out.println(changes);
				money = changes;
				System.out.println(coinUnit[i]);
			}
			System.out.println("500원 : "+ coinUnit[0]+"개 100원 : "+ coinUnit[1]+"개 50원 : "+ coinUnit[2]+"개 10원 : "+ coinUnit[3]+"개");
		}
		
}
