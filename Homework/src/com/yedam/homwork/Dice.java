package com.yedam.homwork;

public class Dice {
	public static void main(String[] args) {
		int sameNum = 0;
		int[] num = new int[3];
		int max = 0;
		int result = 0;
		for(int i = 0; i < 3; i ++) {
			int dice = (int)(Math.random()*5)+1;
			num[i] = dice;
			System.out.println(num[i]);
			}		
//		if (num[0] == num[1] && num[1] == num[2] && num[2] == num[0]) {
//			System.out.println(10000+(num[0]*1000));
//		}else if (num[0] != num[1] && num[1] != num[2] && num[2] != num[0]) {
//			for (int i = 0; i <3; i++) {
//				if(max < num[i]) {
//					max = num[i];
//				}
//			}
//			System.out.println(max *100);
//		}else if (num[0] == num[1] ? (num[0] == num [1]) : ()(num[1] == num [2])) {
//			System.out.println(num[i]);
//			sameNum = num[i];
			
			for(int i = 0; i <3; i++) {
				for(int j = 0; j <3; j++) {
					for(int k = 0; k <3; k++) {
						if(num[i] == num[j] && num[i] == num[k]) {
							result = 10000+(num[0]*1000);
						}else if (num[i] == num[j] && num[i] != num[k]){
							result = 1000 + (num[i]*100);
						}else if (num[i] != num[j] && num[i] != num[k]) {
							for (int a = 0; a <3; a++) {
								if(max < num[i]) {
									max = num[i];
								}
							result = (max*100);
						}
					}
				}
			}
		}
		System.out.println(result);
		
		
		
	}
}
