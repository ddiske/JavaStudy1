package com.root.app.controls;

import java.util.Scanner;

public class StudyLoop7 {
	
	/**
	 * while(조건식) {
	 * 	조건식이 true 일때 실행
	 * }
	 * 
	 * 
	 * 반복횟수가 정해져 있다면 for
	 * 정해져 있지 않다면 while
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1.정보입력 2.정보수정 3.정보출력 4.프로그램종료
		
		boolean exit = true;
		
		while(exit) {
			System.out.println("1.정보입력 2.정보수정 3.정보출력 4.프로그램종료");
			int i = sc.nextInt();
			
//			if(i == 1) {
//				System.out.println("정보입력 코드 생성");
//			}else if(i == 2) {
//				System.out.println("정보수정 코드 생성");
//			}else if(i == 3) {
//				System.out.println("정보출력 코드 생성");
//			}else if(i == 4) {
//				System.out.println("프로그램을 종료합니다");
//				exit = !exit;
//			}else {
//				System.out.println("다시 입력하세요");
//			}
			
			switch(i) {
			case 1 : System.out.println("정보입력 코드 생성");
				break;
			case 2 : System.out.println("정보수정 코드 생성");
				break;
			case 4 : System.out.println("프로그램을 종료합니다");
				exit = !exit;
				break;
			default : System.out.println("다시 입력하세요");
				break;
			}
			
		}
		
		
		
	}

}
