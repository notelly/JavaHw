package com.yedam.homwork;

import java.util.Scanner;

public class Receipt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		
		
		Info[] arrys;
		int sum = 0;
		
		System.out.println("영수증 총 금액 입력 >");
		int total = Integer.parseInt(sc.nextLine());
		System.out.println("구매한 물품의 총 갯수 입력 >");
		int mount = Integer.parseInt(sc.nextLine());
		arrys = new Info[mount];
		for(int i = 0; i < arrys.length; i++) {
			Info info = new Info();
			System.out.println("구매한 물품의 이름, 가격과 갯수를 입력하세요.");
			System.out.println("상품 이름 >");
			info.name = sc.nextLine();
			
			System.out.println("상품 가격 >");
			info.price = Integer.parseInt(sc.nextLine());
			
			System.out.println("상품 갯수 >");
			info.number = Integer.parseInt(sc.nextLine());
			
			arrys[i] = info;
		}
		for(int i = 0; i < arrys.length; i++) {
			sum += (arrys[i].price * arrys[i].number);
			System.out.println("상품 이름 : " + arrys[i].name);
			System.out.println("상품 가격 : " + arrys[i].price);
			System.out.println("상품 갯수 : " + arrys[i].number);
			System.out.println("=====================");
		}

		if (total == sum) {
			System.out.println("yes");
		}else if (total != sum) {
			System.out.println("no");
		}
	}
}
