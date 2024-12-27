package com.root.app.controls;

import java.util.Scanner;

public class StudyLoop5 {
	
	/**
	 * FPS
	 * 총알 30
	 * 탄창 1*30
	 * 탄창 3개
	 * 
	 * 1. 단발모드 2.점사모드
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("모드를 선택하세요");
//		int mode = sc.nextInt();
//		
//		if(mode == 1) {
//			System.out.println("단발모드");
//			for(int tan = 0; tan < 3; tan++) {
//				for(int a = 0; a < 30; a++) {
//					System.out.println("탕");
//				}
//				if(tan == 2) {
//					break;
//				}
//				System.out.println("재장전");
//			}
//		
//		}
//		
//		if(mode == 2) {
//			System.out.println("점사모드");
//			for(int tan = 0; tan < 3; tan++) {
//				for(int a = 0; a < 10; a++) {
//					System.out.println("탕탕탕");
//				}
//				if(tan == 2) {
//					break;
//				}
//				System.out.println("재장전");
//			}
//		
//		}
		
//		for(int tan = 0; tan < 3; tan++) {
//			
//			System.out.println("모드를 선택하세요 (1단발 2점사)");
//			int mode = sc.nextInt();
//			if(mode == 1) {
//				System.out.println("단발모드");
//				for(int a = 0; a < 30; a++) {
//					System.out.println(a + 1 +"탕");
//				}
//				if(tan == 2) {
//					break;
//				}
//				System.out.println("재장전");
//			}else if(mode == 2) {
//				System.out.println("점사모드");
//				for(int a = 0; a < 10; a++) {
//					System.out.println(a + 1 +"탕탕탕");
//				}
//				if(tan == 2) {
//					break;
//				}
//				System.out.println("재장전");
//			}
//			
//		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println("1.단발 2.점사");
			int select = sc.nextInt();
			System.out.println(select);
			
			int count = 3;
			String sound = "타다당";
			if(select == 1) {
				count = 1;
				sound = "탕";
			}
			for(int j = 0; j < 30; j = j + count) {
				System.out.println(j + 1 + sound);
			}
			System.out.println("탄창 소비");
		}
		
		
		
		System.out.println("프로그램 종료");
	}

}
