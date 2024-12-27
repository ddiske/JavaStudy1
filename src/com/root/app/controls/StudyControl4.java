package com.root.app.controls;

public class StudyControl4 {
	
	/**
	 * 여러개 중 하나 선택
	 * 
	 * switch case
	 * 
	 * switch(정수식 또는 문자열){
	 * 		case 정수 또는 문자열:
	 * 		break;
	 * 
	 * 		case 정수 또는 문자열:
	 * 		break;
	 * 		...
	 * 
	 * 		default:
	 * }
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//A, B, C, D, F
		int avg = 100;  
		
		switch(avg / 10) {
		case 1 : 
			//정수식의 결과물이 1 일때 실행
			break;
		case 2 : 
			//정수식의 결과물이 2 일때 실행
			break;
		case 30 :
			//정수식의 결과물이 30 일때 실행
			break;
			
		case 10 :
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			
		default :
			//정수식의 결과가 case와 일치하지 않은 경우
			System.out.println("F");
		
		}
		
		
		System.out.println("프로그램 종료");
	}

}
