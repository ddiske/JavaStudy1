package com.root.app;

import java.util.Scanner;

public class Study6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//편의점 자동 계산
		//물건의 총 합계금액 입력
		//25300
		//낸돈 50000
		//거스름돈 24700
		//만원 2, 천원 4, 백원 7
		
		int sum = 25300;
		int don = 50000;
		int jandon = don - sum;
		int m = jandon / 10000;
		int t = (jandon-10000*m) / 1000; //jandon % 10000 / 1000
		int h = (jandon-10000*m-1000*t) / 100; //jandon % 1000 / 100
		System.out.println(jandon);
		System.out.println(m);
		System.out.println(t);
		System.out.println(h);
		
		
		
		int total = 0;
		int pay = 0;
		int change = 0;
		int man = 0;
		int cheon = 0;
		int baek = 0;
		
		System.out.println("합계금액");
		total = sc.nextInt();
		
		System.out.println("지불");
		pay = sc.nextInt();
		
		change = pay - total;
		
		System.out.println("거스름돈");
		System.out.println(change);
		
		man = change / 10000;
		cheon = change % 10000 / 1000;
		baek = change % 1000 / 100;
		
		System.out.println(man);
		System.out.println(cheon);
		System.out.println(baek);
		
		
		
		
		
	}

}
