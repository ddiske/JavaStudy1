package com.root.app.study2.modifier;

public class ModMain {
	
	

	public static void main(String[] args) {
		Test test = new Test();
		
		test.num1 = 20;
		Test.num3 = 1010;
		
		
		System.out.println(Test.num3);
		test.m1();
		
		Test test2 = new Test();
		System.out.println("===========");
		System.out.println(Test.num3);
		System.out.println(test2.num1);
		
		System.out.println("===========");
		Test3 t3 = Test3.getInstance();
		
		test.m1();
		
		Test2.num2 = 200;
		Test2.m2();
		
//		메서드영역에 선언된 변수 - 클래스 변수
//		스택영역에 선언된 변수 - 지역 변수
//		힙 영역에 선언된 변수 - 인스턴스 변수

	}

}
