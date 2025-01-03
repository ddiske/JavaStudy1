package com.root.app.Himart;

public class HimartMain {

	public static void main(String[] args) {
		
//		Tv		: 가격 포인트 브랜드 화질 크기	- 각 멤버의 값을 출력하는 메서드
//		Computer: 가격 포인트 브랜드 cpu		- 각 멤버의 값을 출력하는 메서드
//		Washer	: 가격 포인트 브랜드 용량 종류	- 각 멤버의 값을 출력하는 메서드
		
			Tv tv = new Tv();
			Computer com = new Computer();
			Washer ws = new Washer();
			Customer customer = new Customer();
			
			tv.info();
			com.info();
			ws.info();

			customer.info();
			
			customer.buy(tv);
			System.out.println("================");
			customer.buy(ws);
			System.out.println("================");
			customer.buy(com);
			
			
			
			
			System.out.println("===============");
			
			
			
			customer = new Customer();
			
			Electronics [] els = new Electronics[2];
			els[0] = tv;
			els[1] = com;
			
			customer.buy(els);
	}
		

}
