package com.root.app;

import java.util.Scanner;

public class Study5 {
	/**
	 * 연산자
	 * 산술연산자 - 숫자 계산
	 * +, -, *, /, %(나머지값 구하는 연산자)
	 * 
	 *  + 
	 *  1) 산술연산자
	 * 	2) 연결연산자 문자열 + primitive	
	 * 
	 */
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 50;
		int num2 = num1 + 20;
		num2 = num1 + (int)1.2;
		
		System.out.println("국어 점수를 입력하세요");
		int n1 = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int n2 = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		int n3 = sc.nextInt();
		
		int sum = 0;
		double avg = 0;
		sum = n1 + n2 + n3;
		avg = (double)sum / 3;
		
		System.out.println(sum);
		System.out.println(avg);
		
		
		System.out.println("프로그램 종료");
	}

}
