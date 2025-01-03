package com.root.app;

import com.root.app.students.HighStudent;
import com.root.app.students.MiddleStudent;
import com.root.app.students.Student;

public class AppMain {

	public static void main(String[] args) {
		
//		MiddleStudent IS A Student (O, X)
//		MiddleStudent 타입은 Student 타입이다 (O, X)
		
		
		MiddleStudent ms = new MiddleStudent();
		HighStudent hs = new HighStudent();
		
		ms.setHistory(60);
		
		
		Student st = ms;
		
		
		ms = (MiddleStudent)st;
		
		System.out.println(ms.getHistory());
		
		st = new Student("test");
		
		ms = (MiddleStudent)st;
		
//		
		
		ms = new MiddleStudent();
		hs = new HighStudent();
		
		Student [] students = new Student[2];
		students[0] = ms;
		students[1] = hs;
		
		ms = (MiddleStudent)students[0];
		hs = (HighStudent)students[1];

	}

}
