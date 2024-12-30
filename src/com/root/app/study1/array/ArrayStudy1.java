package com.root.app.study1.array;

import java.util.Scanner;

public class ArrayStudy1 {
	
	

	public static void main(String[] args) {
		//변수 선언 공식 -> 데이터타입 변수명;
		//
		int [] nums = new int [5];//int배열 타입(참조타입이며 차지하는 메모리는 무조건 4Byte)의 4Byte 공간을 확보하고 주소값을 nums라고 이름 붙이고 new(Heap 공간)에 int타입의 변수 4개, 주소값을 nums에 담다 
		double [] avgs = new double[3];

		
		//사람이름 10000명을 모을 배열
		String [] names = new String [10000];
		
		nums[0] = 20;
		nums[1]	= 30;
		nums[2]	= 40;
		nums[3] = 50;
		
		avgs[1] = 3.12;
		
		System.out.println(nums[1]);
		System.out.println(avgs[0]);//Heap 영역의 특징 : Heap 영역에 들어간 값은 초기화하지 않아도 그 데이터 타입에 맞는 초기값으로 자동초기화 됨 (지역변수는 개발자가 초기화 해줘야 함)
		System.out.println(names[0]);
		
//		for(int i = 0; i < 10000; i++) {
//			System.out.println(names[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("숫자를 입력하세요");
			nums[i] = sc.nextInt();
		}
		
		//nums를 출력
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		

	}

}
