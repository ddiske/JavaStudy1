package com.root.app.study2.modifier;

public class Test {
	
	int num1 = 10;
	
	public static int num3 = 1;
	
	
	public void m1() {
		System.out.println(num1);
		System.out.println(Test.num3);
		Test.m2();
	}
	
	public static void m2() {
		System.out.println(Test.num3);
//		System.out.println(num1);
//		this.m1;
	}
	

}
