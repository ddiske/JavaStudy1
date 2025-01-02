package com.root.app.study2.object2;

import java.util.Scanner;

public class SchoolController {
	
	//start
	public void start() {
		
		//1.학생정보입력 2.학생정보출력 3.프로그램종료
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		SchoolMateFactory sf = new SchoolMateFactory();
		SchoolMate st = null;
		SchoolMateView sv = new SchoolMateView();
		SchoolMate [] schoolMates = new SchoolMate[0];
		
		while(check) {
			System.out.println("1.입력 2.출력 3.검색 4.삭제 5.종료");
			int select = sc.nextInt();
			if(select == 1) {
				schoolMates = sf.make(schoolMates);
			}else if(select == 2) {
				sv.view(schoolMates);
			}else if(select == 3) {
				SchoolMate schoolMate = sf.find(schoolMates);
				if(schoolMate != null) {
					sv.view(schoolMate);
				}else {
					System.out.println("일치하는 학생이 없다");
				}
			}else {
				System.out.println("종료");
				break;
			}
		}
		
//		int num = 0;
//		
//		while(num == 0) {
//			System.out.println("1.입력 2.출력 3.종료");
//			num = sc.nextInt();
//			if(num == 1) {
//				System.out.println("정보를 입력하세요");
//			}else if(num == 2) {
//				System.out.println("정보를 출력합니다");
//			}else if(num == 3) {
//				System.out.println("종료합니다");
//			}else {
//				System.out.println("다시 입력해주세요");
//				num = 0;
//			}
//		}
		
		
		
	}

}
