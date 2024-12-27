package com.root.app;

import java.util.Scanner;

public class Study7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		// 2 -> 2
		// 5 -> 11
		// 6 -> 12
		// 10 -> 22
		// 1 -> 1
		// 100 -> 250
		// 7 -> 13
		// 8 -> 20
		// 4 -> 10
		
		int num = 0;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		int result = num / 4 * 10 + num % 4;
		int result2 = num + num / 4 * 6;
		
		System.out.println(result);
		System.out.println(result2);
		
		
	}

}
