package com.root.app.study2.object4;



import com.root.app.study2.object3.*;


public class Object4Main1 {
	
	

	public static void main(String[] args) {
		
		Car car = new Car();
		car.info();
		ModTest modTest = new ModTest();
		modTest.num1 = 1;
		modTest.num2 = 2;
		modTest.num3 = 3;
//		modTest.num4 = 4;
		
		modTest.m1();
		modTest.m2();
		modTest.m3();
//		modTest.m4();
		
		Member m = new Member();
		m.setAge(40);
		
		System.out.println(m.getAge());

	}

}
