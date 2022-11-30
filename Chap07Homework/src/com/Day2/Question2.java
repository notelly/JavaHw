package com.Day2;

public class Question2 {

	public static void main(String[] args) {
		Human human = new StandardWeightInfo();
		
		human.name = "홍길동";
		human.height = 168;
		human.weight = 45;
		
		StandardWeightInfo child = (StandardWeightInfo) human;
		
		child.getStandardWeight(human.height);
		child.getInfomation();
		
		human = new ObesityWeightInfo();
		
		human.name = "박둘이";
		human.height = 168;
		human.weight = 90;
		
		
		ObesityWeightInfo child1 = (ObesityWeightInfo) human;
		
		child1.getStandardWeight(human.height);
		child1.getObesityInfo(human.weight, child1.avgWeight);
		child1.getInfomation(child1.avgWeight, child1.obesity);
		
		
		
	}

}
