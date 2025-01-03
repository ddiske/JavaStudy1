package com.root.app.Himart;

public class Computer extends Electronics {
	
	private String cpu;
	
	public Computer() {
		this.setPrice(200);
		
		this.setBrand("Samsung");
		this.setCpu("Intel");
	}
	
	

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	@Override
	public void info() {
		super.info();
		System.out.print(this.cpu + "\n");
		
	}


}
