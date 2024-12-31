package com.root.app.study2.object1;

public class ObjectMain {
	
	

	public static void main(String[] args) {
		// OOP 기초
		// 객체 생성
		// 변수 선언과 같음
		// 클래스는 데이터 타입입니다. (사용자가 만드는 복합타입)
		// 데이터타입 변수명
		// Reference, 지역변수, 참조변수
		
		Student st = new Student();
		st.name = "winter";
		st.num = 1;
		
		Teacher t1 = new Teacher();
		t1.name = "spring";
		t1.kind = "math";
		
		//
		Student [] students = new Student[5];
		students[0] = st;
		System.out.println(students[0].name);
		
		for(int i = 0 ; i < 5; i++) {
			students[i] = new Student();
		}
		
		t1.students = students;
		
		
		System.out.println(t1.name);
		System.out.println(t1.students[0].name);
		
//		Student st2 = new Student();
//		st2.name = "iu";
//		st2.num = 2;
//		
//		st = st2;
//		st.name = "철수";
//		
//		
//		System.out.println(st.eng);
//		System.out.println(st.name);
//		
//		
//		
//		Monster m1 = new Monster();
//		m1.name = "슬라임";
//		m1.level = 1;
//		m1.atp = 1;
//		m1.hp = 10;
//		m1.exp = 1;
//		m1.gold = 1;
//		
//		Monster m2 = new Monster();
//		m2.name = "고블린";
//		m2.level = 2;
//		m2.atp = 3;
//		m2.hp = 8;
//		m2.exp = 2;
//		m2.gold = 2;
		
		
		

	}

}
