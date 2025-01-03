package com.root.app.Himart;

public class Washer extends Electronics {
	
	private int quantity;
	private String type;
	
	public Washer() {
		this.setPrice(100);
		
		this.setBrand("대우");
		this.setQuantity(20);
		this.setType("드럼");
	}
	
	
	@Override
	public void info() {
		super.info();
		System.out.print(this.quantity + "\t");
		System.out.print(this.type + "\n");
		
	}
	
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
