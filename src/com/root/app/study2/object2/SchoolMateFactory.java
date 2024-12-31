package com.root.app.study2.object2;

import java.util.Scanner;

public class SchoolMateFactory {
	
	//make
	//SchoolMate 객체 생성
	//모든 정보를 입력 받아서 대입
	public SchoolMate [] make(SchoolMate [] schoolMates) {
		Scanner sc = new Scanner(System.in);
		
		SchoolMate schoolMate = new SchoolMate();
		
		System.out.println("이름 입력");
		schoolMate.name = sc.next();
		
		System.out.println("번호 입력");
		schoolMate.num = sc.nextInt();
		
		System.out.println("국어점수 입력");
		schoolMate.kor = sc.nextInt();
		
		System.out.println("영어점수 입력");
		schoolMate.eng = sc.nextInt();
		
		System.out.println("수학점수 입력");
		schoolMate.math = sc.nextInt();
		
		schoolMate.total = schoolMate.kor + schoolMate.eng + schoolMate.math;
		System.out.println("총점 : " + schoolMate.total);
		
		schoolMate.avg = (schoolMate.kor + schoolMate.eng + schoolMate.math)/3.0;
		System.out.println("평균 : " + schoolMate.avg);
		
		//1. +1된 새로운 배열 생성
		SchoolMate [] copy = new SchoolMate[schoolMates.length+1];

		//2. 기존의 값을 새로운 배열에 저장
		for(int i = 0; i < schoolMates.length; i++) {
			copy[i] = schoolMates[i];
		}
		
		//3. 마지막 index 새로 만든 schoolmate 대입
		copy[schoolMates.length] = schoolMate;
		
		
		
		
		return copy;
	}
	

}
