package com.Day2;

public class Human {
	//상속을 받고 나서 자동 타입변환으로 두가지를 가지고 올 수 있는지. 객체 human 하나로
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
