package com.root.app.controls;

import java.util.Random;

public class StudyControl5 {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int salt = random.nextInt(8)+1;//0~8미만의 정수 하나를 뽑자
		int ch = random.nextInt(26)+97;//
		char word = (char)ch;
		
		System.out.println(salt);
		System.out.println(word);
		
		int pw = ch + salt;
		if(pw > 122) {
			pw = pw - 26;
		}
		System.out.println((char)pw);
		
		//------------------------------------------------------
		//디코딩 코드 작성
		
		
		
	}

}
