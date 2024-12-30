package com.root.app.study1.array;

import java.util.Scanner;

public class ArrayStudy2 {
	
	

	public static void main(String[] args) {
		//한 반에서 국어시험의 결과를 저장
		//학생 수는 N명
		//학생 수를 입력 받아서 시작
		//국어의 총점과 평균을 계산
		
//		int [] score = new int[4];
//		String [] students = new String[score.length];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < score.length; i++) {
//			System.out.println("이름을 입력하세요");
//			students[i] = sc.next();
//		}
//		
//		for(int i = 0; i < score.length; i++) {
//			System.out.println(students[i] + "의 점수를 입력하세요");
//			score[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < score.length; i++) {
//			System.out.println(students[i] + "의 점수는 " + score[i]);
//		}
//		
//		int sum = score[0] + score[1] + score[2] + score[3];//for(int i = 0; i < score.length; i++) { sum = sum + score[i]; }
//		double avg = (double)sum / score.length;
//		
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int [] kors = new int [count];
		
		
		for(int i = 0; i < kors.length; i++) {
			
			kors [i] = sc.nextInt();
		}
		
		int total = 0;
		for(int i = 0; i < kors.length; i++) {
			total = total + kors[i];
		}
		
		double avg = (double)total / kors.length;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		for(int i = 0; i < kors.length; i++) {
			
			System.out.println(kors[i]);
		}

	}

}
