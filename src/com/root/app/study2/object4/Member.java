package com.root.app.study2.object4;

public class Member {
	
	//비만관리 프로그램
	private String name;
	private int age;
	private double muge;
	private double ki;
	
//	Data를 변수에 넣는 메서드 set변수명	: setter 메서드
//	Data를 외부로 보내는 메서드 get변수명	: getter 메서드
	
	
	
	public void setMuge(double muge) {
		if(muge > 30 && muge <= 150) {
			this.muge = muge;			
		}
	}
	
	public double getMuge() {
		
		return this.muge;
	}
	
	public void setKi(double ki) {
		this.ki = ki;
	}
	
	public double getKi() {
		return this.ki;
	}

}
