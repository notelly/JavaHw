package com.Day2;

public class Human {
	//필드
		String name;
		int height;
		int weight;
		double avgWeight;
		double obesity;
		//생성자
		public Human(){
			
		}
		
		/*public Human(String name, int height, int weight, double avgWeight, double obesity) {
			this.name =name;
			this.height = height;
			this.weight =weight;
			this.avgWeight =avgWeight;
			this.obesity = obesity;
		*/
		
		//메소드
		public void getInfomation() {
			System.out.println(name +"님의 신장 "+ height+", 몸무게 "+weight+"입니다.");

		}
}
