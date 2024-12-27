package com.root.app.controls;

import java.util.Scanner;

public class StudyLoop6 {
	/**
	 * 0분 0초
	 * 0분 1초
	 * 0분 2초
	 * ...
	 * 0분 59초
	 * 1분 0초
	 * ...
	 * 59분 59초
	 * 
	 * ?분 ?초를 입력받음
	 * ex) 1, 5
	 * 1분 5초까지 출력하고 종료
	 * 
	 */
	
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분 입력");
		int inm = sc.nextInt();
		
		System.out.println("초 입력");
		int ins = sc.nextInt();
		
		
//		for(int m = 0; m < 60; m++) {
//			for(int s = 0; s < 60; s++) {
//				System.out.println(m + "분 " + s + "초");
//				if(m == inm && s == ins) {
//					break;
//				}
//			}
//			if(m == inm) {
//				break;
//			}
//		}
		
		boolean flag = false;
		
		for(int m = 0; m < 60; m++) {
			for(int s = 0; s < 60; s++) {
				System.out.println(m + "분 " + s + "초");
				if(m == inm && s == ins) {
					flag = !flag;
					m = 60;
					break;
				}
			}
			
//			if(flag) {
//				break;
//			}
		}
			
		
		
		System.out.println("프로그램 종료");
	}

}
