package com.root.app.controls;

import java.util.Scanner;

public class StudyLoop9 {
	
	/**
	 * MMOPRG
	 * 
	 * 레벨 1 - 15레벨
	 * 몬스터의 경험치가 동일
	 * 1 -> 2 	: 3
	 * 2 -> 3 	: 6
	 * 3 -> 4 	: 9
	 * 4 -> 5 	: 12
	 * ...
	 * 14 -> 15 : 42
	 * 
	 * Gold : 0
	 * 레벨이 5 달성 시 1000G
	 * 레벨이 10 달성 시 2000G
	 * 레벨이 15 달성 시 3000G
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램 시작");
		
//		boolean login = true;
//		int lv = 1;
//		int exp = 0;
//		int gold = 0;
//		int nexp = lv * 3;
//		
//		
//		
//		while(login) {
//			System.out.println("1.사냥하러가기 2.게임종료");
//			int select = sc.nextInt();
//			
//			if(select == 1) {
//				for(lv = 1; lv < 15; lv++) {
//					nexp = lv * 3;
//
//					for(exp = 1; exp < nexp + 1; exp++) {
//						System.out.println(exp + "경험치 획득");
//						if(exp == nexp) {
//							System.out.println(lv + 1 + "레벨 달성");
//						}
//						
//					}
//					if(lv == 5) {
//						gold = gold + 1000;
//						System.out.println(gold + "골드를 획득");
//					}else if(lv == 10) {
//						gold = gold + 2000;
//						System.out.println(gold + "골드를 획득");
//					}else if(lv == 15) {
//						gold = gold + 3000;
//						System.out.println(gold + "골드를 획득");
//					}
//				}
//				
//				
//			}else if( select == 2) {
//				System.out.println("게임 종료");
//			}else {
//				System.out.println("다시 입력하세요");
//			}
//		}
		
		int level = 1;
		int gold = 0;
		
		for(level = 1; level < 15; level++) {
			System.out.println("1.사냥 2.종료");
			int select = sc.nextInt();
			if(select != 1) {
				break;
			}
			
			for(int mon = 0; mon < level*3; mon++) {
				System.out.println(mon+1 + "마리 사냥 성공");
			}
			
			System.out.println("축 레벨업!!");
			
			if((level+1) % 5 == 0) {
				gold = gold + (level+1)/5*1000;
			}
		}
		
		System.out.println("현재 레벨 : " + level);
		System.out.println("현재 골드 : " + gold);
		

		

	}
}

