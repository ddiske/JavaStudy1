package com.root.app.controls;

public class StudyControl3 {
	
	/**
	 * 여러개 중 하나를 선택
	 * if(조건식1) {
	 * 		조건식1이 true 일때 실행
	 * }else if(조건식2) {
	 * 		조건식2가 true 일때 실행
	 * }else if(조건식3) {
	 * 		조건식3이 true 일때 실행
	 * }
	 * ...
	 * }else {
	 * 		그 외 나머지
	 * }
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int avg = 55;
		String grade = "";
		
		if(avg >= 90) {
			grade = "A";
		}else if(avg >= 80) {
			grade = "B";
		}else if(avg >= 70) {
			grade = "C";
		}else if(avg >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println(grade);
		System.out.println("프로그램 종료");
	}

}
