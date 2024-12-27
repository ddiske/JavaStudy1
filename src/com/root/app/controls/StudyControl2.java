package com.root.app.controls;

import java.util.Scanner;

public class StudyControl2 {
	
	/**
	 * if ~ else 둘 중 하나를 선택
	 * 
	 * if(조건식) {
	 * 		조건식이 true 일 때만 실행
	 * }else {
	 * 		조건식이 false 일 때 실행
	 * }
	 */
	
	public static void main(String[] args) {
		//sysout + ctrl + space
		System.out.println("프로그램 시작");
		
		int num = -5;
		int age = 0;
		
		if(num > 0) {
			num++;
			age = 20;//지역변수
			age++;
		}else {
			System.out.println("음수 입니다");
		}
		
		System.out.println(num);
		System.out.println(age);
		
		//---------------------------------------
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		
		System.out.println("ID를 입력하세요");
		int yid = sc.nextInt();
		
		System.out.println("PASSWORD를 입력하세요");
		int ypw = sc.nextInt();
		
		if(yid == id) {
			if (ypw == pw) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		}else {
			System.out.println("실패");
		}
		
		//-----------------------------------
		
		if(id==yid && pw == ypw) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}

		
		
		System.out.println("프로그램 종료");

	}

}
