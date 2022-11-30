package com.Day1;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		//[1번 문제]
		/*당신은 N개의 테스트케이스들에게 반드시 인사를 해야 이 문제를 풀 수 있다.
		N개의 줄에 걸쳐
		"Hello World, Judge i!"
		를 출력하는 프로그램을 만들라. 여기서 i는 줄의 번호이다.
		예시 ) 입력 : 5 출력 : Hello World, Judge 1!*/
		Scanner sc = new Scanner(System.in);
		/*System.out.println("몇번 인사 하시겠습니까?");
		int num = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= num; i++) {
			System.out.println("Hello World, Judge " + i+"!");
		}*/	
			
		/*[2번 문제]
		사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다.
		준하는 놀람을 ??!로 표현한다.
		준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
		예시 ) 입력 : joonas  출력 : joonas??!
		      입력 : yedam   출력 : yedam은 사용할 수 있는 아이디입니다.*/
		
		/*System.out.println("아이디를 입력하세요 >");
		String id = (sc.nextLine());
		if(id.equals("joonas")){
			System.out.println(id +"??!");
		}else{
			System.out.println(id +"은(는) 사용할 수 있는 아이디 입니다.");
		}*/
		
		/*[3번 문제]
		ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다.
		공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
		불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다.
		반면, 우리나라는 서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
		예시 ) 입력 : 2541 출력 : 1998
			  입력 : 2563 출력 : 2020*/
		/*System.out.println("불기 연도를 입력하세요. >");
		int budaYear = Integer.parseInt(sc.nextLine());
		int year = budaYear - 543;
		System.out.println("불기 연도가 " + budaYear + "일 때, 서기 연도는 "+year+"입니다.");*/
		
		/*[3번 문제]
		1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 

		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
		또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
		3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		예시 ) 입력 : 3 3 6 출력 : 1300원
			  입력 : 2 2 2 출력 : 12000원
			  입력 : 6 2 5 출력 : 600원*/
		int sameNum = 0;
		int[] num = new int[3];
		int max = 0;
		for(int i = 0; i < 3; i ++) {
			int dice = (int)(Math.random()*5)+1;
			num[i] = dice;
			System.out.println(num[i]);
		}		
		if (num[0] == num[1] && num[1] == num[2] && num[2] == num[0]) {
			System.out.println(10000+(num[0]*1000));
		}else if (num[0] != num[1] && num[1] != num[2] && num[2] != num[0]) {
			for (int i = 0; i <3; i++) {
				if(max < num[i]) {
					max = num[i];
				}
			}
			System.out.println(max *100);
		}else {
			for(int i = 0; i <3; i++) {
				for(int j = 0; j <3; j++) {
					for(int k = 0; k <3; k++) {
						if(num[i] == num[j] && num[i]!= num[k]) {
							System.out.println(num[i]);
							sameNum = num[i];
						}
					}
				}
			}
			System.out.println(1000 + (sameNum*100));
		}

		
		/*[4번 문제]		
		준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다.
		그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
		영수증에 적힌, 구매한 각 물건의 가격과 개수 구매한 물건들의 총 금액을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
		예시 ) 
		입력 ↓		출력 ↓
		260000      yes
		4
		20000 5
		30000 2
		10000 6
		5000 8
		
		입력 ↓		출력 ↓
		250000		no
		4
		20000 5
		30000 2
		10000 6
		5000 8
		※ 입력에서 첫번째 줄은 총 금액, 두번째 줄은 물건 종류, 세번째부터 아래 내용은 해당 물건은 가격과 갯수를 의미함.*/
		//Info 파일 가지고 오기
		
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
