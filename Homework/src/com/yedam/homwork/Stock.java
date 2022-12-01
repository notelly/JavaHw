package com.yedam.homwork;

import java.util.Scanner;

public class Stock {
	// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
	// -> Scanner 상품 수, 가격.
	// Scanner sc = new Scanner(System.in);
	// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
	//해당 제품을 제외한 제품들의 총 합 = 모든 제품의 합 - 최고 가격.
	// Product pd = null;
	// 2-1)최고 가격의 제품을 찾을 때 인덱스 또는 값을 따로 저장해 두고
	// 2-2) 반복문을 한번 더 돌려서 해당 제품을 제외하고(조건문) 합을 한다.
	
	// 1) 메뉴는 다음과 같이 구성하세요.
	// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
	// while(){
	// if switch 둘다 사용가능.
	// 메뉴출력
	// 메뉴를 진입할 수 있도록 조건문을 통해서 구별을 해주면 된다.
	// }
	
	// 진행순서   1번               2번
	// 2) (입력한 상품 수만큼) (상품명과 해당 가격을 입력받을 수 있도록) 구현하세요.
	// 여러개가 될 수 있다. 여러개의 객체를 담을 수 있는 그릇을 만들어 주어야함.
	// 객체를 여러개 넣을 수 있는 것 ex)배열 을 이용해야한다. -> 입력할 때 마다 배열의 크기가 바뀐다.
	// Scanner 사용해서 배열의 크기를 할당.
	// 상품 클래스를 만들 때 필드로는 상품명과 가격이 들어 가야한다.
	// 입력 -> 배열을 활용해서 반복문을 써야한다. (배열의 크기만큼 반복).
	
	// 3) 제품별 가격을 출력하세요.
	//	출력예시, "상품명 : 가격"
	// 출력 -> 반복문을 활용(배열의 크기만큼). -> 각 방에 있는 객체를 하나씩 꺼내온다.
	// 객체가 가지고 있는 필드 (정보를 담은 변수)를 가지고 와서 출력 예시에 맞게 만든다.
	
	// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
	
	// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
	// 반복문을 종료하기 직전에 프로그램 종료 한다는 System.out.println() 출력하면 됨.
	
			//필드
			String name;
			int price;
			//입력받을 상품 수와 상품 가격
			Stock[] stocks;
			int max = 0;
			int stockNo;
			int sum = 0;
			Scanner sc = new Scanner(System.in);
			String maxName;
			
			//생성자
			public Stock() {
			}
			//메소드
			
			int stockNo() {
				//1번, 상품 수
				System.out.println("상품 수 입력>");
				stockNo = Integer.parseInt(sc.nextLine());
//				System.out.println(stockNo);
				return stockNo;
			}
			
			void Arry() {
				//상품 수 입력받은 내용을 토대로 배열 크기를 확정.
				stocks = new Stock[stockNo]; // 상품의 값을 입력 받을 때 배열의 크기를 정해주는 것이 났다. 수정이 가능함.
//				System.out.println(stockNo);
//				System.out.println(stocks.length);
				for (int i = 0; i < stocks.length; i++) {
					//상품 객체 생성
					//정보를 넣은 객체를 넣는다. 새로운 객체를 만들어서 넣어야하는데 기존 정보가 있으면 안된다.
					//이걸 넣지 않을 시 똑같은 객체에서 정보만 덮어쓰기 할 뿐 추가 되지 않는다.
					Stock st = new Stock(); // ☆반복문을 실행할때 마다 새로운 상품을 만들기 위해서.☆
					System.out.println((i+1)+"번째 상품");
					System.out.println("상품 이름>");
					
					//변수의 데이터를 입력 받고 객체에 데이터를 넣는 방법.
					String name = sc.nextLine();
					st.name = name;
					//st.name = sc.nextLine(); 이라고 써도 괜찮다.
					//데이터를 입력 받음과 동시에 객체에 데이터를 넣는 방법
					
					System.out.println("상품 가격>");
					int price = Integer.parseInt(sc.nextLine());
					st.price = price;
					
					// 객체를 배열에다가 넣어준다.
					// i 값에 따른 
					stocks[i] = st;
					System.out.println("======================"); //의미 없는거
				}
			}
			
			void getInfo() {
				for(int i = 0; i<stocks.length; i++) {
					// Arry()의 st 가 stocks[i] 그러니까 stocks[i].name = st.name 이걸 꺼내오는 것.
					System.out.println("상품명 : " + stocks[i].name + ", 가격 : " + stocks[i].price +"원"); //stocks[i].name check not name
				}
			}		
			
			int max() {
				for(int i = 0; i < stocks.length; i++) {
					//제일 비싼 상품 가격 구하기
					if(max < stocks[i].price) {
						max = stocks[i].price;
					}
				}
				return max;
			}
			
			String maxName() {
				for(int i = 0; i < stocks.length; i++) {
					if(max < stocks[i].price) {
						maxName = stocks[i].name;
					}
				}
				return maxName;
			}
			
			int sum() {
				for (int i = 0; i < stocks.length; i ++) {
					//상품들의 합계 구하기.
					if(stocks[i].price != max) {
						sum = sum + stocks[i].price;
					}
				}
				return sum;
			}
}
