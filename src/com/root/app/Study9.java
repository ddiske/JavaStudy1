package com.root.app;

import java.util.Scanner;

public class Study9 {
	/**
	 * 비교 연산자(관계연산자)
	 * 결과물은 boolean
	 * a>b, a>=b, a<b, a<=b, a==b, a!=b
	 * 
	 * ==, != PrimitiveType Ok, ReferenceType은 안전하지 않음
	 * 
	 * 논리 연산자
	 * boolean type 끼리 연산 : 결과물은 boolean
	 * && : and
	 * || : or
	 * !  : 부정(반대, 단항연산자)
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 30;
		int b = 20;
		boolean ret = a > b;
		
		System.out.println(ret);
		
		b = 30;
		System.out.println(a==b);
		
		String name = "iu";
		String name2 = "iu";
		System.out.println(name==name2);
		System.out.println("이름을 입력하세요");
		String name3 = sc.next();
		System.out.println(name==name3);
		
	}

}
