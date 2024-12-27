package com.root.app.controls;

import java.util.Scanner;

public class StudyLoop8 {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		//1.로그인 시도 2.프로그램 종료
		System.out.println("프로그램 시작");
		boolean flag = true;
		
		
		while(flag) {
			System.out.println("1.로그인 2.프로그램 종료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("ID를 입력하세요");
				int yid = sc.nextInt();
				System.out.println("PASSWORD를 입력하세요");
				int ypw = sc.nextInt();
				if(id == yid && pw == ypw) {
					System.out.println("로그인 성공");
					flag = !flag;
				}else {
					System.out.println("로그인 실패");
				}
			}else if(select == 2) {
				System.out.println("프로그램을 종료합니다");
				flag = !flag;
			}
		}
		
		
		
		
	}

}
