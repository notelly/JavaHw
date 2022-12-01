package com.yedam.homwork;

public class Test {
	public static void main(String[] args) {
			int[] arr = {10,20,30,40,50};
			int sum = 0;
			for(int num : arr) {
				sum = sum + num;
			}
			System.out.println(sum);
			
			int sum1 = 0;
			for (int i = 1; i <=20; i++) {
				if (i%2 != 0 && i%3 != 0) {
					sum1 = sum1 + i;
				}
			}
			System.out.println(sum1);
			
	}
}
