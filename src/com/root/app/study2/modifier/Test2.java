package com.root.app.study2.modifier;

public class Test2 {
	
	public static int num2 = 100;//Test2.num2 = 200;
	
	static {
		Test2.num2 = 30;
	}//static 초기화 블럭
	
	public static void m2() {
		System.out.println("static 메서드");
	}
	
	
	

}
