package com.root.app.controls;

import java.util.Scanner;

public class StudyLoop2 {
	
	public static void main(String[] args) {
		//for(초기식;조건식;증감식) {}
		//0초 ~ 59초
		Scanner sc = new Scanner(System.in);
//		System.out.println("초를 입력");
//		int sec = sc.nextInt();//
//		
//
//		
//		for(int i = 0; i < 60; i++) {
//			System.out.println(i+"초");
//			if(i == sec) {
//				i = 60;
//			}
//			
//		}
		
		
		int id = 1234;
		int pw = 5678;
		//id와 pw를 입력받아서 로그인 유무를 판단
		//최대 5번의 기회
		//5번 내에서 성공하면 로그인 성공 출력 후 종료
		//5번 넘어가면 은행방문 출력 후 종료
		
//		for(int i = 0; i < 5; i++) {
//		
//		System.out.println("ID를 입력하세요");
//		int inid = sc.nextInt();
//		
//		System.out.println("PASSWORD를 입력하세요");
//		int inpw = sc.nextInt();
//		
//			if(inid == id && inpw == pw) {
//				System.out.println("로그인 성공");
//				i = 10;
//			}else if(i >= 4) {
//				System.out.println("은행방문");
//			}
		
		boolean check = true;
		
		for(int i = 0; i < 5; i++) {
		
		System.out.println("ID를 입력하세요");
		int inid = sc.nextInt();
		
		System.out.println("PASSWORD를 입력하세요");
		int inpw = sc.nextInt();
		
			if(id == inid && pw == inpw) {
				i = 10;
				check = !check;
			}else if (i < 5) {
			System.out.println("로그인 실패");
			}
		}
		
		if(check) {
			System.out.println("은행 방문");
		}else {
			System.out.println("로그인 성공");
		}
		
		
	}//main 끝

}//class 끝
