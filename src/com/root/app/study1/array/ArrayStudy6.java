package com.root.app.study1.array;

import java.util.Scanner;

public class ArrayStudy6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//학생 수를 입력 받음
		//학생 수 만큼 학생들의 학생이름을 입력 받고, 출력
		
		System.out.println("학생수");
		int nums = sc.nextInt();
		
		String [] names = new String [nums];
		
		for(int i = 0; i < nums; i++) {
			System.out.println("학생" + (i+1) + " 이름");
			names [i] = sc.next();
		}
		
		//학생 수 만큼 국어 점수 입력
		//입력한 이름의 국어 점수 입력, 수학 점수 입력
		//총점
		
		
		int [] kors = new int [nums];
		int [] math = new int [nums];
		int [] total = new int [nums];
		int temp = 0;
		
		for(int i = 0; i < nums; i++) {
			System.out.println(names[i] + "의 국어점수");
			kors [i] = sc.nextInt();
			System.out.println(names[i] + "의 수학점수");
			math [i] = sc.nextInt();
			total [i] = kors[i] + math[i];
		}
		
		
		//------------------------------------------------------------
		//총점 기준으로 내림차순 정렬
		for(int i = 0; i < nums - 1; i++) {
			for (int j = 0; j < nums - 1; j++) {
				if(total[j] < total[j+1]) {
					temp = total[j];
					total[j] = total[j+1];
					total[j+1] = temp;
					
					temp = kors[j];
					kors[j] = kors[j+1];
					kors[j+1] = temp;
					
					temp = math[j];
					math[j] = math[j+1];
					math[j+1] = temp;
					
					String tempname = names[j];
					names[j] = names[j+1];
					names[j+1] = tempname;
					
					
				}
				
			}
		}
		
		
		
		for(int i = 0; i < nums; i++) {
			System.out.println(names [i] + "국어점수 : " + kors[i] + " / " + "수학점수 : " + math[i] + " / " + "총점 : " + total[i]);
		}
		

	}

}
