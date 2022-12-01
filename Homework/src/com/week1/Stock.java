package com.week1;

import java.util.Scanner;

public class Stock {
		//필드
		String name;
		int price;
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
		void getInfo() {
			for(int i = 0; i<stocks.length; i++) {
				System.out.println(stocks[i].name + " : " + stocks[i].price); //잘못된 이름을 지정. 그래서 안뜬거임
			}
		}		
		
		int stockNo() {
			System.out.println("입력>");
			stockNo = Integer.parseInt(sc.nextLine());
//			System.out.println(stockNo);
			return stockNo;
		}
		
		void Arry() {
			stocks = new Stock[stockNo]; //stockNo를 계속 받아오지 못했음 왜?
//			System.out.println(stockNo);
//			System.out.println(stocks.length);
			for (int i = 0; i < stocks.length; i++) {
				Stock st = new Stock();
				
				System.out.println("상품 이름>");
				String name = sc.nextLine();
				st.name = name;
				
				System.out.println("상품 가격>");
				int price = Integer.parseInt(sc.nextLine());
				st.price = price;
				
				stocks[i] = st;
			}
		}
		
		
		int max() {
			for(int i = 0; i < stocks.length; i++) {
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
				if(stocks[i].price != max) {
					sum = sum + stocks[i].price;
				}
			}
			return sum;
		}
		
		
		
	
}
