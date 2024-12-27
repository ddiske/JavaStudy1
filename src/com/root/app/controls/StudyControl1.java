package com.root.app.controls;

import java.util.Scanner;

public class StudyControl1 {
	/**
	 * 제어문
	 * if - 만일 ~면
	 * 1) 단일 if
	 * 
	 * 	  if(조건식) {
	 * 		조건식이 true일때만 실행
	 * }
	 * 
	 */
	
	
	public static void main(String[] args) {
		int num = 5;
		
		if(num % 2 == 0) {
			System.out.println("Num : " + num);
		}
		
		System.out.println("프로그램 종료");
		
		Scanner sc = new Scanner(System.in);
		// 국어, 영어, 수학 점수를 입력 받아서
		// 총점과 평균을 계산 후에 90점 이상이면 우수상 수상 출력
		
		
		
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		// kor의 범위가 0이상 100이하가 아니라면 에러 출력
		if(kor<0||kor>100) {
			System.out.println("에러");
		}
		
		
		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = (double)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		if(avg >= 60) {
			if(avg >= 90) {
				System.out.println("우수");
			}
			System.out.println("통과");
		}
		
		System.out.println("프로그램 종료");
		
		//평균이 90점 이상이면 A 출력
		//평균이 80점 이상이면 B 출력
		//평균이 70점 이상이면 C 출력
		//평균이 60점 이상이면 D 출력
		//그 외 F 출력
		
		if(avg < 60) {
			System.out.println("F");
		}
			
		if(avg < 70 && avg >= 60) {
			System.out.println("D");
		}
				
		if(avg < 80 && avg >= 70) {
			System.out.println("C");
		}
					
		if (avg < 90 && avg >= 80) {
			System.out.println("B");
		}
						
		if (avg >= 90) {
			System.out.println("A");
		}
		
	}

}
