package com.root.app.study2.object3;

public class Object3Main1 {

	public static void main(String[] args) {
		
		ObjectStudent student;
		student = new ObjectStudent();
		student.name = "winter";
		System.out.println(student);
		
		ObjectStudent student2 = new ObjectStudent();
		student2.name = "iu";
		
		student.info();
		student2.info();

	}

}
