package com.root.app.study2.object3;

public class ObjectStudent {
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public void info() {
		System.out.println("info");
		//참조변수 this
		//객체가 생성할 시 만들어지는 변수
		//해당 객체의 주소가 저장되어 있는 변수
		//this는 생략 가능
		this.sum();
		System.out.println(this);
		System.out.println(this.name);
		System.out.println(num);
		
		
	}
	
	public void sum() {
		System.out.println("sum 메서드 입니다");
		//재귀함수
		//this.info();
	}

}
