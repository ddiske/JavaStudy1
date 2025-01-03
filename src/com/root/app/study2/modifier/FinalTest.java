package com.root.app.study2.modifier;

//상속을 하지 마라(부모로 사용 금지)
public final class FinalTest {
	
	//상수로 사용(한번 들어간 값을 변경 금지)
	//소문자 camelCase
	//상수형은 모두 대문자로 사용, snake_case
	private static final int MAX_NUM = 10;
	
	public FinalTest() {
//		MAX_NUM = 10;
	}
	
	//상속에서 오버라이딩 금지
	public final void m1() {
//		this.num = 20;
	}
	
	//상수로 사용
	final int n = 2;
	
	
	

}
