package com.root.app.zoo;

//추상 클래스
public abstract class Animal {
	
	private String name;
	private int age;
	
	public final void info() {
		System.out.println("final");
	}
	
	//추상 메서드
	public abstract void eat();
	
	public abstract void sleep();
	public abstract void play();

}
