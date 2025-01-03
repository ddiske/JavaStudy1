package com.root.app.Himart;

public class Customer {
	
	private int don = 1000;
	private int point;
	
	
	public void info() {
		System.out.println("현재금액 : " + don);
		System.out.println("현재포인트 : " + point);
	}
	
//	buy - Main에서 호출
	public void buy(Electronics el) {
		System.out.println("산다");
		this.don = this.don - el.getPrice();
		this.point = this.point + el.getPoint();
		this.info();
	}
	
	
	public void buy(Electronics [] els) {
		System.out.println("여러개 산다");
		for(int i = 0; i < els.length; i++) {
//			this.don = this.don - els[i].getPrice();
//			this.point = this.point + els[i].getPoint();
//			this.info();
			this.buy(els[i]);
		}
		
		
	}
	
	
	
	public int getDon() {
		return don;
	}
	public void setDon(int don) {
		this.don = don;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	

}
