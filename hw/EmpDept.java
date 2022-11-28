package com.yedam.hw;

public class EmpDept extends Employee {
	//필드
	String deptName; //= "교육부";
	//생성자
	
	public EmpDept(){
		
	}	
	public EmpDept(String name, int payment, String deptName) {
		super(name, payment);
		this.deptName = "교육부";
	}
	//메소드
	@Override
	public void getInfomation() {
		System.out.println("이름 : " + name + " 연봉 : " + payment + " 부서 : "+deptName);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}
}
