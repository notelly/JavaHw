package com.yedam.homwork;

public class Homework_1121 {
	public static void main(String[] args) {
		//문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라. 
		   //출력예시) "변수명1: 변수값, 변수명2: 변수값"
		int x;
		int y;
		x = 37;
		y = 91;
		
		System.out.println("변수명1: " + x +", 변수명2: " + y);
		//문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.
		   //2.1) 91 더하기 37
		int result = y + x;
		   //2.2) 91 빼기 37
		int result2 = y - x; 
		   //2.3) 91 곱하기 37
		int result3 = y * x;
		   //2.4) 91 나누기 37
		double result4 = (double)y / x;
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		// 문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
	    //출력예시) int a = 10; 의 경우 "10, int"로 출력. */
		//3-1) byte var1 = 128;
		int var1 = 128;
		System.out.println(var1 + ", int");
		//3-2) char var2 = "B";
		char var2 = 'B';
		System.out.println(var2 + ", char");
		//3-3) String var3 = 44032;
		int var3 = 44032;
		System.out.println(var3 + ", int");
		//3-4) int var4 = 100000000000;
		long var4 = 100000000000L;
		System.out.println(var4 + ", long");
		//3-5) float var5 = 43.93106;
		double var5= 43.93106;
		System.out.println(var5 + ", double");
		//3-6) long var6 = 301.3;
		double var6= 301.3;
		System.out.println(var6 + ", double");
		
		//문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		//4-1)
		long result1 = a + c + d;
		System.out.println(result1);
		//4-2 )
		int result9 = a + b + c; //int 하면 오류남.
		System.out.println(result9);
		//4-3 )
		double e = 45.31;
		double result0 = c + d + (double)e;
		System.out.println(result0);
		
		//문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
	    //출력예시) A278번지10.0
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		System.out.println(String.valueOf(charValue) + (intValue1+intValue2) + intValue3 + strValue + (double)intValue4);
		//String.valueOf(charValue) ()안에 들어가야 적용되네
		
		//추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
	    //예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
	    //힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */
		int value = 485;
		
		int hundred = value /100;
		int ten = (value - (100*hundred)) /10;
		int one = (value - (100*hundred) - (10*ten));
		
		int intResult = hundred + ten + one;
		System.out.println(intResult); // 답이 4번 문제 옆에 붙음 해결하기
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int temp = 0;
		num1 = value%10;
		temp = value/10;
		num2 = temp%10;
		temp = temp/10;
		num3 = temp%10;
		int answer = num1 + num2 + num3;
		System.out.println(answer);
	}
}
