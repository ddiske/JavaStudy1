package com.root.app.Himart;

public abstract class Electronics {
	
	private int price;
	private int point;
	private String brand;
	
	
	
//	public abstract void info();
	
	public void info() {
		System.out.print(this.price + "\t");
		System.out.print(this.point + "\t");
		System.out.print(this.brand + "\t");
	}
	
	public Electronics() {
		
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		this.point = price / 100;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	

}
