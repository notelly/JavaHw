package com.yedam.hw;

public class Employee {
	//필드
	String name; //= "이지나";
	int payment; //= 3000;
	//생성자
	public Employee() {
		
	}
	
	public Employee(String name, int payment) {
		this.name = "이지나";
		this.payment = 3000;
	}
	
	public String getName() {
		return name;
	}
	public int getPayment() {
		return payment;
	}	
	//메소드
	public void getInfomation() {
		System.out.println(name);
		System.out.println(payment);
	}
	
	public void print() {
		System.out.println("슈퍼클래스");
	}
	
	
	
	
}
