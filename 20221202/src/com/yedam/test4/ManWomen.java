package com.yedam.test4;

public class ManWomen {
	public static void main(String[] args) {
		
		String[] arr = {"010102-4" , "991012-1", "960304-1", "880112-2", "040403-3"};
		
		int[] manWomen = new int[2];
		
		for(int i = 0; i < arr.length; i++) {
			int sNum = Integer.parseInt(arr[i].substring(7));
			switch (sNum) {
			case 1:
			case 3:
				manWomen[0] += 1;
				break;
			case 2:
			case 4:
				manWomen[1] += 1;
				break;
			default:
				break;
			}
			
		}
		System.out.println("남 " + manWomen[0] + " 여 " + manWomen[1]);
		
	}
}
