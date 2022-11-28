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
		
		Human human1 = new ObesityWeightInfo();
		
		human1.name = "박둘이";
		human1.height = 168;
		human1.weight = 90;
		
		
		ObesityWeightInfo child1 = (ObesityWeightInfo) human1;
		
		child1.getStandardWeight(human1.height);
		child1.getObesityInfo(human1.weight, child1.avgWeight);
		child1.getInfomation(child1.avgWeight, child1.obesity);
		
		
		
	}

}
